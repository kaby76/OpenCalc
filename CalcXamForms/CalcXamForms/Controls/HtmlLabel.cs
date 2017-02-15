using Xamarin.Forms;

namespace CalcXamForms.Controls
{
    /// <summary>
    /// HtmlLabel -- see https://forums.xamarin.com/discussion/comment/167131#Comment_167131
    /// </summary>
    public class HtmlLabel : Label
    {
        public enum Alignment { Left = 0, Center, Right };

        public HtmlLabel()
            : base()
        {
            Text = "";
        }

        public HtmlLabel(string t)
            : base()
        {
            Text = t;
        }

        public Alignment Align
        {
            get; set;
        } = Alignment.Center;
    }
}
