using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
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


        public override Expression VisitExpressionResult([NotNull] calculatorParser.ExpressionResultContext context)
        {
            if (!_completeness.Results[context]) return null;
            return Visit(context.GetChild(0));
        }
        public override Expression VisitExpression([NotNull] calculatorParser.ExpressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            return Visit(context.GetChild(0));
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

        public override Expression VisitPrimary_expression_start([NotNull] calculatorParser.Primary_expression_startContext context)
        {
            if (!_completeness.Results[context]) return null;
            return Visit(context.GetChild(0));
        }

        public override Expression VisitPrimary_expression([NotNull] calculatorParser.Primary_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            if (context.ChildCount == 1)
            {
                return Visit(context.children[0]);
            }
            if (context.ChildCount == 2 && context.GetChild(1) as calculatorParser.Method_invocation2Context != null)
            {
                calculatorParser.Method_invocation2Context mi =
                    context.GetChild(1) as calculatorParser.Method_invocation2Context;
                string fun = context.GetChild(0).GetText();
                if (fun == "Sin" ||
                    fun == "Cos" ||
                    fun == "Tan" ||
                    fun == "Asin" ||
                    fun == "Acos" ||
                    fun == "Atan"
                    )
                {
                    Expression rhs = null;
                    if (mi.ChildCount == 3) rhs = Visit(mi.children[1]);
                    else if (mi.ChildCount == 1) rhs = Visit(mi.children[0]);
                    return Expression.Call(typeof(Math).GetTypeInfo().GetDeclaredMethod(fun), rhs);
                }
            }
            return null;
        }

        public override Expression VisitUnary_expression([NotNull] calculatorParser.Unary_expressionContext context)
        {
            if (context.ChildCount == 1)
            {
                return Visit(context.children[0]);
            }
            if (context.ChildCount == 2)
            {
                Expression rhs = Visit(context.children[1]);
                IParseTree op_pt = context.GetChild(0);
                string op = op_pt.GetText();
                if (op == "+") return Expression.UnaryPlus(rhs);
                else if (op == "-") return Expression.Negate(rhs);
            }
            return null;
        }

        public override Expression VisitAdditive_expression([NotNull] calculatorParser.Additive_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Expression rhs = child_expression[count + 2];
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "+") lhs = Expression.Add(lhs, rhs);
                else if (op == "-") lhs = Expression.Subtract(lhs, rhs);
                count += 2;
            }
            return lhs;
        }

        public override Expression VisitMultiplicative_expression([NotNull] calculatorParser.Multiplicative_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Expression rhs = child_expression[count + 2];
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "*") lhs = Expression.Multiply(lhs, rhs);
                else if (op == "/") lhs = Expression.Divide(lhs, rhs);
                count += 2;
            }
            return lhs;
        }

        public override Expression VisitShift_expression([NotNull] calculatorParser.Shift_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Expression rhs = child_expression[count + 2];
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == ">>") lhs = Expression.RightShift(lhs, rhs);
                else if (op == "<<") lhs = Expression.LeftShift(lhs, rhs);
                count += 2;
            }
            return lhs;
        }

        public override Expression VisitRelational_expression([NotNull] calculatorParser.Relational_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Expression rhs = child_expression[count + 2];
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == ">") lhs = Expression.GreaterThan(lhs, rhs);
                else if (op == "<") lhs = Expression.LessThan(lhs, rhs);
                else if (op == ">=") lhs = Expression.GreaterThanOrEqual(lhs, rhs);
                else if (op == "<=") lhs = Expression.LessThanOrEqual(lhs, rhs);
                count += 2;
            }
            return lhs;
        }

        public override Expression VisitEquality_expression([NotNull] calculatorParser.Equality_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Expression rhs = child_expression[count + 2];
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "==") lhs = Expression.Equal(lhs, rhs);
                else if (op == "!=") lhs = Expression.NotEqual(lhs, rhs);
                count += 2;
            }
            return lhs;
        }

        public override Expression VisitAnd_expression([NotNull] calculatorParser.And_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Expression rhs = child_expression[count + 2];
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "&") lhs = Expression.And(lhs, rhs);
                count += 2;
            }
            return lhs;
        }

        public override Expression VisitInclusive_or_expression([NotNull] calculatorParser.Inclusive_or_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Expression rhs = child_expression[count + 2];
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "|") lhs = Expression.Or(lhs, rhs);
                count += 2;
            }
            return lhs;
        }

        public override Expression VisitExclusive_or_expression([NotNull] calculatorParser.Exclusive_or_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Expression rhs = child_expression[count + 2];
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "^") lhs = Expression.ExclusiveOr(lhs, rhs);
                count += 2;
            }
            return lhs;
        }

        public override Expression VisitConditional_and_expression([NotNull] calculatorParser.Conditional_and_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Expression rhs = child_expression[count + 2];
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "&&") lhs = Expression.And(lhs, rhs);
                count += 2;
            }
            return lhs;
        }

        public override Expression VisitConditional_or_expression([NotNull] calculatorParser.Conditional_or_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Expression rhs = child_expression[count + 2];
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "||") lhs = Expression.And(lhs, rhs);
                count += 2;
            }
            return lhs;
        }

        public override Expression VisitNull_coalescing_expression([NotNull] calculatorParser.Null_coalescing_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Expression rhs = child_expression[count + 2];
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "??") lhs = rhs;
                count += 2;
            }
            return lhs;
        }

        public override Expression VisitConditional_expression([NotNull] calculatorParser.Conditional_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            return null;
        }

        public override Expression VisitNon_assignment_expression([NotNull] calculatorParser.Non_assignment_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            return null;
        }

        public override Expression VisitSimple_name([NotNull] calculatorParser.Simple_nameContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            return null;
        }

        public override Expression VisitParenthesized_expression([NotNull] calculatorParser.Parenthesized_expressionContext context)
        {
            if (!_completeness.Results[context]) return null;
            Expression[] child_expression = new Expression[context.children.Count];
            for (int i = 0; i < context.ChildCount; ++i)
            {
                child_expression[i] = Visit(context.GetChild(i));
            }
            Expression lhs = child_expression[0];
            if (context.ChildCount == 1)
            {
                return lhs;
            }
            return null;
        }

        public override Expression Visit(IParseTree tree)
        {
            return tree.Accept(this);
        }
    }
}
