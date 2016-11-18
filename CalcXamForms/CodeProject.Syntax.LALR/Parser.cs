using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeProject.Syntax.LALR
{
    public class Node
    {
        public List<Node> children;
        public int token_type;
        public string token_value;
    }

    public class Parser
    {
        private ParserGenerator parser_generator;
        private ParseTable parse_table;
        private Stack<int> state_stack = new Stack<int>();
        private Stack<int> token_type_stack = new Stack<int>();
        private Stack<string> token_value_stack = new Stack<string>();
        private StackQueue<Node> parse_tree = new StackQueue<Node>();
        private Queue<int> input_token_type_queue = new Queue<int>();
        private Queue<string> input_token_value_queue = new Queue<string>();
        private int current_state;
        private Dictionary<string, int> token_type = new Dictionary<string, int>();

        public Parser(ParserGenerator p)
        {
            parser_generator = p;
            parse_table = parser_generator.ParseTable;

            Reset();

            int i = 0;
            foreach (string x in parser_generator.Grammar.Tokens)
            {
                token_type.Add(x, i++);
            }
        }

        public void Input(int input_token_type, string input_token_value)
        {
            input_token_type_queue.Enqueue(input_token_type);
            input_token_value_queue.Enqueue(input_token_value);
            Parse();
        }

        public Node Top(int w)
        {
            return parse_tree.PeekTop(w);
        }

        public void Reset()
        {
            state_stack = new Stack<int>();
            token_type_stack = new Stack<int>();
            token_value_stack = new Stack<string>();
            input_token_type_queue = new Queue<int>();
            input_token_value_queue = new Queue<string>();
            parse_tree = new StackQueue<Node>();
            current_state = 0;
            state_stack.Push(current_state);
        }

        public void Parse()
        {
            for (;;)
            {
                int state = state_stack.Peek();
                if (!input_token_type_queue.Any())
                    break;
                int input_token_type = input_token_type_queue.Peek();
                string input_token_value = input_token_value_queue.Peek();
                Action[,] actions = parse_table.Actions;
                Action action = actions[state, input_token_type];
                ActionType action_type = action.ActionType;
                if (action_type == ActionType.Shift)
                {
                    input_token_type_queue.Dequeue();
                    input_token_value_queue.Dequeue();
                    int new_state = action.ActionParameter;
                    state_stack.Push(new_state);
                    token_type_stack.Push(input_token_type);
                    token_value_stack.Push(input_token_value);
                    parse_tree.Push(new Node {children = new List<Node>(),
                        token_type = input_token_type,
                        token_value = input_token_value});
                }
                else if (action_type == ActionType.Reduce)
                {
                    int ap = action.ActionParameter; // ap is the production number.
                    if (ap == 0 && input_token_type == 0)
                        break; // accept.
                    Production production = parser_generator.Productions[ap];
                    int rhs_count = production.Right.Count();
                    // Create tree node.
                    Node node = new Node() {children = new List<Node>()};
                    List<Node> reverse = new List<Node>();
                    // Pop off RHS.
                    for (int i = 0; i < rhs_count; ++i)
                    {
                        state_stack.Pop();

                        int tt = token_type_stack.Pop();
                        string tv = token_value_stack.Pop();
                        Node pt = parse_tree.Pop();

                        node.children.Insert(0, pt);
                    }
                    int new_state = state_stack.Peek();
                    int lhs = production.Left;
                    lhs++;
                    Action goto_action = actions[new_state, lhs];
                    token_type_stack.Push(lhs);
                    if (lhs >= 1)
                        token_value_stack.Push(parser_generator.Grammar.Tokens[lhs - 1]);
                    else
                        token_value_stack.Push("ouch");
                    node.token_type = production.Left;
                    node.token_value = parser_generator.Grammar.Tokens[lhs - 1];
                    state_stack.Push(goto_action.ActionParameter);
                    parse_tree.Push(node);
                }
                else if (action_type == ActionType.Error)
                {
                    break;
                }
                else if (action_type == ActionType.Accept)
                {
                    break;
                }
                else
                    throw new Exception("Unknown action.");
            }
        }
    }
}
