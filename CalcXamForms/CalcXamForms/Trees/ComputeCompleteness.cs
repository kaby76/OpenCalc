using System;
using System.Collections.Generic;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

namespace CalcXamForms.Trees
{
    public class ComputeCompleteness : calculatorBaseVisitor<bool>
    {
        public Dictionary<IParseTree, bool> Results = new Dictionary<IParseTree, bool>();

        public override bool VisitArgument_list([NotNull] calculatorParser.Argument_listContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount != 1)
            {
                Results[context] = false;
                return false;
            }
            try
            {
                bool r = Results[context.GetChild(0)];
                Results[context] = r;
                return r;
            }
            catch (Exception)
            {
            }
            {
                Results[context] = false;
                return false;
            }
        }

        public override bool VisitArgument([NotNull] calculatorParser.ArgumentContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount != 1)
            {
                Results[context] = false;
                return false;
            }
            try
            {
                bool r = Results[context.GetChild(0)];
                Results[context] = r;
                return r;
            }
            catch (Exception)
            {
            }
            {
                Results[context] = false;
                return false;
            }
        }

        public override bool VisitArgument_value([NotNull] calculatorParser.Argument_valueContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount != 1)
            {
                Results[context] = false;
                return false;
            }
            try
            {
                bool r = Results[context.GetChild(0)];
                Results[context] = r;
                return r;
            }
            catch (Exception)
            {
            }
            {
                Results[context] = false;
                return false;
            }
        }

        public override bool VisitExpressionResult([NotNull] calculatorParser.ExpressionResultContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = false;
                return false;
            }
            if (context.ChildCount == 1)
            {
                Results[context] = false;
                return false;
            }
            {
                bool res = Results[context.GetChild(0)];
                Results[context] = res;
                return res;
            }
        }

        public override bool VisitExpression([NotNull] calculatorParser.ExpressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = false;
                return false;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            Results[context] = false;
            return false;
        }

        public override bool VisitLiteral([NotNull] calculatorParser.LiteralContext context)
        {
            if (context.children != null)
                foreach (var c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            Results[context] = true;
            return true;
        }

        public override bool VisitBoolean_literal([NotNull] calculatorParser.Boolean_literalContext context)
        {
            if (context.children != null)
                foreach (var c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            Results[context] = true;
            return true;
        }

        public override bool VisitBoolean_expression([NotNull] calculatorParser.Boolean_expressionContext context)
        {
            if (context.children != null)
                foreach (var c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 1)
            {
                bool lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            {
                Results[context] = false;
                return false;
            }
        }

        public override bool VisitConstant_expression([NotNull] calculatorParser.Constant_expressionContext context)
        {
            if (context.children != null)
                foreach (var c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 1)
            {
                bool lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            {
                Results[context] = false;
                return false;
            }
        }

        public override bool VisitPrimary_expression_start([NotNull] calculatorParser.Primary_expression_startContext context)
        {
            if (context.children != null)
                foreach (var c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 1)
            {
                bool lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            {
                Results[context] = false;
                return false;
            }
        }

        public override bool VisitPrimary_expression([NotNull] calculatorParser.Primary_expressionContext context)
        {
            if (context.children != null)
                foreach (var c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 1)
            {
                bool lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            if (context.ChildCount == 2 && context.GetChild(1) as calculatorParser.Method_invocation2Context != null)
            {
                bool res = false;
                calculatorParser.Method_invocation2Context mi =
                    context.GetChild(1) as calculatorParser.Method_invocation2Context;
                string fun = context.GetChild(0).GetText();
                if (fun == "sin" ||
                    fun == "cos" ||
                    fun == "tan" ||
                    fun == "arcsin" ||
                    fun == "arccos" ||
                    fun == "arctan" ||
                    fun == "exp" ||
                    fun == "ln")
            {
                    if (mi.ChildCount == 3)
                    {
                        bool rhs = Results[mi.GetChild(1)];
                        res = rhs;
                        Results[context] = res;
                        return res;
                    }
                    else if (mi.ChildCount == 1)
                    {
                        bool rhs = Results[mi.GetChild(0)];
                        res = rhs;
                        Results[context] = res;
                        return res;
                    }
                }
            }
            {
                Results[context] = false;
                return false;
            }
        }

        public override bool VisitUnary_expression([NotNull] calculatorParser.Unary_expressionContext context)
        {
            if (context.children != null)
                foreach (var c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 1)
            {
                bool lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            if (context.ChildCount == 2)
            {
                bool rhs = Results[context.GetChild(1)];
                bool res = rhs;
                IParseTree op_pt = context.GetChild(0);
                string op = op_pt.GetText();
                Results[context] = res;
                return res;
            }
            {
                bool res = false;
                Results[context] = res;
                return res;
            }
        }

        public override bool VisitMultiplicative_expression([NotNull] calculatorParser.Multiplicative_expressionContext context)
        {
            bool res = false;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            res = lhs;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                bool rhs = Results[context.GetChild(count + 2)];
                res &= rhs;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitAdditive_expression([NotNull] calculatorParser.Additive_expressionContext context)
        {
            bool res = false;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            res = lhs;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                bool rhs = Results[context.GetChild(count + 2)];
                res &= rhs;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitShift_expression([NotNull] calculatorParser.Shift_expressionContext context)
        {
            bool res = false;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            res = lhs;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                bool rhs = Results[context.GetChild(count + 2)];
                res &= rhs;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitRelational_expression([NotNull] calculatorParser.Relational_expressionContext context)
        {
            bool res = false;
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            res = lhs;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                bool rhs = Results[context.GetChild(count + 2)];
                res &= rhs;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitEquality_expression([NotNull] calculatorParser.Equality_expressionContext context)
        {
            bool res = false;
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            res = lhs;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                bool rhs = Results[context.GetChild(count + 2)];
                res &= rhs;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitAnd_expression([NotNull] calculatorParser.And_expressionContext context)
        {
            bool res = false;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            res = lhs;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                bool rhs = Results[context.GetChild(count + 2)];
                res &= rhs;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitExclusive_or_expression([NotNull] calculatorParser.Exclusive_or_expressionContext context)
        {
            bool res = false;
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            res = lhs;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                bool rhs = Results[context.GetChild(count + 2)];
                res &= rhs;
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitInclusive_or_expression([NotNull] calculatorParser.Inclusive_or_expressionContext context)
        {
            bool res = false;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            res = lhs;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                bool rhs = Results[context.GetChild(count + 2)];
                res &= rhs;
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitConditional_and_expression([NotNull] calculatorParser.Conditional_and_expressionContext context)
        {
            bool res = false;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            res = lhs;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                bool rhs = Results[context.GetChild(count + 2)];
                res &= rhs;
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitConditional_or_expression([NotNull] calculatorParser.Conditional_or_expressionContext context)
        {
            bool res = false;
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            res = lhs;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                bool rhs = Results[context.GetChild(count + 2)];
                res &= rhs;
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitNull_coalescing_expression([NotNull] calculatorParser.Null_coalescing_expressionContext context)
        {
            bool res = false;
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            res = lhs;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                bool rhs = Results[context.GetChild(count + 2)];
                res &= rhs;
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitConditional_expression([NotNull] calculatorParser.Conditional_expressionContext context)
        {
            bool res = false;
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            Results[context] = lhs;
            return lhs;
        }

        public override bool VisitNon_assignment_expression([NotNull] calculatorParser.Non_assignment_expressionContext context)
        {
            bool res = false;
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            bool lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitIdentifier([NotNull] calculatorParser.IdentifierContext context)
        {
            bool res = false;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            Results[context] = res;
            return res;
        }

        public override bool VisitType_argument_list_opt([NotNull] calculatorParser.Type_argument_list_optContext context)
        {
            bool res = true;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            res = false;
            Results[context] = res;
            return res;
        }

        public override bool VisitMethod_invocation2([NotNull] calculatorParser.Method_invocation2Context context)
        {
            bool res = true;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 3)
            {
                bool r = Results[context.GetChild(1)];
                res &= r;
            }
            else if (context.ChildCount == 1)
            {
                var child = context.GetChild(0);
                bool r = Results[child];
                res &= r;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitSimple_name([NotNull] calculatorParser.Simple_nameContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            bool res = true;
            Results[context] = res;
            return res;
        }

        public override bool VisitParenthesized_expression([NotNull] calculatorParser.Parenthesized_expressionContext context)
        {
            bool res = true;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    if (!Visit(c))
                    {
                        Results[context] = false;
                        return false;
                    }
                }
            if (context.ChildCount == 3)
            {
                bool r = Results[context.GetChild(1)];
                res &= r;
            }
            Results[context] = res;
            return res;
        }

        public override bool VisitAssignment([NotNull] calculatorParser.AssignmentContext context)
        {
            throw new Exception("Assignment not allowed.");
        }

        public override bool Visit(IParseTree tree)
        {
            if (tree as TerminalNodeImpl != null)
            {
                Results[tree] = true;
                tree.Accept(this);
                return true;
            }
            return tree.Accept(this);
        }
    }
}
