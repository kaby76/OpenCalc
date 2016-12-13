using System;
using System.Collections.Generic;
using Antlr4.Runtime.Tree;
using Antlr4.Runtime;

namespace CalcXamForms
{
    internal class DFSVisitor
    {

        public static IEnumerable<IParseTree> DFS(ParserRuleContext root)
        {
            var toVisit = new Stack<IParseTree>();
            var visitedAncestors = new Stack<IParseTree>();
            toVisit.Push(root);
            while (toVisit.Count > 0)
            {
                IParseTree node = toVisit.Peek();
                if (node.ChildCount > 0)
                {
                    if (visitedAncestors.PeekOrDefault() != node)
                    {
                        visitedAncestors.Push(node);
                        for (int i = node.ChildCount - 1; i>=0; --i)
                        {
                            IParseTree o = node.GetChild(i);
                            Type t = o.GetType();
                            toVisit.Push(o);
                        }
                        continue;
                    }
                    visitedAncestors.Pop();
                }
                yield return node;
                //Console.Write(node.Id);
                toVisit.Pop();
            }
        }
    }

    static class StackHelper
    {
        public static IParseTree PeekOrDefault(this Stack<IParseTree> s)
        {
            return s.Count == 0 ? null : s.Peek();
        }
    }
}
