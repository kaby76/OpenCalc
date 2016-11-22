using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Antlr4.Runtime;

namespace CalcXamForms
{
    class DFSVisitor
    {

        public static IEnumerable<ParserRuleContext> DFS(ParserRuleContext root)
        {
            var toVisit = new Stack<ParserRuleContext>();
            var visitedAncestors = new Stack<ParserRuleContext>();
            toVisit.Push(root);
            while (toVisit.Count > 0)
            {
                var node = toVisit.Peek();
                if (node.children != null && node.children.Count > 0)
                {
                    if (visitedAncestors.PeekOrDefault() != node)
                    {
                        visitedAncestors.Push(node);
                        for (int i = node.children.Count-1; i>=0; --i)
                        {
                            object o = node.children[i];
                            bool as_prc = o as ParserRuleContext != null;
                            if (as_prc)
                                toVisit.Push(o as ParserRuleContext);
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
        public static ParserRuleContext PeekOrDefault(this Stack<ParserRuleContext> s)
        {
            return s.Count == 0 ? null : s.Peek();
        }
    }
}
