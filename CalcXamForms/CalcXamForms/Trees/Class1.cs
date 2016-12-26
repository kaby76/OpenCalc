using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Linq.Expressions;

namespace CalcXamForms.Trees
{
    public class Class1
    {
        public static void Foo()
        {
            {
                // Create an expression using expression lambda
                Expression<Func<int, int, int>> expression = (n1, n2) => n1 + n2;

                // Compile the expression
                Func<int, int, int> compiledExpression = expression.Compile();

                // Execute the expression. 
                int r1 = compiledExpression(3, 4); //return 7
            }
            {
                
                //Create the expression parameters
                ParameterExpression num1 = Expression.Parameter(typeof(int), "num1");
                ParameterExpression num2 = Expression.Parameter(typeof(int), "num2");

                //Create the expression parameters
                ParameterExpression[] parameters = new ParameterExpression[] { num1, num2 };

                //Create the expression body
                BinaryExpression body = Expression.Add(num1, num2);

                //Create the expression 
                Expression<Func<int, int, int>> expression = Expression.Lambda<Func<int, int, int>>(body, parameters);

                // Compile the expression
                Func<int, int, int> compiledExpression = expression.Compile();

                // Execute the expression. 
                int result = compiledExpression(3, 4); //return 7        }
            }
        }
    }
}
