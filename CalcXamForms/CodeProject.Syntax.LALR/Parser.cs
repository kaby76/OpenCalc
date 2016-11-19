using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeProject.Syntax.LALR
{
    public class Node
    {
        public int token_type;
        public string token_value;
        public int start;
        public int end;

        public string Id;
        public List<Node> Children;

        public Node()
        {
        }

        public Node(string id, List<Node> children)
        {
            Id = id;
            Children = children;
        }

        public override bool Equals(object obj)
        {
            var node = obj as Node;
            if (node != null)
            {
                return node.Id == this.Id;
            }
            return false;
        }
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

        List<Node> old_token_list = new List<Node>();

        public void Input(List<Node> new_token_list)
        {
            Reset();
            foreach (Node n in new_token_list)
            {
                input_token_type_queue.Enqueue(n.token_type + 1);
                input_token_value_queue.Enqueue(n.token_value);
            }
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
                    parse_tree.Push(new Node { Children = new List<Node>(),
                        token_type = input_token_type,
                        token_value = input_token_value });
                }
                else if (action_type == ActionType.Reduce)
                {
                    int ap = action.ActionParameter; // ap is the production number.
                    if (ap == 0 && input_token_type == 0)
                        break; // accept.
                    Production production = parser_generator.Productions[ap];
                    int rhs_count = production.Right.Count();
                    // Create tree node.
                    Node node = new Node() { Children = new List<Node>() };
                    List<Node> reverse = new List<Node>();
                    // Pop off RHS.
                    for (int i = 0; i < rhs_count; ++i)
                    {
                        state_stack.Pop();

                        int tt = token_type_stack.Pop();
                        string tv = token_value_stack.Pop();
                        Node pt = parse_tree.Pop();

                        node.Children.Insert(0, pt);
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
            ComputeStartEnd();
        }

        private void ComputeStartEnd()
        {
            foreach (Node n in parse_tree)
            {
                NonRecursivePostOrder(n, (Node p) =>
                {
                    int start = 9999999;
                    int end = 0;
                    if (p.Children.Any())
                    {
                        foreach (Node c in p.Children)
                        {
                            if (c.start < start) start = c.start;
                            if (c.end > end) end = c.end;
                        }
                        p.start = start;
                        p.end = end;
                    }
                });
            }
        }

        // https://blogs.msdn.microsoft.com/daveremy/2010/03/16/non-recursive-post-order-depth-first-traversal-in-c/
        private static void NonRecursivePostOrder(Node root, Action<Node> visitor)
        {
            var toVisit = new Stack<Node>();
            var visitedAncestors = new Stack<Node>();
            toVisit.Push(root);
            while (toVisit.Count > 0)
            {
                var node = toVisit.Peek();
                if (node.Children.Count > 0)
                {
                    if (visitedAncestors.PeekOrDefault() != node)
                    {
                        visitedAncestors.Push(node);
                        toVisit.PushReverse(node.Children);
                        continue;
                    }
                    visitedAncestors.Pop();
                }
                visitor(node);
                //Console.Write(node.Id);
                toVisit.Pop();
            }
        }
    }


    static class StackHelper
    {

        public static Node PeekOrDefault(this Stack<Node> s)
        {
            return s.Count == 0 ? null : s.Peek();
        }

        public static void PushReverse(this Stack<Node> s, List<Node> list)
        {
            foreach (var l in list.ToArray().Reverse())
            {
                s.Push(l);
            }
        }
    }


}
