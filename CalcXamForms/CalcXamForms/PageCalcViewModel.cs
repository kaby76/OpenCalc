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

        public PageCalcViewModel()
        {
            if (true)
            {
                byte[] byteArray = Encoding.UTF8.GetBytes("1+2+".ToString());
                StreamReader inputStream = new StreamReader(new MemoryStream(byteArray));
                AntlrInputStream input = new AntlrInputStream(inputStream.ReadToEnd());
                CSharp4Lexer lexer = new CSharp4Lexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CSharp4Parser pp = new CSharp4Parser(tokens);
                IParseTree tree = pp.expression();
                var t = tree.ToStringTree(pp);
                Visitor visitor = new Visitor();
                //Console.WriteLine(visitor.Visit(tree));
            }
            //
            // the following program produces a parse table for the following grammar
            // for infix expressions, and appropriately applies operator precedence of
            // the + - * / operators, otherwise evaluating the leftmost operations first
            //
            // S' -> e
            // e -> i
            // e -> ( e )
            // e -> e * e
            // e -> e / e
            // e -> e + e
            // e -> e - e
            //
            // 

            Grammar grammar = new Grammar();
            grammar.Tokens = new string[] { "S'", "e", "+", "-", "*", "/", "i", "(", ")" };
            
            grammar.PrecedenceGroups = new PrecedenceGroup[]
            {
                new PrecedenceGroup
                {
                    Derivation = Derivation.None,
                    Productions = new Production[]
                    {
                        //S' -> e
                        new Production
                        {
                            Left = (int)TokenTypes.StartSymbol,
                            Right = new int[] {(int)TokenTypes.E}
                        },
                        //e -> i
                        new Production
                        {
                            Left = (int)TokenTypes.E,
                            Right = new int[] {(int)TokenTypes.Num}
                        },
                        //e -> ( e )
                        new Production
                        {
                            Left = (int)TokenTypes.E,
                            Right = new int[] {
                                (int)TokenTypes.Lp,
                                (int)TokenTypes.E,
                                (int)TokenTypes.Rp}
                        }
                    }
                },
                new PrecedenceGroup
                {
                    Derivation = Derivation.LeftMost,
                    Productions = new Production[]
                    {
                        //e -> e * e
                        new Production
                        {
                            Left = (int)TokenTypes.E,
                            Right = new int[] {
                                (int)TokenTypes.E,
                                (int)TokenTypes.Star,
                                (int)TokenTypes.E}
                        },
                        //e -> e / e
                        new Production
                        {
                            Left = (int)TokenTypes.E,
                            Right = new int[] {
                                (int)TokenTypes.E,
                                (int)TokenTypes.Slash,
                                (int)TokenTypes.E}
                        },
                    }
                },
                new PrecedenceGroup
                {
                    //productions are left associative and bind less tightly than * or /
                    Derivation = Derivation.LeftMost,
                    Productions = new Production[]
                    {
                        //e -> e + e
                        new Production
                        {
                            Left = (int)TokenTypes.E,
                            Right = new int[] {
                                (int)TokenTypes.E,
                                (int)TokenTypes.Plus,
                                (int)TokenTypes.E}
                        },
                        //e -> e - e
                        new Production
                        {
                            Left = (int)TokenTypes.E,
                            Right = new int[] {
                                (int)TokenTypes.E,
                                (int)TokenTypes.Minus,
                                (int)TokenTypes.E}
                        }
                    }
                }
            };

            // generate the parse table
            ParserGenerator parser_generator = new ParserGenerator(grammar);

            // write the parse table.
            Debug.DumpParseTable(parser_generator);
            string deb = Debug.Output();

            Parser parser = new Parser(parser_generator);

            _calculation_history.Add(new StringBuilder());

            _bdot_command = new Command((nothing) =>
            {
                char c = '.';
                StringBuilder sb = _calculation_history.Last();
                sb.Append(c);
                _result = Lexer(sb.ToString()).Last().token_value;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });

            _b0_command = new Command((nothing) =>
            {
                char c = '0';
                StringBuilder sb = _calculation_history.Last();
                sb.Append(c);
                _result = Lexer(sb.ToString()).Last().token_value;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b1_command = new Command((nothing) =>
            {
                char c = '1';
                StringBuilder sb = _calculation_history.Last();
                sb.Append(c);
                _result = Lexer(sb.ToString()).Last().token_value;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b2_command = new Command((nothing) =>
            {
                char c = '2';
                StringBuilder sb = _calculation_history.Last();
                sb.Append(c);
                _result = Lexer(sb.ToString()).Last().token_value;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b3_command = new Command((nothing) =>
            {
                char c = '3';
                StringBuilder sb = _calculation_history.Last();
                sb.Append(c);
                _result = Lexer(sb.ToString()).Last().token_value;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b4_command = new Command((nothing) =>
            {
                char c = '4';
                StringBuilder sb = _calculation_history.Last();
                sb.Append(c);
                _result = Lexer(sb.ToString()).Last().token_value;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b5_command = new Command((nothing) =>
            {
                char c = '5';
                StringBuilder sb = _calculation_history.Last();
                sb.Append(c);
                _result = Lexer(sb.ToString()).Last().token_value;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b6_command = new Command((nothing) =>
            {
                char c = '6';
                StringBuilder sb = _calculation_history.Last();
                sb.Append(c);
                _result = Lexer(sb.ToString()).Last().token_value;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b7_command = new Command((nothing) =>
            {
                char c = '7';
                StringBuilder sb = _calculation_history.Last();
                sb.Append(c);
                _result = Lexer(sb.ToString()).Last().token_value;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b8_command = new Command((nothing) =>
            {
                char c = '8';
                StringBuilder sb = _calculation_history.Last();
                sb.Append(c);
                _result = Lexer(sb.ToString()).Last().token_value;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b9_command = new Command((nothing) =>
            {
                char c = '9';
                StringBuilder sb = _calculation_history.Last();
                sb.Append(c);
                _result = Lexer(sb.ToString()).Last().token_value;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });


            _bplus_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('+');
                List<Node> tokens = Lexer(sb.ToString());
                parser.Input(tokens);
                float v = EvaluateTop(parser.Top(1));
                _result = v.ToString();
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });

            _bminus_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('-');
                List<Node> tokens = Lexer(sb.ToString());
                parser.Input(tokens);
                float v = EvaluateTop(parser.Top(1));
                _result = v.ToString();
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });

            _bstar_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('*');
                List<Node> tokens = Lexer(sb.ToString());
                parser.Input(tokens);
                float v = EvaluateTop(parser.Top(1));
                _result = v.ToString();
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });

            _bslash_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('/');
                List<Node> tokens = Lexer(sb.ToString());
                parser.Input(tokens);
                float v = EvaluateTop(parser.Top(1));
                _result = v.ToString();
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });

            _bequals_command = new Command((nothing) =>
            {
                StringBuilder sb = _calculation_history.Last();
                sb.Append('=');
                List<Node> tokens = Lexer(sb.ToString());
                parser.Input(tokens);
                float v = EvaluateTop(parser.Top(0));
                _result = v.ToString();
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
                parser.Reset();
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
