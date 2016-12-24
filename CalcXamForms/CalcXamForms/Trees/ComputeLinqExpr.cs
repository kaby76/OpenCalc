using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

namespace CalcXamForms.Trees
{
    public class ComputeLinqExpr : calculatorBaseVisitor<Expression>
    {
        private ComputeCompleteness _completeness;

        public ComputeLinqExpr(ComputeCompleteness completeness)
            : base()
        {
            _completeness = completeness;
        }

        public override Expression VisitIdentifier([NotNull] calculatorParser.IdentifierContext context)
        {
            return base.VisitIdentifier(context);
        }

        public override Expression VisitLiteral([NotNull] calculatorParser.LiteralContext context)
        {
            if (!_completeness.Results[context]) return null;
            var child = context.children[0];
            if (!(child is TerminalNodeImpl)) return null;
            TerminalNodeImpl c = child as TerminalNodeImpl;
            IToken sym = c.Symbol;
            int type = sym.Type;
            switch (type)
            {
                case calculatorParser.REAL_LITERAL:
                    try
                    {
                        string str = context.GetText();
                        double val = Convert.ToDouble(str);
                        return Expression.Constant(val, typeof(double));
                    }
                    catch (Exception)
                    {
                    }
                    return null;
                case calculatorParser.INTEGER_LITERAL:
                    try
                    {
                        string str = context.GetText();
                        int val = Convert.ToInt32(str);
                        return Expression.Constant(val, typeof(int));
                    }
                    catch (Exception)
                    {
                    }
                    return null;
                default:
                    return null;
            }
        }

        public override Expression VisitBoolean_literal([NotNull] calculatorParser.Boolean_literalContext context)
        {
            if (!_completeness.Results[context]) return null;
            var child = context.children[0];
            if (!(child is TerminalNodeImpl)) return null;
            try
            {
                string str = context.GetText();
                bool val = Convert.ToBoolean(str);
                return Expression.Constant(val, typeof(bool));
            }
            catch (Exception)
            {
            }
            return null;
        }
    }
}
