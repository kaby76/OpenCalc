using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

namespace CalcXamForms
{
    class Res
    {
        public bool IsComplete;
        public double Value;
    }

    class VisitorCalc : calculatorBaseVisitor<Res>
    {
        public Dictionary<IParseTree, Res> Results = new Dictionary<IParseTree, Res>();

        public override Res VisitArgument_list([NotNull] calculatorParser.Argument_listContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount != 1)
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
            try
            {
                Res r = Results[context.GetChild(0)];
                Res res = new CalcXamForms.Res
                {
                    IsComplete = r.IsComplete,
                    Value = r.Value
                };
                Results[context] = res;
                return res;
            }
            catch (Exception)
            {
            }
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
        }

        public override Res VisitArgument([NotNull] calculatorParser.ArgumentContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount != 1)
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
            try
            {
                Res r = Results[context.GetChild(0)];
                Res res = new CalcXamForms.Res
                {
                    IsComplete = r.IsComplete,
                    Value = r.Value
                };
                Results[context] = res;
                return res;
            }
            catch (Exception)
            {
            }
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
        }

        public override Res VisitArgument_value([NotNull] calculatorParser.Argument_valueContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount != 1)
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
            try
            {
                Res r = Results[context.GetChild(0)];
                Res res = new CalcXamForms.Res
                {
                    IsComplete = r.IsComplete,
                    Value = r.Value
                };
                Results[context] = res;
                return res;
            }
            catch (Exception)
            {
            }
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
        }

        public override Res VisitExpressionResult([NotNull] calculatorParser.ExpressionResultContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
            if (context.ChildCount == 1)
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
            {
                Res res = Results[context.GetChild(0)];
                Results[context] = res;
                return res;
            }
        }

        public override Res VisitExpression([NotNull] calculatorParser.ExpressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return res;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitLiteral([NotNull] calculatorParser.LiteralContext context)
        {
            try
            {
                string str = context.GetText();
                double val = Convert.ToDouble(str);
                Res res = new CalcXamForms.Res { IsComplete = true, Value = val };
                Results[context] = res;
                return res;
            }
            catch (Exception)
            {
            }
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
        }

        public override Res VisitPrimary_expression_start([NotNull] calculatorParser.Primary_expression_startContext context)
        {
            if (context.children != null)
                foreach (var c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 1)
            {
                Res lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
        }

        public override Res VisitPrimary_expression([NotNull] calculatorParser.Primary_expressionContext context)
        {
            if (context.children != null)
                foreach (var c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 1)
            {
                Res lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            if (context.ChildCount == 2 && context.GetChild(1) as calculatorParser.Method_invocation2Context != null)
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                calculatorParser.Method_invocation2Context mi =
                    context.GetChild(1) as calculatorParser.Method_invocation2Context;
                // Evaluate....
                string fun = context.GetChild(0).GetText();
                if (fun == "sin")
                {
                    if (mi.ChildCount == 3)
                    {
                        Res rhs = Results[mi.GetChild(1)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Sin(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                    else if (mi.ChildCount == 1)
                    {
                        Res rhs = Results[mi.GetChild(0)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Sin(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                }
                else if (fun == "cos")
                {
                    if (mi.ChildCount == 3)
                    {
                        Res rhs = Results[mi.GetChild(1)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Cos(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                    else if (mi.ChildCount == 1)
                    {
                        Res rhs = Results[mi.GetChild(0)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Cos(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                }
                else if (fun == "tan")
                {
                    if (mi.ChildCount == 3)
                    {
                        Res rhs = Results[mi.GetChild(1)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Tan(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                    else if (mi.ChildCount == 1)
                    {
                        Res rhs = Results[mi.GetChild(0)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Tan(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                }
                else if (fun == "arcsin")
                {
                    if (mi.ChildCount == 3)
                    {
                        Res rhs = Results[mi.GetChild(1)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Asin(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                    else if (mi.ChildCount == 1)
                    {
                        Res rhs = Results[mi.GetChild(0)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Asin(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                }
                else if (fun == "arccos")
                {
                    if (mi.ChildCount == 3)
                    {
                        Res rhs = Results[mi.GetChild(1)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Acos(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                    else if (mi.ChildCount == 1)
                    {
                        Res rhs = Results[mi.GetChild(0)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Acos(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                }
                else if (fun == "arctan")
                {
                    if (mi.ChildCount == 3)
                    {
                        Res rhs = Results[mi.GetChild(1)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Atan(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                    else if (mi.ChildCount == 1)
                    {
                        Res rhs = Results[mi.GetChild(0)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Atan(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                }
                else if (fun == "exp")
                {
                    if (mi.ChildCount == 3)
                    {
                        Res rhs = Results[mi.GetChild(1)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Exp(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                    else if (mi.ChildCount == 1)
                    {
                        Res rhs = Results[mi.GetChild(0)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Exp(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                }
                else if (fun == "ln")
                {
                    if (mi.ChildCount == 3)
                    {
                        Res rhs = Results[mi.GetChild(1)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Log(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                    else if (mi.ChildCount == 1)
                    {
                        Res rhs = Results[mi.GetChild(0)];
                        res.IsComplete = rhs.IsComplete;
                        if (rhs.IsComplete) res.Value = Math.Log(rhs.Value);
                        Results[context] = res;
                        return res;
                    }
                }
            }
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
        }

        public override Res VisitUnary_expression([NotNull] calculatorParser.Unary_expressionContext context)
        {
            if (context.children != null)
                foreach (var c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 1)
            {
                Res lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            if (context.ChildCount == 2)
            {
                Res rhs = Results[context.GetChild(1)];
                Res res = new Res() { IsComplete = rhs.IsComplete, Value = 0 };
                IParseTree op_pt = context.GetChild(0);
                string op = op_pt.GetText();
                if (op == "+") res.Value = rhs.Value;
                else if (op == "-") res.Value = -rhs.Value;
                Results[context] = res;
                return res;
            }
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
        }

        public override Res VisitMultiplicative_expression([NotNull] calculatorParser.Multiplicative_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return lhs;
            }
            res.Value = lhs.Value;
            int count = 0;
            res.IsComplete = lhs.IsComplete;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Res rhs = Results[context.GetChild(count + 2)];
                res.IsComplete &= rhs.IsComplete;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "*" && rhs.IsComplete) res.Value *= rhs.Value;
                else if (op == "/" && rhs.IsComplete) res.Value /= rhs.Value;
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitAdditive_expression([NotNull] calculatorParser.Additive_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return res;
            }
            res.Value = lhs.Value;
            int count = 0;
            res.IsComplete = lhs.IsComplete;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Res rhs = Results[context.GetChild(count + 2)];
                res.IsComplete &= rhs.IsComplete;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "+") res.Value += rhs.Value;
                else if (op == "-") res.Value -= rhs.Value;
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitShift_expression([NotNull] calculatorParser.Shift_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return res;
            }
            res.Value = lhs.Value;
            int count = 0;
            res.IsComplete = lhs.IsComplete;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Res rhs = Results[context.GetChild(count + 2)];
                res.IsComplete &= rhs.IsComplete;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "<<") res.Value = (int)res.Value << (int)rhs.Value;
                else if (op == ">>") res.Value = (int)res.Value >> (int)rhs.Value;
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitRelational_expression([NotNull] calculatorParser.Relational_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return res;
            }
            res.Value = lhs.Value;
            int count = 0;
            res.IsComplete = lhs.IsComplete;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Res rhs = Results[context.GetChild(count + 2)];
                res.IsComplete &= rhs.IsComplete;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "<") res.Value = res.Value < rhs.Value ? 1 : 0;
                else if (op == ">") res.Value = res.Value > rhs.Value ? 1 : 0;
                else if (op == "<=") res.Value = res.Value <= rhs.Value ? 1 : 0;
                else if (op == ">=") res.Value = res.Value >= rhs.Value ? 1 : 0;
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitEquality_expression([NotNull] calculatorParser.Equality_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return res;
            }
            res.Value = lhs.Value;
            int count = 0;
            res.IsComplete = lhs.IsComplete;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Res rhs = Results[context.GetChild(count + 2)];
                res.IsComplete &= rhs.IsComplete;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "==") res.Value = res.Value == rhs.Value ? 1 : 0;
                else if (op == "!=") res.Value = res.Value != rhs.Value ? 1 : 0;
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitAnd_expression([NotNull] calculatorParser.And_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return res;
            }
            res.Value = lhs.Value;
            int count = 0;
            res.IsComplete = lhs.IsComplete;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Res rhs = Results[context.GetChild(count + 2)];
                res.IsComplete &= rhs.IsComplete;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "&") res.Value = ((int)res.Value) & ((int)rhs.Value);
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitExclusive_or_expression([NotNull] calculatorParser.Exclusive_or_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return res;
            }
            res.Value = lhs.Value;
            int count = 0;
            res.IsComplete = lhs.IsComplete;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Res rhs = Results[context.GetChild(count + 2)];
                res.IsComplete &= rhs.IsComplete;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "^") res.Value = ((int)res.Value) ^ ((int)rhs.Value);
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitInclusive_or_expression([NotNull] calculatorParser.Inclusive_or_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return res;
            }
            res.Value = lhs.Value;
            int count = 0;
            res.IsComplete = lhs.IsComplete;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Res rhs = Results[context.GetChild(count + 2)];
                res.IsComplete &= rhs.IsComplete;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "|") res.Value = ((int)res.Value) | ((int)rhs.Value);
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitConditional_and_expression([NotNull] calculatorParser.Conditional_and_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return res;
            }
            res.Value = lhs.Value;
            int count = 0;
            res.IsComplete = lhs.IsComplete;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Res rhs = Results[context.GetChild(count + 2)];
                res.IsComplete &= rhs.IsComplete;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "&&") res.Value = (res.Value == 1) && (rhs.Value == 1) ? 1 : 0;
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitConditional_or_expression([NotNull] calculatorParser.Conditional_or_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return res;
            }
            res.Value = lhs.Value;
            int count = 0;
            res.IsComplete = lhs.IsComplete;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Res rhs = Results[context.GetChild(count + 2)];
                res.IsComplete &= rhs.IsComplete;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "||") res.Value = (res.Value == 1) || (rhs.Value == 1) ? 1 : 0;
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitNull_coalescing_expression([NotNull] calculatorParser.Null_coalescing_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return res;
            }
            res.Value = lhs.Value;
            int count = 0;
            res.IsComplete = lhs.IsComplete;
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                Res rhs = Results[context.GetChild(count + 2)];
                res.IsComplete &= rhs.IsComplete;
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "??") res.Value = rhs.Value;
                count += 2;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitConditional_expression([NotNull] calculatorParser.Conditional_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return res;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitNon_assignment_expression([NotNull] calculatorParser.Non_assignment_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            Res lhs = Results[context.GetChild(0)];
            if (context.ChildCount == 1)
            {
                Results[context] = lhs;
                return res;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitIdentifier([NotNull] calculatorParser.IdentifierContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = true, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            Results[context] = res;
            return res;
        }

        public override Res VisitType_argument_list_opt([NotNull] calculatorParser.Type_argument_list_optContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = true, Value = 0 };
            Results[context] = res;
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0)
            {
                Results[context] = res;
                return res;
            }
            res.IsComplete = false;
            Results[context] = res;
            return res;
        }

        public override Res VisitMethod_invocation2([NotNull] calculatorParser.Method_invocation2Context context)
        {
            Res res = new CalcXamForms.Res { IsComplete = true, Value = 0 };
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 3)
            {
                Res r = Results[context.GetChild(1)];
                res.IsComplete &= r.IsComplete;
            }
            else if (context.ChildCount == 1)
            {
                Res r = Results[context.GetChild(0)];
                res.IsComplete &= r.IsComplete;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitSimple_name([NotNull] calculatorParser.Simple_nameContext context)
        {
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            Res res = new CalcXamForms.Res { IsComplete = true, Value = 0 };
            Results[context] = res;
            return res;
        }

        public override Res VisitParenthesized_expression([NotNull] calculatorParser.Parenthesized_expressionContext context)
        {
            Res res = new CalcXamForms.Res { IsComplete = true, Value = 0 };
            if (context.children != null)
                foreach (IParseTree c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 3)
            {
                Res r = Results[context.GetChild(1)];
                res.IsComplete &= r.IsComplete;
                res.Value = r.Value;
            }
            Results[context] = res;
            return res;
        }

        public override Res VisitAssignment([NotNull] calculatorParser.AssignmentContext context)
        {
            throw new Exception("Assignment not allowed.");
        }
    }
}
