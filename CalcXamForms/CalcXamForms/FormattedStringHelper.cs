using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace CalcXamForms
{
    internal static class FormattedStringHelper
    {
        public static FormattedString Copy(this FormattedString fs)
        {
            FormattedString result = new FormattedString();
            foreach (Span span in fs.Spans)
            {
                Span copy_span = new Span()
                {
                    BackgroundColor = span.BackgroundColor,
                    Font = span.Font,
                    FontAttributes = span.FontAttributes,
                    FontFamily = span.FontFamily,
                    FontSize = span.FontSize,
                    ForegroundColor = span.ForegroundColor,
                    Text = span.Text
                };
                result.Spans.Add(copy_span);
            }
            return result;
        }
    }
}
