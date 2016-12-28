using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.IO;
using System.Linq;
using System.Linq.Expressions;
using System.Runtime.CompilerServices;
using System.Text;
using System.Windows.Input;
using Antlr4.Runtime;
using Xamarin.Forms;
using Antlr4.Runtime.Tree;
using Antlr4.Runtime.Misc;
using CalcXamForms.Controls;
using Rg.Plugins.Popup.Extensions;
using CalcXamForms.Pages;
using CalcXamForms.Trees;

namespace CalcXamForms.ViewModels
{
    public class PageCalcViewModel : BindableObject, INotifyPropertyChanged
    {
        private static PageCalcViewModel _singleton;
        public static PageCalcViewModel Singleton(PageCalc cp = null)
        {
            if (_singleton == null) _singleton = new PageCalcViewModel(cp);
            return _singleton;
        }
        private PageCalc _page_calc;
        public ICommand OnTap { get; set; } = new Command(async (o) =>
        {
            HtmlLabel label = o as HtmlLabel;
            if (label != null)
            {
                int found = _singleton.Results.IndexOf(label);
                if (found < 0)
                    return;
                else
                {
                    // Insert a copy of the command into top (or overwrite if empty).
                    string command = _singleton._calculation_buffer[found];
                    HtmlLabel results = _singleton._display_buffer[found];
                    //if (_singleton._calculation_buffer[_singleton._calculation_buffer.Count - 1] == "")
                    //{
                    //    _singleton._calculation_buffer[_singleton._calculation_buffer.Count - 1] = command;
                    //    _singleton._display_buffer[_singleton._calculation_buffer.Count - 1] = results;
                    //    _singleton._page_calc.DoScroll(results);
                    //}
                    //else
                    {
                        HtmlLabel r = new HtmlLabel() {Align = HtmlLabel.Alignment.Right};
                        _singleton._display_buffer.Add(r);
                        _singleton._calculation_buffer.Add("");
                        _singleton._calculation_buffer[_singleton._calculation_buffer.Count - 1] = command;
                        _singleton._page_calc.DoScroll(r);
                    }
                    _singleton.NotifyPropertyChanged("Results");
                }
                EditorPopup page = new EditorPopup(_singleton);
                await _singleton._page_calc.Navigation.PushPopupAsync(page);
            }
        });
        private Size _size;
        public Size Dimensions
        {
            get
            {
                return _size;
            }
            set
            {
                _size = value;
                NotifyPropertyChanged("Results");
                NotifyPropertyChanged("IsPortraitMode");
                NotifyPropertyChanged("IsLandscapeMode");
                NotifyPropertyChanged("KeypadHeight");
                NotifyPropertyChanged("ButtonHeight");
            }
        }
        public int KeypadHeight
        {
            get { return (int) (IsPortraitMode ? Dimensions.Height*0.5 : Dimensions.Height*0.6); }
        }
        public int ButtonHeight
        {
            get { return IsPortraitMode ? 30 : 10; }
        }
        private string BuildFormattedCommandAndResult(string str, int error, string result)
        {
            string p1 = str.Substring(0, error);
            StringBuilder fs = new StringBuilder("");
            fs.Append("<big>" + p1);
            string p2 = str.Substring(error, str.Length - error);
            fs.Append("<font color=\"red\">" + p2 + "</Font></big>");
            fs.Append("<br/>");
            fs.Append("<big><big><big><big><big>" + result + "</big></big></big></big></big>");
            return fs.ToString();
        }
        private ObservableCollection<HtmlLabel> _display_buffer = new ObservableCollection<HtmlLabel>();
        private ObservableCollection<string> _calculation_buffer = new ObservableCollection<string>();
        public ObservableCollection<string> Commands
        {
            get { return _calculation_buffer; }
            set
            {
                NotifyPropertyChanged();
            }
        }
        public ObservableCollection<HtmlLabel> Results
        {
            get
            {
                return _display_buffer;
            }
            set
            {
                NotifyPropertyChanged();
            }
        }
        public bool IsPortraitMode
        {
            get
            {
                return this._size.Height > this._size.Width;
            }
        }
        public bool IsLandscapeMode
        {
            get
            {
                return this._size.Height < this._size.Width;
            }
        }
        public int FontSize
        {
            get
            {
                if (this._size.Height > this._size.Width)
                    return 20;
                return 10;
            }
        }
        private int _current_bank = 1;
        public bool Bank1
        {
            get { return _current_bank == 1; }
            set
            {
                NotifyPropertyChanged();
            }
        }
        public bool Bank2
        {
            get { return _current_bank == 2; }
            set
            {
                NotifyPropertyChanged();
            }
        }
        public void Rotate()
        {
            if (_current_bank == 1) _current_bank = 2;
            else _current_bank = 1;
            NotifyPropertyChanged("Bank1");
            NotifyPropertyChanged("Bank2");
        }
        public ICommand BRotate { get; set; } = new Command((nothing) => _singleton.Rotate());

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
        public ICommand BPlus { get; set; } = new Command((nothing) => _singleton.InOperator("+"));
        public ICommand BMinus { get; set; } = new Command((nothing) => _singleton.InOperator("-"));
        public ICommand BStar { get; set; } = new Command((nothing) => _singleton.InOperator("*"));
        public ICommand BSlash { get; set; } = new Command((nothing) => _singleton.InOperator("/"));
        public ICommand BEquals { get; set; } = new Command((nothing) =>
        {
            _singleton.InOperator("=");
            _singleton._display_buffer.Add(new HtmlLabel() { Align = HtmlLabel.Alignment.Right });
            _singleton._calculation_buffer.Add("");
            HtmlLabel item = _singleton._display_buffer[_singleton._display_buffer.Count - 1];
            _singleton._page_calc.DoScroll(item);
        });
        public ICommand BSin { get; set; } = new Command((nothing) => _singleton.InOperator("sin "));
        public ICommand BCos { get; set; } = new Command((nothing) => _singleton.InOperator("cos "));
        public ICommand BTan { get; set; } = new Command((nothing) => _singleton.InOperator("tan "));
        public ICommand BArcSin { get; set; } = new Command((nothing) => _singleton.InOperator("arcsin "));
        public ICommand BArcCos { get; set; } = new Command((nothing) => _singleton.InOperator("arccos "));
        public ICommand BArcTan { get; set; } = new Command((nothing) => _singleton.InOperator("arctan "));
        public ICommand BExp { get; set; } = new Command((nothing) => _singleton.InOperator("exp "));
        public ICommand BLn { get; set; } = new Command((nothing) => _singleton.InOperator("ln "));
        public ICommand BInv { get; set; } = new Command((nothing) => _singleton.InOperator("1/"));
        public ICommand BPow { get; set; } = new Command((nothing) => _singleton.InOperator("pow "));
        public ICommand BOP { get; set; } = new Command((nothing) => _singleton.InOperator("("));
        public ICommand BCP { get; set; } = new Command((nothing) => _singleton.InOperator(")"));

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

        private PageCalcViewModel(PageCalc page_calc)
        {
            _page_calc = page_calc;
            _display_buffer.Add(new HtmlLabel() { Align = HtmlLabel.Alignment.Right });
            _calculation_buffer.Add("");
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
            HtmlLabel item = _singleton._display_buffer[_singleton._display_buffer.Count - 1];
            _singleton._page_calc.DoScroll(item);

            string plain_ole_command = _calculation_buffer[_singleton._calculation_buffer.Count - 1] + op;
            _calculation_buffer[_singleton._calculation_buffer.Count - 1] = plain_ole_command;
            calculatorParser parser = Parser(plain_ole_command);
            IParseTree tree = parser.expressionResult();
            IParseTree[] all_nodes = DFSVisitor.DFS(tree as ParserRuleContext).ToArray();

            if (CheckForExceptions(plain_ole_command, parser, tree, all_nodes)) return;
            if (CheckForErrorToken(plain_ole_command, parser, tree, all_nodes)) return;
            if (CheckForResult(plain_ole_command, parser, tree, all_nodes)) return;

            string result = "Unknown.";
            _display_buffer[_display_buffer.Count - 1].Text = BuildFormattedCommandAndResult(plain_ole_command, 0, result);
            NotifyPropertyChanged("Results");
        }

        private void InDigit(string digit)
        {
            HtmlLabel item = _singleton._display_buffer[_singleton._display_buffer.Count - 1];
            _singleton._page_calc.DoScroll(item);

            string plain_ole_command = _calculation_buffer[_calculation_buffer.Count - 1] + digit;
            _calculation_buffer[_calculation_buffer.Count - 1] = plain_ole_command;
            int ErrorPos = plain_ole_command.Length;
            byte[] byteArray = Encoding.UTF8.GetBytes(plain_ole_command);
            calculatorParser pp = new calculatorParser(
                new CommonTokenStream(
                    new calculatorLexer(
                        new AntlrInputStream(
                            new StreamReader(
                                new MemoryStream(byteArray)).ReadToEnd()))));
            IParseTree tree = pp.expressionResult();
            ITokenStream ts = pp.TokenStream;
            string result = AllTokens(ts).Reverse().Skip(1).First().Text;
            _display_buffer[_display_buffer.Count - 1].Text = BuildFormattedCommandAndResult(plain_ole_command, ErrorPos, result);
            NotifyPropertyChanged("Results");
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

            string result = error_str;
            _display_buffer[_display_buffer.Count - 1].Text = BuildFormattedCommandAndResult(plain_ole_command, ErrorPos, result);
            NotifyPropertyChanged("Results");

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

            // For now, report nothing if there isn't an equal.
            foreach (var en in all_eni_nodes_iterator)
            {
                ErrorNodeImpl eni = en as ErrorNodeImpl;
                if (eni != null)
                {
                    if (eni.GetText() == "<missing '='>") return false;
                }
            }

            var enn = all_eni_nodes_iterator.First() as ErrorNodeImpl;
            if (enn == null) return false;

            int ErrorPos = enn.Payload.StartIndex;

            string result = "Extraneous input.";
            _display_buffer[_display_buffer.Count - 1].Text = BuildFormattedCommandAndResult(plain_ole_command, ErrorPos, result);
            NotifyPropertyChanged("Results");

            return true;
        }

        private bool CheckForResult(string plain_ole_command, calculatorParser parser, IParseTree tree, IParseTree[] all_nodes)
        {
            string result = "";
            int ErrorPos = plain_ole_command.Length;
            // Find last good term.
            try
            {
                ComputeCompleteness completeness_visitor = new ComputeCompleteness();
                completeness_visitor.Visit(tree);

                ComputeLinqExpr linq_visitor = new ComputeLinqExpr(completeness_visitor);
                Expression top_expr = linq_visitor.Visit(tree);

                var list = all_nodes.Where((nn) =>
                {
                    ParserRuleContext prc = nn as ParserRuleContext;
                    if (prc == null) return false;
                    bool r;
                    if (!completeness_visitor.Results.TryGetValue(prc, out r)) return false;
                    return r;
                });
                IParseTree[] find = list.ToArray();
                if (find.Length == 0) return false;

                ParserRuleContext child = find.Reverse().First() as ParserRuleContext;
                // Grab parent as partial results are valuable.
                ParserRuleContext parent = child.Parent as ParserRuleContext;

                // Eval.
                try
                {
                    Expression exp = null;
                    linq_visitor.Results.TryGetValue(parent != null ? parent : child, out exp);
                    Type type = exp.Type;
                    Delegate compiled_expr = Expression.Lambda(exp, null).Compile();
                    var res = compiled_expr.DynamicInvoke();
                    result = res.ToString();
                }
                catch (Exception e)
                {
                }

                //Res res;
                //visitor.Results.TryGetValue(parent != null ? parent : child, out res);
                //result = res.Value.ToString();
            }
            catch (Exception e)
            {
                ErrorPos = 0;
                result = e.Message;
            }

            _display_buffer[_display_buffer.Count - 1].Text = BuildFormattedCommandAndResult(plain_ole_command, ErrorPos, result);
            NotifyPropertyChanged("Results");

            return true;
        }

        public void CompileAndRun()
        {
            HtmlLabel item = _singleton._display_buffer[_singleton._display_buffer.Count - 1];
            _singleton._page_calc.DoScroll(item);

            string plain_ole_command = _calculation_buffer[_calculation_buffer.Count - 1];

            calculatorParser parser = Parser(plain_ole_command);
            IParseTree tree = parser.expressionResult();
            IParseTree[] all_nodes = DFSVisitor.DFS(tree as ParserRuleContext).ToArray();

            if (CheckForExceptions(plain_ole_command, parser, tree, all_nodes)) return;
            if (CheckForErrorToken(plain_ole_command, parser, tree, all_nodes)) return;
            if (CheckForResult(plain_ole_command, parser, tree, all_nodes)) return;

            string result = "Unknown.";

            _display_buffer[_display_buffer.Count - 1].Text = BuildFormattedCommandAndResult(plain_ole_command, 0, result);
            NotifyPropertyChanged("Results");
        }
    }
}
