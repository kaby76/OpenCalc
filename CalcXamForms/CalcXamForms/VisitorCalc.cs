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
                Res lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            Res result = new Res {IsComplete = true, Value = 0};
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                if (count == 0)
                {
                    Res lhs = Results[context.GetChild(count)];
                    result = new CalcXamForms.Res {IsComplete = lhs.IsComplete, Value = lhs.Value};
                }
                Res rhs = Results[context.GetChild(count + 2)];
                if (!result.IsComplete || !rhs.IsComplete)
                {
                    Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                    Results[context] = res;
                    return res;
                }
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "+") result.Value += rhs.Value;
                else if (op == "-") result.Value -= rhs.Value;
                else
                {
                    Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                    Results[context] = res;
                    return res;
                }
                count += 2;
            }
            if (count + 1 != context.ChildCount)
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
            Results[context] = result;
            return result;
        }

        public override Res VisitMultiplyingExpression([NotNull] calculatorParser.MultiplyingExpressionContext context)
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
                Res lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            Res result = new Res { IsComplete = true, Value = 0 };
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                if (count == 0)
                {
                    Res lhs = Results[context.GetChild(count)];
                    result = new CalcXamForms.Res { IsComplete = lhs.IsComplete, Value = lhs.Value };
                }
                Res rhs = Results[context.GetChild(count + 2)];
                if (!result.IsComplete || !rhs.IsComplete)
                {
                    Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                    Results[context] = res;
                    return res;
                }
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "*") result.Value *= rhs.Value;
                else if (op == "/") result.Value /= rhs.Value;
                else
                {
                    Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                    Results[context] = res;
                    return res;
                }
                count += 2;
            }
            if (count + 1 != context.ChildCount)
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
            Results[context] = result;
            return result;
        }

        public override Res VisitScientific([NotNull] calculatorParser.ScientificContext context)
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
                string str = context.GetChild(0).GetText();
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

        public override Res VisitAtom([NotNull] calculatorParser.AtomContext context)
        {
            if (context.children != null)
                foreach (var c in context.children)
                {
                    Visit(c);
                }
            if (context.ChildCount == 0 || context.ChildCount == 2)
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
            if (context.ChildCount == 1)
            {
                Res lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            if (context.ChildCount == 3)
            {
                Res lhs = Results[context.GetChild(1)];
                Results[context] = lhs;
                return lhs;
            }
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
        }

        public override Res VisitNumber([NotNull] calculatorParser.NumberContext context)
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

        public override Res VisitPowExpression([NotNull] calculatorParser.PowExpressionContext context)
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
                Res lhs = Results[context.GetChild(0)];
                Results[context] = lhs;
                return lhs;
            }
            int count = 0;
            Res result = new Res { IsComplete = true, Value = 0 };
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                if (count == 0)
                {
                    Res lhs = Results[context.GetChild(count)];
                    result = new CalcXamForms.Res { IsComplete = lhs.IsComplete, Value = lhs.Value };
                }
                Res rhs = Results[context.GetChild(count + 2)];
                if (!result.IsComplete || !rhs.IsComplete)
                {
                    Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                    Results[context] = res;
                    return res;
                }
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "^") result.Value = Math.Pow(result.Value, rhs.Value);
                else
                {
                    Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                    Results[context] = res;
                    return res;
                }
                count += 2;
            }
            if (count + 1 != context.ChildCount)
            {
                Res res = new CalcXamForms.Res { IsComplete = false, Value = 0 };
                Results[context] = res;
                return res;
            }
            Results[context] = result;
            return result;
        }
    }
}
