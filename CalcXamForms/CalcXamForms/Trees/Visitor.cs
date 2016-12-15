using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

namespace CalcXamForms.Trees
{

    class Visitor : CSharp4BaseVisitor<Res>
    {
        public override Res VisitPrimary_expression([NotNull] CSharp4Parser.Primary_expressionContext context)
        {
            return VisitChildren(context);
            Res result = new Res();
            return result;
        }

        public override Res VisitLiteral([NotNull] CSharp4Parser.LiteralContext context)
        {
            if (context.ChildCount != 1)
                return new CalcXamForms.Res { IsComplete = false, Value = 0 };
            try
            {
                string str = context.GetChild(0).GetText();
                double val = Convert.ToDouble(str);
                return new Res {IsComplete = true, Value = val};
            }
            catch (Exception)
            {
            }
            return new CalcXamForms.Res { IsComplete = false, Value = 0 };
        }

        public override Res VisitAdditive_expression([NotNull] CSharp4Parser.Additive_expressionContext context)
        {
            if (context.ChildCount == 0)
            {
                return new CalcXamForms.Res { IsComplete = false, Value = 0 };
            }
            if (context.ChildCount == 1)
            {
                Res lhs = Visit(context.GetChild(0));
                return lhs;
            }
            int count = 0;
            Res result = new Res {IsComplete = true, Value = 0};
            for (; count < context.ChildCount && count + 2 < context.ChildCount;)
            {
                if (count == 0)
                {
                    Res lhs = Visit(context.GetChild(count));
                    result = new CalcXamForms.Res {IsComplete = lhs.IsComplete, Value = lhs.Value};
                }
                Res rhs = Visit(context.GetChild(count + 2));
                if (!result.IsComplete || !rhs.IsComplete)
                    return new CalcXamForms.Res {IsComplete = false, Value = 0};
                IParseTree op_pt = context.GetChild(count + 1);
                string op = op_pt.GetText();
                if (op == "+") result.Value += rhs.Value;
                else if (op == "-") result.Value -= rhs.Value;
                else
                    return new CalcXamForms.Res { IsComplete = false, Value = 0 };
                count += 2;
            }
            if (count != context.ChildCount)
                return new CalcXamForms.Res { IsComplete = false, Value = 0 };
            return result;
        }
    }
}
