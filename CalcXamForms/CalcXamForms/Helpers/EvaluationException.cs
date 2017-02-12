using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;

namespace CalcXamForms.Helpers
{
    public class EvaluationException : NotImplementedException
    {
        public int ErrorPos { get; set; }

        public EvaluationException(string error_message)
            : base(error_message)
        {
            ErrorPos = default(int);
        }

        public EvaluationException(string error_message, int error_pos)
            : base(error_message)
        {
            ErrorPos = error_pos;
        }
    }
}
