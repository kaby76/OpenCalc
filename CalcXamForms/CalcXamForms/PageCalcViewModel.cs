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
        private ICommand _on_tap_command;
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
                        FontSize = 10,
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
                        FontSize = 20,
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
            _on_tap_command = new Command(async (o) =>
            {
                Label label = o as Label;
                if (label != null)
                {
                    int found = _calculation_history.IndexOf(label);
                    if (found < 0)
                        return;
                    else if (found > 0)
                    {
                        CurrentView = new Label() {FormattedText = label.FormattedText.Copy()};
                        _calculation_history.Insert(0, CurrentView);
                    }
                    else
                    {
                        CurrentView = label;
                    }
                    EditorPopup page = new EditorPopup(this);
                    await _page_calc.Navigation.PushPopupAsync(page);
                }
            });

            _bdot_command = new Command((nothing) => InDigit('.'));
            _b0_command = new Command((nothing) => InDigit('0'));
            _b1_command = new Command((nothing) => InDigit('1'));
            _b2_command = new Command((nothing) => InDigit('2'));
            _b3_command = new Command((nothing) => InDigit('3'));
            _b4_command = new Command((nothing) => InDigit('4'));
            _b5_command = new Command((nothing) => InDigit('5'));
            _b6_command = new Command((nothing) => InDigit('6'));
            _b7_command = new Command((nothing) => InDigit('7'));
            _b8_command = new Command((nothing) => InDigit('8'));
            _b9_command = new Command((nothing) => InDigit('9'));

            _bplus_command = new Command((nothing) => InOperator('+'));
            _bminus_command = new Command((nothing) => InOperator('-'));
            _bstar_command = new Command((nothing) => InOperator('*'));
            _bslash_command = new Command((nothing) => InOperator('/'));

            _bequals_command = new Command((nothing) =>
            {
                InOperator('=');
                CurrentView = new Label() { FormattedText = new FormattedString() };
                _calculation_history.Insert(0, CurrentView);
            });
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

        private void InOperator(char op)
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

        private void InDigit(char digit)
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

        private ICommand _b0_command;
        public ICommand B0
        {
            get { return _b0_command; }
            set { _b0_command = value; }
        }

        private ICommand _b1_command;
        public ICommand B1
        {
            get { return _b1_command; }
            set { _b1_command = value; }
        }

        private ICommand _b2_command;
        public ICommand B2
        {
            get { return _b2_command; }
            set { _b2_command = value; }
        }

        private ICommand _b3_command;
        public ICommand B3
        {
            get { return _b3_command; }
            set { _b3_command = value; }
        }

        private ICommand _b4_command;
        public ICommand B4
        {
            get { return _b4_command; }
            set { _b4_command = value; }
        }

        private ICommand _b5_command;
        public ICommand B5
        {
            get { return _b5_command; }
            set { _b5_command = value; }
        }

        private ICommand _b6_command;
        public ICommand B6
        {
            get { return _b6_command; }
            set { _b6_command = value; }
        }

        private ICommand _b7_command;
        public ICommand B7
        {
            get { return _b7_command; }
            set { _b7_command = value; }
        }

        private ICommand _b8_command;
        public ICommand B8
        {
            get { return _b8_command; }
            set { _b8_command = value; }
        }

        private ICommand _b9_command;
        public ICommand B9
        {
            get { return _b9_command; }
            set { _b9_command = value; }
        }

        private ICommand _bdot_command;
        public ICommand BDot
        {
            get { return _bdot_command; }
            set { _bdot_command = value; }
        }

        private ICommand _bplus_command;
        public ICommand BPlus
        {
            get { return _bplus_command; }
            set { _bplus_command = value; }
        }

        private ICommand _bminus_command;
        public ICommand BMinus
        {
            get { return _bminus_command; }
            set { _bminus_command = value; }
        }

        private ICommand _bstar_command;
        public ICommand BStar
        {
            get { return _bstar_command; }
            set { _bstar_command = value; }
        }

        private ICommand _bslash_command;
        public ICommand BSlash
        {
            get { return _bslash_command; }
            set { _bslash_command = value; }
        }

        private ICommand _bequals_command;
        public ICommand BEquals
        {
            get { return _bequals_command; }
            set { _bequals_command = value; }
        }
    }

    public class MyErrorStrategy : Antlr4.Runtime.DefaultErrorStrategy
    {
        public MyErrorStrategy() : base()
        { }

        public Dictionary<RecognitionException, IntervalSet> LASet = new Dictionary<RecognitionException, IntervalSet>();

        public override void ReportError(Antlr4.Runtime.Parser recognizer, RecognitionException e)
        {
            IntervalSet x = recognizer.GetExpectedTokens();
            LASet[e] = x;
            base.ReportError(recognizer, e);
        }
    }
}
