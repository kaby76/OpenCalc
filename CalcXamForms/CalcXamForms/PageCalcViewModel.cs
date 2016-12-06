using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.IO;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Windows.Input;
using Antlr4.Runtime;
using Xamarin.Forms;
using Antlr4.Runtime.Tree;
using Antlr4.Runtime.Misc;
using Rg.Plugins.Popup.Extensions;

namespace CalcXamForms
{
    public class PageCalcViewModel : INotifyPropertyChanged
    {
        private static PageCalcViewModel _singleton;
        public static PageCalcViewModel Singleton(ContentPage cp = null)
        {
            if (_singleton == null) _singleton = new PageCalcViewModel(cp);
            return _singleton;
        }
        private ObservableCollection<Label> _calculation_history = new ObservableCollection<Label>();
        private Label _current_view = null;
        private string _result;
        private ContentPage _page_calc;
        private ICommand _on_tap_command = new Command(async (o) =>
        {
            Label label = o as Label;
            if (label != null)
            {
                int found = _singleton._calculation_history.IndexOf(label);
                if (found< 0)
                    return;
                else if (found > 0)
                {
                    _singleton.CurrentView = new Label() { FormattedText = label.FormattedText.Copy()};
                    _singleton._calculation_history.Insert(0, _singleton.CurrentView);
                }
                else
                {
                    _singleton.CurrentView = label;
                }
                EditorPopup page = new EditorPopup(_singleton);
                await _singleton._page_calc.Navigation.PushPopupAsync(page);
            }
        });
        public ICommand OnTap
        {
            get
            {
                return _on_tap_command;
            }
            set
            {
                _on_tap_command = value;
            }
        }
        public FormattedString Result
        {
            get
            {
                string result = _result;
                var fs = new FormattedString();

                fs.Spans.Add(
                    new Span()
                    {
                        Text = "result",
                        FontSize = 20,
                        FontAttributes = FontAttributes.Bold
                    }
                    );

                fs.Spans.Add(
                    new Span
                    {
                        Text = Environment.NewLine,
                        FontSize = 20
                    }
                    );

                fs.Spans.Add(
                    new Span
                    {
                        Text = result,
                        FontSize = 40,
                        FontAttributes = FontAttributes.Bold
                    }
                    );
                return fs;
            }
            set
            {
                NotifyPropertyChanged();
            }
        }
        private FormattedString BuildCommand(string str, int error)
        {
            string p1 = str.Substring(0, error);
            var fs = new FormattedString();
            fs.Spans.Add(
                new Span
                {
                    Text = p1,
                    FontSize = 20,
                    FontAttributes = FontAttributes.Bold
                }
                );
            string p2 = str.Substring(error, str.Length - error);
            fs.Spans.Add(
                new Span
                {
                    Text = p2,
                    ForegroundColor = Color.Red,
                    FontSize = 20,
                    FontAttributes = FontAttributes.Bold
                }
                );
            return fs;
        }
        public ObservableCollection<Label> Command
        {
            get
            {
                return _calculation_history;
            }
            set
            {
                NotifyPropertyChanged();
            }
        }
        public Label CurrentView
        {
            get
            {
                return _current_view;
            }
            set
            {
                _current_view = value;
            }
        }
        public event PropertyChangedEventHandler PropertyChanged;

        // This method is called by the Set accessor of each property.
        // The CallerMemberName attribute that is applied to the optional propertyName
        // parameter causes the property name of the caller to be substituted as an argument.
        private void NotifyPropertyChanged([CallerMemberName] String propertyName = "")
        {
            if (PropertyChanged != null)
            {
                PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
            }
        }

        public static IEnumerable<IToken> AllTokens(ITokenStream ts)
        {
            for (int i = 0; i < ts.Size; ++i) yield return ts.Get(i);
        }

        private PageCalcViewModel(ContentPage page_calc)
        {
            _page_calc = page_calc;
            CurrentView = new Label() {FormattedText = new FormattedString()};
            _calculation_history.Add(CurrentView);
        }

        private calculatorParser Parser(string plain_old_command)
        {
            byte[] byteArray = Encoding.UTF8.GetBytes(plain_old_command);
            calculatorParser pp = new calculatorParser(
                new CommonTokenStream(
                    new calculatorLexer(
                        new AntlrInputStream(
                            new StreamReader(
                                new MemoryStream(byteArray)).ReadToEnd()))));
            pp.ErrorHandler = new MyErrorStrategy();
            return pp;
        }

        private void InOperator(string op)
        {
            FormattedString fs;
            Label label = CurrentView;
            fs = label.FormattedText;
            string plain_ole_command = fs.ToString() + op;

            calculatorParser parser = Parser(plain_ole_command);
            IParseTree tree = parser.expressionResult();
            IParseTree[] all_nodes = DFSVisitor.DFS(tree as ParserRuleContext).ToArray();

            if (CheckForExceptions(plain_ole_command, parser, tree, all_nodes)) return;
            if (CheckForErrorToken(plain_ole_command, parser, tree, all_nodes)) return;
            if (CheckForResult(plain_ole_command, parser, tree, all_nodes)) return;

            _result = "Unknown.";

            label.FormattedText = BuildCommand(plain_ole_command, 0);
            _calculation_history[_calculation_history.IndexOf(CurrentView)] = label;
            NotifyPropertyChanged("Result");
            NotifyPropertyChanged("Command");
        }

        private void InDigit(string digit)
        {
            FormattedString fs;
            Label label = CurrentView;
            fs = label.FormattedText;

            StringBuilder sb = new StringBuilder(fs.ToString());
            sb.Append(digit);
            int ErrorPos = sb.Length;
            byte[] byteArray = Encoding.UTF8.GetBytes(sb.ToString());
            calculatorParser pp = new calculatorParser(
                new CommonTokenStream(
                    new calculatorLexer(
                        new AntlrInputStream(
                            new StreamReader(
                                new MemoryStream(byteArray)).ReadToEnd()))));
            IParseTree tree = pp.expressionResult();
            ITokenStream ts = pp.TokenStream;
            _result = AllTokens(ts).Reverse().Skip(1).First().Text;
            label.FormattedText = BuildCommand(sb.ToString(), ErrorPos);
            _calculation_history[_calculation_history.IndexOf(CurrentView)] = label;
            NotifyPropertyChanged("Result");
            NotifyPropertyChanged("Command");
        }

        private bool CheckForExceptions(string plain_ole_command, calculatorParser parser, IParseTree tree, IParseTree[] all_nodes)
        {
            IEnumerable<IParseTree> re_nodes_iterator = all_nodes.Where((IParseTree n) =>
            {
                ParserRuleContext nn = n as ParserRuleContext;
                if (nn == null) return false;
                return nn.exception != null;
            });
            IParseTree[] all_re_nodes = re_nodes_iterator.ToArray();
            if (all_re_nodes.Length == 0) return false;

            RecognitionException re = (all_re_nodes.First() as ParserRuleContext)?.exception;
            if (re.OffendingToken.Type == calculatorParser.Eof) return false;

            IntervalSet s;
            (parser.ErrorHandler as MyErrorStrategy).LASet.TryGetValue(re, out s);
            string error_str = "Expecting " + s.ToString(parser.Vocabulary);
            int ErrorPos = re.OffendingToken.StartIndex;

            _result = error_str;
            CurrentView.FormattedText = BuildCommand(plain_ole_command, ErrorPos);
            _calculation_history[_calculation_history.IndexOf(CurrentView)] = CurrentView;
            NotifyPropertyChanged("Result");
            NotifyPropertyChanged("Command");

            return true;
        }

        private bool CheckForErrorToken(string plain_ole_command, calculatorParser parser, IParseTree tree, IParseTree[] all_nodes)
        {
            IEnumerable<IParseTree> eni_nodes_iterator = all_nodes.Where((IParseTree n) =>
            {
                ErrorNodeImpl nn = n as ErrorNodeImpl;
                return nn != null;
            });
            IParseTree[] all_eni_nodes_iterator = eni_nodes_iterator.ToArray();
            if (!all_eni_nodes_iterator.Any()) return false;

            ErrorNodeImpl eni = all_eni_nodes_iterator.First() as ErrorNodeImpl;
            if (eni.GetText() == "<missing '='>") return false;

            int ErrorPos = eni.Payload.StartIndex;

            _result = "Extraneous input.";
            CurrentView.FormattedText = BuildCommand(plain_ole_command, ErrorPos);
            _calculation_history[_calculation_history.IndexOf(CurrentView)] = CurrentView;
            NotifyPropertyChanged("Result");
            NotifyPropertyChanged("Command");

            return true;
        }

        private bool CheckForResult(string plain_ole_command, calculatorParser parser, IParseTree tree, IParseTree[] all_nodes)
        {
            int ErrorPos = plain_ole_command.Length;
            // Find last good term.
            try
            {
                VisitorCalc visitor = new VisitorCalc();
                visitor.Visit(tree);
                var list = all_nodes.Where((nn) =>
                {
                    ParserRuleContext prc = nn as ParserRuleContext;
                    if (prc == null) return false;
                    Res r;
                    if (!visitor.Results.TryGetValue(prc, out r)) return false;
                    return r.IsComplete;
                });
                IParseTree[] find = list.ToArray();
                if (find.Length == 0) return false;

                ParserRuleContext p = find.Reverse().First() as ParserRuleContext;
                Res res;
                visitor.Results.TryGetValue(p, out res);
                _result = res.Value.ToString();
            }
            catch (Exception e)
            {
                ErrorPos = 0;
                _result = e.Message;
            }

            CurrentView.FormattedText = BuildCommand(plain_ole_command, ErrorPos);
            _calculation_history[_calculation_history.IndexOf(CurrentView)] = CurrentView;
            NotifyPropertyChanged("Result");
            NotifyPropertyChanged("Command");

            return true;
        }

        public void CompileAndRun()
        {
            FormattedString fs;
            Label label = CurrentView;
            fs = label.FormattedText;
            string plain_ole_command = fs.ToString();

            calculatorParser parser = Parser(plain_ole_command);
            IParseTree tree = parser.expressionResult();
            IParseTree[] all_nodes = DFSVisitor.DFS(tree as ParserRuleContext).ToArray();

            if (CheckForExceptions(plain_ole_command, parser, tree, all_nodes)) return;
            if (CheckForErrorToken(plain_ole_command, parser, tree, all_nodes)) return;
            if (CheckForResult(plain_ole_command, parser, tree, all_nodes)) return;

            _result = "Unknown.";

            label.FormattedText = BuildCommand(plain_ole_command, 0);
            _calculation_history[_calculation_history.IndexOf(CurrentView)] = label;
            NotifyPropertyChanged("Result");
            NotifyPropertyChanged("Command");
        }

        public ICommand B0 { get; set; } = new Command((nothing) => _singleton.InDigit("0"));
        public ICommand B1 { get; set; } = new Command((nothing) => _singleton.InDigit("1"));
        public ICommand B2 { get; set; } = new Command((nothing) => _singleton.InDigit("2"));
        public ICommand B3 { get; set; } = new Command((nothing) => _singleton.InDigit("3"));
        public ICommand B4 { get; set; } = new Command((nothing) => _singleton.InDigit("4"));
        public ICommand B5 { get; set; } = new Command((nothing) => _singleton.InDigit("5"));
        public ICommand B6 { get; set; } = new Command((nothing) => _singleton.InDigit("6"));
        public ICommand B7 { get; set; } = new Command((nothing) => _singleton.InDigit("7"));
        public ICommand B8 { get; set; } = new Command((nothing) => _singleton.InDigit("8"));
        public ICommand B9 { get; set; } = new Command((nothing) => _singleton.InDigit("9"));
        public ICommand BDot { get; set; } = new Command((nothing) => _singleton.InDigit("."));
        public ICommand BPlus { get; set; } = new Command((nothing) => _singleton.InDigit("+"));
        public ICommand BMinus { get; set; } = new Command((nothing) => _singleton.InDigit("-"));
        public ICommand BStar { get; set; } = new Command((nothing) => _singleton.InDigit("*"));
        public ICommand BSlash { get; set; } = new Command((nothing) => _singleton.InDigit("/"));
        public ICommand BEquals { get; set; } = new Command((nothing) =>
        {
            _singleton.InOperator("=");
            _singleton.CurrentView = new Label() { FormattedText = new FormattedString() };
            _singleton._calculation_history.Insert(0, _singleton.CurrentView);
        });
        public ICommand BSin { get; set; } = new Command((nothing) => _singleton.InDigit("sin "));
        public ICommand BCos { get; set; } = new Command((nothing) => _singleton.InDigit("cos "));
        public ICommand BTan { get; set; } = new Command((nothing) => _singleton.InDigit("tan "));
        public ICommand BArcSin { get; set; } = new Command((nothing) => _singleton.InDigit("arcsin "));
        public ICommand BArcCos { get; set; } = new Command((nothing) => _singleton.InDigit("arccos "));
        public ICommand BArcTan { get; set; } = new Command((nothing) => _singleton.InDigit("arctan "));
        public ICommand BExp { get; set; } = new Command((nothing) => _singleton.InDigit("exp "));
        public ICommand BLn { get; set; } = new Command((nothing) => _singleton.InDigit("ln "));
        public ICommand BInv { get; set; } = new Command((nothing) => _singleton.InDigit("1/"));
        public ICommand BPow { get; set; } = new Command((nothing) => _singleton.InDigit("pow "));
        public ICommand BOP { get; set; } = new Command((nothing) => _singleton.InDigit("("));
        public ICommand BCP { get; set; } = new Command((nothing) => _singleton.InDigit(")"));
    }

    public class MyErrorStrategy : Antlr4.Runtime.DefaultErrorStrategy
    {
        public MyErrorStrategy() : base()
        { }

        public Dictionary<RecognitionException, IntervalSet> LASet = new Dictionary<RecognitionException, IntervalSet>();

        public override void ReportError(Antlr4.Runtime.Parser recognizer, RecognitionException e)
        {
            IntervalSet x = recognizer.GetExpectedTokens();
            LASet[e] = Filter(x);
            base.ReportError(recognizer, e);
        }

        public List<int> _not_used =
            new List<int>()
            {
                calculatorParser.BYTE_ORDER_MARK,
                calculatorParser.ABSTRACT,
                calculatorParser.ADD,
                calculatorParser.ALIAS,
                calculatorParser.ARGLIST,
                calculatorParser.AS,
                calculatorParser.ASCENDING,
                calculatorParser.BASE,
                calculatorParser.BOOL,
                calculatorParser.BREAK,
                calculatorParser.BY,
                calculatorParser.BYTE,
                calculatorParser.CASE,
                calculatorParser.CATCH,
                calculatorParser.CHAR,
                calculatorParser.CHECKED,
                calculatorParser.CLASS,
                calculatorParser.CONST,
                calculatorParser.CONTINUE,
                calculatorParser.DECIMAL,
                calculatorParser.DEFAULT,
                calculatorParser.DELEGATE,
                calculatorParser.DESCENDING,
                calculatorParser.DO,
                calculatorParser.DOUBLE,
                calculatorParser.DYNAMIC,
                calculatorParser.ELSE,
                calculatorParser.ENUM,
                calculatorParser.EQUALS,
                calculatorParser.EVENT,
                calculatorParser.EXPLICIT,
                calculatorParser.EXTERN,
                //calculatorParser.FALSE,
                calculatorParser.FINALLY,
                calculatorParser.FIXED,
                calculatorParser.FLOAT,
                calculatorParser.FOR,
                calculatorParser.FOREACH,
                calculatorParser.FROM,
                calculatorParser.GET,
                calculatorParser.GOTO,
                calculatorParser.GROUP,
                calculatorParser.IF,
                calculatorParser.IMPLICIT,
                calculatorParser.IN,
                calculatorParser.INT,
                calculatorParser.INTERFACE,
                calculatorParser.INTERNAL,
                calculatorParser.INTO,
                calculatorParser.IS,
                calculatorParser.JOIN,
                calculatorParser.LET,
                calculatorParser.LOCK,
                calculatorParser.LONG,
                calculatorParser.NAMESPACE,
                calculatorParser.NEW,
                calculatorParser.NULL,
                calculatorParser.OBJECT,
                calculatorParser.ON,
                calculatorParser.OPERATOR,
                calculatorParser.ORDERBY,
                calculatorParser.OUT,
                calculatorParser.OVERRIDE,
                calculatorParser.PARAMS,
                calculatorParser.PARTIAL,
                calculatorParser.PRIVATE,
                calculatorParser.PROTECTED,
                calculatorParser.PUBLIC,
                calculatorParser.READONLY,
                calculatorParser.REF,
                calculatorParser.REMOVE,
                calculatorParser.RETURN,
                calculatorParser.SBYTE,
                calculatorParser.SEALED,
                calculatorParser.SELECT,
                calculatorParser.SET,
                calculatorParser.SHORT,
                calculatorParser.SIZEOF,
                calculatorParser.STACKALLOC,
                calculatorParser.STATIC,
                calculatorParser.STRING,
                calculatorParser.STRUCT,
                calculatorParser.SWITCH,
                calculatorParser.THIS,
                calculatorParser.THROW,
                //calculatorParser.TRUE,
                calculatorParser.TRY,
                calculatorParser.TYPEOF,
                calculatorParser.UINT,
                calculatorParser.ULONG,
                calculatorParser.UNCHECKED,
                calculatorParser.UNSAFE,
                calculatorParser.USHORT,
                calculatorParser.USING,
                calculatorParser.VIRTUAL,
                calculatorParser.VOID,
                calculatorParser.VOLATILE,
                calculatorParser.WHERE,
                calculatorParser.WHILE,
                calculatorParser.YIELD,
                calculatorParser.IDENTIFIER,
                //calculatorParser.INTEGER_LITERAL,
                //calculatorParser.REAL_LITERAL,
                calculatorParser.CHARACTER_LITERAL,
                calculatorParser.STRING_LITERAL,
                calculatorParser.OPEN_BRACE,
                calculatorParser.CLOSE_BRACE,
                calculatorParser.OPEN_BRACKET,
                calculatorParser.CLOSE_BRACKET,
                //calculatorParser.OPEN_PARENS,
                //calculatorParser.CLOSE_PARENS,
                calculatorParser.DOT,
                //calculatorParser.COMMA,
                calculatorParser.COLON,
                calculatorParser.SEMICOLON,
                //calculatorParser.PLUS,
                //calculatorParser.MINUS,
                //calculatorParser.STAR,
                //calculatorParser.DIV,
                //calculatorParser.PERCENT,
                //calculatorParser.AMP,
                //calculatorParser.BITWISE_OR,
                //calculatorParser.CARET,
                //calculatorParser.BANG,
                //calculatorParser.TILDE,
                //calculatorParser.ASSIGNMENT,
                //calculatorParser.LT,
                //calculatorParser.GT,
                calculatorParser.INTERR,
                calculatorParser.DOUBLE_COLON,
                calculatorParser.OP_COALESCING,
                calculatorParser.OP_INC,
                calculatorParser.OP_DEC,
                //calculatorParser.OP_AND,
                //calculatorParser.OP_OR,
                calculatorParser.OP_PTR,
                //calculatorParser.OP_EQ,
                //calculatorParser.OP_NE,
                //calculatorParser.OP_LE,
                //calculatorParser.OP_GE,
                calculatorParser.OP_ADD_ASSIGNMENT,
                calculatorParser.OP_SUB_ASSIGNMENT,
                calculatorParser.OP_MULT_ASSIGNMENT,
                calculatorParser.OP_DIV_ASSIGNMENT,
                calculatorParser.OP_MOD_ASSIGNMENT,
                calculatorParser.OP_AND_ASSIGNMENT,
                calculatorParser.OP_OR_ASSIGNMENT,
                calculatorParser.OP_XOR_ASSIGNMENT,
                //calculatorParser.OP_LEFT_SHIFT,
                calculatorParser.OP_LEFT_SHIFT_ASSIGNMENT,
                calculatorParser.QUOTE,
                calculatorParser.DOUBLE_QUOTE,
                calculatorParser.BACK_SLASH,
                calculatorParser.DOUBLE_BACK_SLASH,
                calculatorParser.SHARP
            };

        private IntervalSet Filter(IntervalSet original)
        {
            IntervalSet result = new IntervalSet();
            IEnumerable<Interval> list = original.GetIntervals().Where(
                (i) =>
                {
                    if (i.a == i.b)
                    {
                        if (_not_used.Contains(i.a))
                            return false;
                        else
                            return true;
                    }
                    else
                    {
                        for (int j = i.a; j <= i.b; ++j)
                        {
                            if (_not_used.Contains(j))
                                return false;
                        }
                        return true;
                    }
                }).ToList();
            foreach (Interval r in list)
            {
                if (r.a == r.b)
                    result.Add(r.a);
                else
                    result.Add(r.a, r.b);
            }
            return result;
        }
    }
}
