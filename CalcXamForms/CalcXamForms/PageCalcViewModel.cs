using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;
using CodeProject.Syntax.LALR;
using Xamarin.Forms;

namespace CalcXamForms
{
    class PageCalcViewModel : INotifyPropertyChanged
    {
        private List<List<char>> _command_buffer = new List<List<char>>();
        private Stack<float> _stack = new Stack<float>();
        private float _result;
        private float _accumulator;
        private Stack<char> _op = new Stack<char>();

        public FormattedString Result
        {
            get
            {
                string result = _result.ToString();
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
                foreach (List<char> str in _command_buffer)
                {
                    string s = new string(str.ToArray());
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

        public PageCalcViewModel()
        {
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
                            Left = 0,
                            Right = new int[] {1}
                        },
                        //e -> i
                        new Production
                        {
                            Left = 1,
                            Right = new int[] {6}
                        },
                        //e -> ( e )
                        new Production
                        {
                            Left = 1,
                            Right = new int[] {7, 1, 8}
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
                            Left = 1,
                            Right = new int[] {1, 4, 1}
                        },
                        //e -> e / e
                        new Production
                        {
                            Left = 1,
                            Right = new int[] {1, 5, 1}
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
                            Left = 1,
                            Right = new int[] {1, 2, 1}
                        },
                        //e -> e - e
                        new Production
                        {
                            Left = 1,
                            Right = new int[] {1, 3, 1}
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
            //parser.Input(7, "1"); // token type = "i"; value = 1.
            //parser.Input(3, "+");
            //parser.Input(7, "2");
            //parser.Parse();

            _command_buffer.Add(new List<char>());


            _stack.Push(0);
            _b0_command = new Command((nothing) =>
            {
                int value = 0;
                char c = (char)(value + (int)'0');
                _command_buffer.Last().Add(c);
                _accumulator = 10 * _accumulator + value;
                _result = _accumulator;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b1_command = new Command((nothing) =>
            {
                int value = 1;
                char c = (char)(value + (int)'0');
                _command_buffer.Last().Add(c);
                _accumulator = 10 * _accumulator + value;
                _result = _accumulator;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b2_command = new Command((nothing) =>
            {
                int value = 2;
                char c = (char)(value + (int)'0');
                _command_buffer.Last().Add(c);
                _accumulator = 10 * _accumulator + value;
                _result = _accumulator;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b3_command = new Command((nothing) =>
            {
                int value = 3;
                char c = (char)(value + (int)'0');
                _command_buffer.Last().Add(c);
                _accumulator = 10 * _accumulator + value;
                _result = _accumulator;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b4_command = new Command((nothing) =>
            {
                int value = 4;
                char c = (char)(value + (int)'0');
                _command_buffer.Last().Add(c);
                _accumulator = 10 * _accumulator + value;
                _result = _accumulator;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b5_command = new Command((nothing) =>
            {
                int value = 5;
                char c = (char)(value + (int)'0');
                _command_buffer.Last().Add(c);
                _accumulator = 10 * _accumulator + value;
                _result = _accumulator;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b6_command = new Command((nothing) =>
            {
                int value = 6;
                char c = (char)(value + (int)'0');
                _command_buffer.Last().Add(c);
                _accumulator = 10 * _accumulator + value;
                _result = _accumulator;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b7_command = new Command((nothing) =>
            {
                int value = 7;
                char c = (char)(value + (int)'0');
                _command_buffer.Last().Add(c);
                _accumulator = 10 * _accumulator + value;
                _result = _accumulator;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b8_command = new Command((nothing) =>
            {
                int value = 8;
                char c = (char)(value + (int)'0');
                _command_buffer.Last().Add(c);
                _accumulator = 10 * _accumulator + value;
                _result = _accumulator;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _b9_command = new Command((nothing) =>
            {
                int value = 9;
                char c = (char)(value + (int)'0');
                _command_buffer.Last().Add(c);
                _accumulator = 10 * _accumulator + value;
                _result = _accumulator;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });


            _bplus_command = new Command((nothing) =>
            {
                parser.Input(7, _accumulator.ToString()); // token type = "i"; value = 1.
                _accumulator = 0;
                _command_buffer.Last().Add('+');
                parser.Input(3, "0"); // +
                float v = EvaluateTop(parser.Top(1));
                _result = v;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _bminus_command = new Command((nothing) =>
            {
                parser.Input(7, _accumulator.ToString()); // token type = "i"; value = 1.
                _accumulator = 0;
                _command_buffer.Last().Add('-');
                parser.Input(4, "0"); // -
                float v = EvaluateTop(parser.Top(1));
                _result = v;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _bstar_command = new Command((nothing) =>
            {
                parser.Input(7, _accumulator.ToString()); // token type = "i"; value = 1.
                _accumulator = 0;
                _command_buffer.Last().Add('*');
                parser.Input(5, "0"); // *
                float v = EvaluateTop(parser.Top(1));
                _result = v;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _bslash_command = new Command((nothing) =>
            {
                parser.Input(7, _accumulator.ToString()); // token type = "i"; value = 1.
                _accumulator = 0;
                _command_buffer.Last().Add('/');
                parser.Input(6, "0"); // /
                float v = EvaluateTop(parser.Top(1));
                _result = v;
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
            });
            _bequals_command = new Command((nothing) =>
            {
                parser.Input(7, _accumulator.ToString()); // token type = "i"; value = 1.
                _accumulator = 0;
                _command_buffer.Last().Add('=');
                _command_buffer.Add(new List<char>());
                parser.Input(0, "0"); //=
                float v = EvaluateTop(parser.Top(0));
                _result = v;
                parser.Reset();
                NotifyPropertyChanged("Result");
                NotifyPropertyChanged("Command");
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

        private float Evaluate(Dictionary<Node, float> value, Node node)
        {
            if (node.children == null)
                throw new Exception("Should not be.");
            int count = node.children.Count();
            foreach (Node child in node.children)
                Evaluate(value, child);
            if (count == 0)
            {
                float res = Convert.ToSingle(node.token_value);
                value[node] = res;
                return res;
            }
            else if (count == 1)
            {
                float res = value[node.children[0]];
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
                int tt = node.children[1].token_type;
                if (tt == 3)
                {
                    res = value[node.children[0]] + value[node.children[2]];
                }
                if (tt == 4)
                {
                    res = value[node.children[0]] - value[node.children[2]];
                }
                if (tt == 5)
                {
                    res = value[node.children[0]] * value[node.children[2]];
                }
                if (tt == 6)
                {
                    res = value[node.children[0]] / value[node.children[2]];
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
