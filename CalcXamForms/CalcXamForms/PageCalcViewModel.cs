using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.IO;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;
using Antlr4.Runtime;
using CodeProject.Syntax.LALR;
using Xamarin.Forms;
using Antlr4.Runtime.Tree;
using Parser = CodeProject.Syntax.LALR.Parser;

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

        enum TokenTypes { StartSymbol = 0, E, Plus, Minus, Star, Slash, Num, Lp, Rp };

        public static IEnumerable<IToken> AllTokens(ITokenStream ts)
        {
            for (int ii = 0; ii < ts.Size; ++ii)
            {
                var tfasdf = ts.Get(ii);
                yield return tfasdf;
            }
        }

        public PageCalcViewModel()
        {
            _calculation_history.Add(new StringBuilder());

            _bdot_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('.');
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
            });

            _b0_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('0');
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
            });
            _b1_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('1');
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
            });
            _b2_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('2');
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
            });
            _b3_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('3');
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
            });
            _b4_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('4');
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
            });
            _b5_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('5');
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
            });
            _b6_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('6');
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
            });
            _b7_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('7');
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
            });
            _b8_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('8');
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
            });
            _b9_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('9');
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
            });


            _bplus_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('+');
                byte[] byteArray = Encoding.UTF8.GetBytes(sb.ToString());
                calculatorParser pp = new calculatorParser(
                    new CommonTokenStream(
                        new calculatorLexer(
                            new AntlrInputStream(
                                new StreamReader(
                                    new MemoryStream(byteArray)).ReadToEnd()))));
                IParseTree tree = pp.expressionResult();
                VisitorCalc visitor = new VisitorCalc();
                Res re = visitor.Visit(tree);
                ParserRuleContext prc = tree as ParserRuleContext;
                var list = DFSVisitor.DFS(prc);
                var ar = list.ToArray();
                var list2 = list.Reverse().Where((ParserRuleContext n)
                =>
                {
                    return (n as calculatorParser.MultiplyingExpressionContext) != null;
                });
                var ar2 = list2.ToArray();
                var list3 = list2.ToArray();
                ParserRuleContext p = list3.Skip(1).First();
                Res res;
                if (visitor.Results.TryGetValue(p, out res))
                    if (res.IsComplete)
                        _result = res.Value.ToString();
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });

            _bminus_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('-');
            });

            _bstar_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('*');
            });

            _bslash_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('/');
            });

            _bequals_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('=');
                _calculation_history.Add(new StringBuilder());
            });
        }

        private ICommand _b0_command;
        public ICommand B0
        {
            get
            {
                return _b0_command;
            }
            set
            {
                _b0_command = value;
            }
        }

        private ICommand _b1_command;
        public ICommand B1
        {
            get
            {
                return _b1_command;
            }
            set
            {
                _b1_command = value;
            }
        }

        private ICommand _b2_command;
        public ICommand B2
        {
            get
            {
                return _b2_command;
            }
            set
            {
                _b2_command = value;
            }
        }

        private ICommand _b3_command;
        public ICommand B3
        {
            get
            {
                return _b3_command;
            }
            set
            {
                _b3_command = value;
            }
        }

        private ICommand _b4_command;
        public ICommand B4
        {
            get
            {
                return _b4_command;
            }
            set
            {
                _b4_command = value;
            }
        }

        private ICommand _b5_command;
        public ICommand B5
        {
            get
            {
                return _b5_command;
            }
            set
            {
                _b5_command = value;
            }
        }

        private ICommand _b6_command;
        public ICommand B6
        {
            get
            {
                return _b6_command;
            }
            set
            {
                _b6_command = value;
            }
        }

        private ICommand _b7_command;
        public ICommand B7
        {
            get
            {
                return _b7_command;
            }
            set
            {
                _b7_command = value;
            }
        }

        private ICommand _b8_command;
        public ICommand B8
        {
            get
            {
                return _b8_command;
            }
            set
            {
                _b8_command = value;
            }
        }

        private ICommand _b9_command;
        public ICommand B9
        {
            get
            {
                return _b9_command;
            }
            set
            {
                _b9_command = value;
            }
        }

        private ICommand _bdot_command;
        public ICommand BDot
        {
            get
            {
                return _bdot_command;
            }
            set
            {
                _bdot_command = value;
            }
        }

        private ICommand _bplus_command;
        public ICommand BPlus
        {
            get
            {
                return _bplus_command;
            }
            set
            {
                _bplus_command = value;
            }
        }

        private ICommand _bminus_command;
        public ICommand BMinus
        {
            get
            {
                return _bminus_command;
            }
            set
            {
                _bminus_command = value;
            }
        }

        private ICommand _bstar_command;
        public ICommand BStar
        {
            get
            {
                return _bstar_command;
            }
            set
            {
                _bstar_command = value;
            }
        }

        private ICommand _bslash_command;
        public ICommand BSlash
        {
            get
            {
                return _bslash_command;
            }
            set
            {
                _bslash_command = value;
            }
        }

        private ICommand _bequals_command;
        public ICommand BEquals
        {
            get
            {
                return _bequals_command;
            }
            set
            {
                _bequals_command = value;
            }
        }

        private float EvaluateTop(Node node)
        {
            Dictionary<Node, float> value = new Dictionary<Node, float>();
            float result = Evaluate(value, node);
            return result;
        }

        private List<Node> Lexer(string command)
        {
            List<Node> result = new List<Node>();
            int i;
            for (i = 0; i < command.Length; )
            {
                if (command[i] >= '0' && command[i] <= '9')
                {
                    int dot = 0;
                    StringBuilder sb = new StringBuilder();
                    while (i < command.Length && (command[i] >= '0' && command[i] <= '9' ||
                        command[i] == '.'))
                    {
                        sb.Append(command[i]);
                        if (command[i] == '.')
                        {
                            if (dot > 0) throw new Exception("invalid number");
                            dot++;
                        }
                        ++i;
                    }
                    Node token = new Node();
                    token.token_type = (int)TokenTypes.Num;
                    token.token_value = sb.ToString();
                    token.start = i - token.token_value.Length;
                    token.end = i;
                    result.Add(token);
                }
                else if (command[i] == '+')
                {
                    Node token = new Node();
                    token.token_type = (int)TokenTypes.Plus;
                    token.token_value = "+";
                    token.start = i;
                    token.end = i + 1;
                    ++i;
                    result.Add(token);
                }
                else if (command[i] == '-')
                {
                    Node token = new Node();
                    token.token_type = (int)TokenTypes.Minus;
                    token.token_value = "-";
                    token.start = i;
                    token.end = i + 1;
                    ++i;
                    result.Add(token);
                }
                else if (command[i] == '*')
                {
                    Node token = new Node();
                    token.token_type = (int)TokenTypes.Star;
                    token.token_value = "*";
                    token.start = i;
                    token.end = i + 1;
                    ++i;
                    result.Add(token);
                }
                else if (command[i] == '/')
                {
                    Node token = new Node();
                    token.token_type = (int)TokenTypes.Slash;
                    token.token_value = "/";
                    token.start = i;
                    token.end = i + 1;
                    ++i;
                    result.Add(token);
                }
                else if (command[i] == '=')
                {
                    Node token = new Node();
                    token.token_type = -1;
                    token.token_value = "=";
                    token.start = i;
                    token.end = i + 1;
                    ++i;
                    result.Add(token);
                }
            }
            return result;
        }

        private float Evaluate(Dictionary<Node, float> value, Node node)
        {
            if (node.Children == null)
                throw new Exception("Should not be.");
            int count = node.Children.Count();
            foreach (Node child in node.Children)
                Evaluate(value, child);
            if (count == 0)
            {
                try
                {
                    float res = Convert.ToSingle(node.token_value);
                    value[node] = res;
                    return res;
                }
                catch (Exception)
                { }
                return 0;
            }
            else if (count == 1)
            {
                float res = value[node.Children[0]];
                value[node] = res;
                return res;
            }
            else if (count == 2)
            {
                throw new Exception("Fuck");
            }
            else if (count == 3)
            {
                float res = 0;
                int tt = node.Children[1].token_type;
                if (tt == 3)
                {
                    res = value[node.Children[0]] + value[node.Children[2]];
                }
                if (tt == 4)
                {
                    res = value[node.Children[0]] - value[node.Children[2]];
                }
                if (tt == 5)
                {
                    res = value[node.Children[0]] * value[node.Children[2]];
                }
                if (tt == 6)
                {
                    res = value[node.Children[0]] / value[node.Children[2]];
                }
                value[node] = res;
                return res;
            }
            else
                throw new Exception("Fuck");
        }

        private float calc(float op1, char op, float op2)
        {
            switch (op)
            {
                case '+': return op1 + op2;
                case '-': return op1 - op2;
                case '*': return op1 * op2;
                case '/': return op1 / op2;
            }
            return 0;
        }
    }
}
