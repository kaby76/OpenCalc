using System;
using System.Collections.Generic;
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

namespace CalcXamForms
{
    class PageCalcViewModel : INotifyPropertyChanged
    {
        private List<StringBuilder> _calculation_history = new List<StringBuilder>();
        private string _result;
        private Antlr4.Runtime.Tree.IErrorNode xasdf;

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

        public List<FormattedString> Command
        {
            get
            {
                List<FormattedString> res = new List<FormattedString>();
                foreach (StringBuilder str in _calculation_history)
                {
                    string s = str.ToString();
                    var fs = new FormattedString();

                    fs.Spans.Add(
                        new Span
                        {
                            Text = s,
                            FontSize = 20,
                            FontAttributes = FontAttributes.Bold
                        }
                        );
                    res.Insert(0, s);
                }
                return res;
            }
            set
            {
                NotifyPropertyChanged();
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

        public PageCalcViewModel()
        {
            _calculation_history.Add(new StringBuilder());

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
                _calculation_history.Add(new StringBuilder());
            });
        }

        private void InOperator(char op)
        {
            StringBuilder sb = _calculation_history.Last();
            sb.Append(op);
            byte[] byteArray = Encoding.UTF8.GetBytes(sb.ToString());
            int pos = sb.ToString().Length - 1;
            calculatorParser pp = new calculatorParser(
                new CommonTokenStream(
                    new calculatorLexer(
                        new AntlrInputStream(
                            new StreamReader(
                                new MemoryStream(byteArray)).ReadToEnd()))));
            MyErrorStrategy eh = new MyErrorStrategy();
            pp.ErrorHandler = eh;
            IParseTree tree = pp.expressionResult();

            {
                var l = DFSVisitor.DFS(tree as ParserRuleContext).ToArray().Where((ParserRuleContext n) =>
                {
                    return n.exception != null;
                });
                var f = l.ToArray();
                if (f.Length != 0)
                {
                    RecognitionException e = f[0].exception;
                    IntervalSet s;
                    eh.LASet.TryGetValue(e, out s);
                    string error_str = "Expecting " + s.ToString(pp.Vocabulary);
                    if (e.OffendingToken.Type == calculatorParser.Eof)
                    {
                        // OK
                        VisitorCalc visitor = new VisitorCalc();
                        visitor.Visit(tree);
                        var list = DFSVisitor.DFS(tree as ParserRuleContext).ToArray().Where((ParserRuleContext n)
                        =>
                        {
                            // Looking for child with "+".
                            if (n.children == null) return false;
                            for (int chi = 0; chi < n.children.Count; ++chi)
                            {
                                object obj = n.children[chi];
                                TerminalNodeImpl t = obj as TerminalNodeImpl;
                                if (t != null)
                                {
                                    if (t.Payload.StartIndex == pos)
                                        return true;
                                }
                            }
                            return false;
                        });
                        var find = list.ToArray();
                        if (find.Length == 1)
                        {
                            ParserRuleContext p = list.First();
                            Res res;
                            if (visitor.Results.TryGetValue(p, out res))
                                _result = res.Value.ToString();
                        }
                        else if (find.Length == 0)
                        {
                            // Could not find the operator!
                            _result = "Invalid computation.";
                        }
                    }
                    else
                    {
                        // BAD
                        _result = error_str;
                    }
                }
                else
                {
                    {
                        // OK
                        VisitorCalc visitor = new VisitorCalc();
                        visitor.Visit(tree);
                        var list = DFSVisitor.DFS(tree as ParserRuleContext).ToArray().Where((ParserRuleContext n)
                        =>
                        {
                            // Looking for child with "+".
                            if (n.children == null) return false;
                            for (int chi = 0; chi < n.children.Count; ++chi)
                            {
                                object obj = n.children[chi];
                                TerminalNodeImpl t = obj as TerminalNodeImpl;
                                if (t != null)
                                {
                                    if (t.Payload.StartIndex == pos)
                                        return true;
                                }
                            }
                            return false;
                        });
                        var find = list.ToArray();
                        if (find.Length == 1)
                        {
                            ParserRuleContext p = list.First();
                            Res res;
                            if (visitor.Results.TryGetValue(p, out res))
                                _result = res.Value.ToString();
                        }
                        else if (find.Length == 0)
                        {
                            // Could not find the operator!
                            _result = "Invalid computation.";
                        }
                    }

                }
            }
            NotifyPropertyChanged("Result");
            NotifyPropertyChanged("Command");
        }

        private void InDigit(char digit)
        {
            StringBuilder sb = _calculation_history.Last();
            sb.Append(digit);
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
