using System;
using System.Collections.Generic;
using System.Reflection;
using System.Linq.Expressions;
using System.Text.RegularExpressions;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

namespace CalcXamForms.Trees
{
    public class ComputeLinqExpr : calculatorBaseVisitor<Expression>
    {
        // In order to compute values of sub-expressions, keep computed Expression values for each subtree.
        public Dictionary<IParseTree, Expression> Results = new Dictionary<IParseTree, Expression>();

        private ComputeCompleteness _completeness;

        public ComputeLinqExpr(ComputeCompleteness completeness)
            : base()
        {
            _completeness = completeness;
        }


        public override Expression VisitExpressionResult([NotNull] calculatorParser.ExpressionResultContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (_completeness.Results[context])
            {
                Expression lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            Results[context] = null;
            return null;
        }

        public override Expression VisitExpression([NotNull] calculatorParser.ExpressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (_completeness.Results[context])
            {
                Expression lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            Results[context] = null;
            return null;
        }

        public override Expression VisitIdentifier([NotNull] calculatorParser.IdentifierContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            var expr = Expression.Variable(typeof(double), context.GetText());
            Results[context] = expr;
            return expr;
        }

        public override Expression VisitLiteral([NotNull] calculatorParser.LiteralContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            var child = context.children[0];
            if (child is TerminalNodeImpl)
            {
                TerminalNodeImpl c2 = child as TerminalNodeImpl;
                IToken sym = c2.Symbol;
                int type = sym.Type;
                switch (type)
                {
                    case calculatorParser.REAL_LITERAL:
                        try
                        {
                            string str = context.GetText();
                            double val = Convert.ToDouble(str);
                            Expression result = Expression.Constant((double) val, typeof(double));
                            Results[context] = result;
                            return result;
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
                            Expression result = Expression.Constant((double) val, typeof(double));
                            Results[context] = result;
                            return result;
                        }
                        catch (Exception)
                        {
                        }
                        return null;

                    case calculatorParser.TRUE:
                    {
                        Expression result = Expression.Constant(true, typeof(bool));
                        Results[context] = result;
                        return result;
                    }

                    case calculatorParser.FALSE:
                    {
                        Expression result = Expression.Constant(false, typeof(bool));
                        Results[context] = result;
                        return result;
                    }

                    default:
                    {
                        Expression result = null;
                        Results[context] = result;
                        return result;
                    }
                }
            }
            else
            {
                if (_completeness.Results[context])
                {
                    Expression lhs = Results[context.GetChild(0)];
                    Results[context] = lhs;
                    return lhs;
                }
                Results[context] = null;
                return null;
            }
        }

        public override Expression VisitBoolean_literal([NotNull] calculatorParser.Boolean_literalContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            var child = context.children[0];
            if (!(child is TerminalNodeImpl)) return null;
            try
            {
                string str = context.GetText();
                bool val = Convert.ToBoolean(str);
                Expression result = Expression.Constant(val, typeof(bool));
                Results[context] = result;
                return result;
            }
            catch (Exception)
            {
            }
            return null;
        }

        public override Expression VisitBoolean_expression([NotNull] calculatorParser.Boolean_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (_completeness.Results[context])
            {
                Expression lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            Results[context] = null;
            return null;
        }

        public override Expression VisitConstant_expression([NotNull] calculatorParser.Constant_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (_completeness.Results[context])
            {
                Expression lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            Results[context] = null;
            return null;
        }

        public override Expression VisitPrimary_expression_start([NotNull] calculatorParser.Primary_expression_startContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (_completeness.Results[context])
            {
                Expression lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            Results[context] = null;
            return null;
        }

        public override Expression VisitPrimary_expression([NotNull] calculatorParser.Primary_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (_completeness.Results[context])
            {
                if (context.ChildCount == 1)
                {
                    Expression lhs = Results[context.GetChild(0)];
                    Results[context] = lhs;
                    return lhs;
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
                        if (mi.ChildCount == 3) rhs = Results[mi.children[1]];
                        else if (mi.ChildCount == 1) rhs = Results[mi.children[0]];
                        return Expression.Call(typeof(Math).GetTypeInfo().GetDeclaredMethod(fun), rhs);
                    }
                }
            }
            Results[context] = null;
            return null;
        }

        public override Expression VisitUnary_expression([NotNull] calculatorParser.Unary_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (_completeness.Results[context])
            {
                if (context.ChildCount == 1)
                {
                    Expression lhs = Results[context.GetChild(0)];
                    Results[context] = lhs;
                    return lhs;
                }
                if (context.ChildCount == 2)
                {
                    Expression rhs = Results[context.children[1]];
                    IParseTree op_pt = context.GetChild(0);
                    string op = op_pt.GetText();
                    if (op == "+") return Expression.UnaryPlus(rhs);
                    else if (op == "-") return Expression.Negate(rhs);
                }
            }
            Results[context] = null;
            return null;
        }

        public override Expression VisitAdditive_expression([NotNull] calculatorParser.Additive_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children) Visit(c);
            if (context.ChildCount == 0)
            {
                Results[context] = null;
                return null;
            }
            Expression lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount;)
            {
                // LHS partially computed.

                // Get op.
                string op = "";
                if (count + 1 < context.ChildCount)
                {
                    IParseTree op_pt = context.GetChild(count + 1);
                    op = op_pt.GetText();
                }

                // Get RHS, and update LHS.
                if (count + 2 < context.ChildCount && _completeness.Results[context.GetChild(count + 2)])
                {
                    Expression rhs = Results[context.GetChild(count + 2)];
                    if (op == "+") lhs = Expression.Add(lhs, rhs);
                    else if (op == "-") lhs = Expression.Subtract(lhs, rhs);
                }

                count += 2;
            }
            Results[context] = lhs;
            return lhs;
        }

        public override Expression VisitMultiplicative_expression([NotNull] calculatorParser.Multiplicative_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children) Visit(c);
            if (context.ChildCount == 0)
            {
                Results[context] = null;
                return null;
            }
            Expression lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount;)
            {
                // LHS partially computed.

                // Get op.
                string op = "";
                if (count + 1 < context.ChildCount)
                {
                    IParseTree op_pt = context.GetChild(count + 1);
                    op = op_pt.GetText();
                }

                // Get RHS, and update LHS.
                if (count + 2 < context.ChildCount && _completeness.Results[context.GetChild(count + 2)])
                {
                    Expression rhs = Results[context.GetChild(count + 2)];
                    if (op == "*") lhs = Expression.Multiply(lhs, rhs);
                    else if (op == "/") lhs = Expression.Divide(lhs, rhs);
                }

                count += 2;
            }
            Results[context] = lhs;
            return lhs;
        }

        public override Expression VisitShift_expression([NotNull] calculatorParser.Shift_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children) Visit(c);
            if (context.ChildCount == 0)
            {
                Results[context] = null;
                return null;
            }
            Expression lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount;)
            {
                // LHS partially computed.

                // Get op.
                string op = "";
                if (count + 1 < context.ChildCount)
                {
                    IParseTree op_pt = context.GetChild(count + 1);
                    op = op_pt.GetText();
                }

                // Get RHS, and update LHS.
                if (count + 2 < context.ChildCount && _completeness.Results[context.GetChild(count + 2)])
                {
                    Expression rhs = Results[context.GetChild(count + 2)];
                    if (op == ">>") lhs = Expression.RightShift(lhs, rhs);
                    else if (op == "<<") lhs = Expression.LeftShift(lhs, rhs);
                }

                count += 2;
            }
            Results[context] = lhs;
            return lhs;
        }

        public override Expression VisitRelational_expression([NotNull] calculatorParser.Relational_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children) Visit(c);
            if (context.ChildCount == 0)
            {
                Results[context] = null;
                return null;
            }
            Expression lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount;)
            {
                // LHS partially computed.

                // Get op.
                string op = "";
                if (count + 1 < context.ChildCount)
                {
                    IParseTree op_pt = context.GetChild(count + 1);
                    op = op_pt.GetText();
                }

                // Get RHS, and update LHS.
                if (count + 2 < context.ChildCount && _completeness.Results[context.GetChild(count + 2)])
                {
                    Expression rhs = Results[context.GetChild(count + 2)];
                    if (op == ">") lhs = Expression.GreaterThan(lhs, rhs);
                    else if (op == "<") lhs = Expression.LessThan(lhs, rhs);
                    else if (op == ">=") lhs = Expression.GreaterThanOrEqual(lhs, rhs);
                    else if (op == "<=") lhs = Expression.LessThanOrEqual(lhs, rhs);
                }

                count += 2;
            }
            Results[context] = lhs;
            return lhs;
        }

        public override Expression VisitEquality_expression([NotNull] calculatorParser.Equality_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children) Visit(c);
            if (context.ChildCount == 0)
            {
                Results[context] = null;
                return null;
            }
            Expression lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount;)
            {
                // LHS partially computed.

                // Get op.
                string op = "";
                if (count + 1 < context.ChildCount)
                {
                    IParseTree op_pt = context.GetChild(count + 1);
                    op = op_pt.GetText();
                }

                // Get RHS, and update LHS.
                if (count + 2 < context.ChildCount && _completeness.Results[context.GetChild(count + 2)])
                {
                    Expression rhs = Results[context.GetChild(count + 2)];
                    if (op == "==") lhs = Expression.Equal(lhs, rhs);
                    else if (op == "!=") lhs = Expression.NotEqual(lhs, rhs);
                }

                count += 2;
            }
            Results[context] = lhs;
            return lhs;
        }

        public override Expression VisitAnd_expression([NotNull] calculatorParser.And_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children) Visit(c);
            if (context.ChildCount == 0)
            {
                Results[context] = null;
                return null;
            }
            Expression lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount;)
            {
                // LHS partially computed.

                // Get op.
                string op = "";
                if (count + 1 < context.ChildCount)
                {
                    IParseTree op_pt = context.GetChild(count + 1);
                    op = op_pt.GetText();
                }

                // Get RHS, and update LHS.
                if (count + 2 < context.ChildCount && _completeness.Results[context.GetChild(count + 2)])
                {
                    Expression rhs = Results[context.GetChild(count + 2)];
                    if (op == "&") lhs = Expression.And(lhs, rhs);
                }

                count += 2;
            }
            Results[context] = lhs;
            return lhs;
        }

        public override Expression VisitInclusive_or_expression([NotNull] calculatorParser.Inclusive_or_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children) Visit(c);
            if (context.ChildCount == 0)
            {
                Results[context] = null;
                return null;
            }
            Expression lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount;)
            {
                // LHS partially computed.

                // Get op.
                string op = "";
                if (count + 1 < context.ChildCount)
                {
                    IParseTree op_pt = context.GetChild(count + 1);
                    op = op_pt.GetText();
                }

                // Get RHS, and update LHS.
                if (count + 2 < context.ChildCount && _completeness.Results[context.GetChild(count + 2)])
                {
                    Expression rhs = Results[context.GetChild(count + 2)];
                    if (op == "|") lhs = Expression.Or(lhs, rhs);
                }

                count += 2;
            }
            Results[context] = lhs;
            return lhs;
        }

        public override Expression VisitExclusive_or_expression([NotNull] calculatorParser.Exclusive_or_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children) Visit(c);
            if (context.ChildCount == 0)
            {
                Results[context] = null;
                return null;
            }
            Expression lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount;)
            {
                // LHS partially computed.

                // Get op.
                string op = "";
                if (count + 1 < context.ChildCount)
                {
                    IParseTree op_pt = context.GetChild(count + 1);
                    op = op_pt.GetText();
                }

                // Get RHS, and update LHS.
                if (count + 2 < context.ChildCount && _completeness.Results[context.GetChild(count + 2)])
                {
                    Expression rhs = Results[context.GetChild(count + 2)];
                    if (op == "^") lhs = Expression.ExclusiveOr(lhs, rhs);
                }

                count += 2;
            }
            Results[context] = lhs;
            return lhs;
        }

        public override Expression VisitConditional_and_expression([NotNull] calculatorParser.Conditional_and_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children) Visit(c);
            if (context.ChildCount == 0)
            {
                Results[context] = null;
                return null;
            }
            Expression lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount;)
            {
                // LHS partially computed.

                // Get op.
                string op = "";
                if (count + 1 < context.ChildCount)
                {
                    IParseTree op_pt = context.GetChild(count + 1);
                    op = op_pt.GetText();
                }

                // Get RHS, and update LHS.
                if (count + 2 < context.ChildCount && _completeness.Results[context.GetChild(count + 2)])
                {
                    Expression rhs = Results[context.GetChild(count + 2)];
                    if (op == "&&") lhs = Expression.And(lhs, rhs);
                }

                count += 2;
            }
            Results[context] = lhs;
            return lhs;
        }

        public override Expression VisitConditional_or_expression([NotNull] calculatorParser.Conditional_or_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children) Visit(c);
            if (context.ChildCount == 0)
            {
                Results[context] = null;
                return null;
            }
            Expression lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount;)
            {
                // LHS partially computed.

                // Get op.
                string op = "";
                if (count + 1 < context.ChildCount)
                {
                    IParseTree op_pt = context.GetChild(count + 1);
                    op = op_pt.GetText();
                }

                // Get RHS, and update LHS.
                if (count + 2 < context.ChildCount && _completeness.Results[context.GetChild(count + 2)])
                {
                    Expression rhs = Results[context.GetChild(count + 2)];
                    if (op == "||") lhs = Expression.Or(lhs, rhs);
                }

                count += 2;
            }
            Results[context] = lhs;
            return lhs;
        }

        public override Expression VisitNull_coalescing_expression([NotNull] calculatorParser.Null_coalescing_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children) Visit(c);
            if (context.ChildCount == 0)
            {
                Results[context] = null;
                return null;
            }
            Expression lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            for (; count < context.ChildCount;)
            {
                // LHS partially computed.

                // Get op.
                string op = "";
                if (count + 1 < context.ChildCount)
                {
                    IParseTree op_pt = context.GetChild(count + 1);
                    op = op_pt.GetText();
                }

                // Get RHS, and update LHS.
                if (count + 2 < context.ChildCount && _completeness.Results[context.GetChild(count + 2)])
                {
                    Expression rhs = Results[context.GetChild(count + 2)];
                    if (op == "??") lhs = rhs;
                }

                count += 2;
            }
            Results[context] = lhs;
            return lhs;
        }

        public override Expression VisitConditional_expression([NotNull] calculatorParser.Conditional_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (_completeness.Results[context])
            {
                if (context.ChildCount == 1)
                {
                    Expression lhs = Results[context.GetChild(0)];
                    Results[context] = lhs;
                    return lhs;
                }
            }
            Results[context] = null;
            return null;
        }

        public override Expression VisitNon_assignment_expression([NotNull] calculatorParser.Non_assignment_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (_completeness.Results[context])
            {
                if (context.ChildCount == 1)
                {
                    Expression lhs = Results[context.GetChild(0)];
                    Results[context] = lhs;
                    return lhs;
                }
            }
            Results[context] = null;
            return null;
        }

        public override Expression VisitSimple_name([NotNull] calculatorParser.Simple_nameContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (_completeness.Results[context])
            {
                if (context.ChildCount == 1)
                {
                    Expression lhs = Results[context.GetChild(0)];
                    Results[context] = lhs;
                    return lhs;
                }
            }
            Results[context] = null;
            return null;
        }

        public override Expression VisitParenthesized_expression([NotNull] calculatorParser.Parenthesized_expressionContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (_completeness.Results[context])
            {
                if (context.ChildCount == 1)
                {
                    Expression lhs = Results[context.GetChild(0)];
                    Results[context] = lhs;
                    return lhs;
                }
                if (context.ChildCount == 3)
                {
                    Expression lhs = Results[context.GetChild(1)];
                    Results[context] = lhs;
                    return lhs;
                }
            }
            Results[context] = null;
            return null;
        }

        public override Expression Visit(IParseTree node)
        {
            // Hack. There is no language construct that says "all Visit*()"
            // methods must be implemented all tree node types used.
            // So, get the node type, and use reflection on this class to find
            // a visit method overriden for the node type. If not, throw
            // "not implemented".
            if (node as TerminalNodeImpl == null)
            {
                Type type = node.GetType();
                Type this_type = this.GetType();
                string type_name = type.Name;
                // node type:   Parenthesized_expressionContext
                // method name: VisitParenthesized_expression
                Regex regex = new Regex("Context$");
                string name = regex.Replace(type_name, "");
                string method_name = "Visit" + name;
                IEnumerable<MethodInfo> m = this_type.GetTypeInfo().GetDeclaredMethods(method_name);
                if (!m.GetEnumerator().MoveNext())
                {
                    ParserRuleContext where = node as ParserRuleContext;
                    IToken token = where.Start;
                    int index = token.StartIndex;
                    // No method by the given name exists, which means it's unimplemented.
                    throw new Helpers.EvaluationException("unimplemented feature (" + name + ")", index);
                }
            }
            return node.Accept(this);
        }
    }
}
