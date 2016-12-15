using Android.Widget;
using System.ComponentModel;
using Android.Text;
using CalcXamForms.Controls;
using CalcXamForms.Droid;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;
using System.Runtime.CompilerServices;
using System.Text;

[assembly: ExportRenderer(typeof(MyButton), typeof(MyButtonRenderer))]
namespace CalcXamForms.Droid
{
    class MyButtonRenderer : HtmlLabelRenderer
    {
        protected override void OnElementPropertyChanged(object sender, PropertyChangedEventArgs e)
        {
            base.OnElementPropertyChanged(sender, e);
            if (Control != null)
            {
                MyButton b = sender as MyButton;
                // Font size in html is not observed!
                // See http://stackoverflow.com/questions/7247113/using-size-html-attribute-in-textview
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < b.FSize / 10; ++i)
                    sb.Append("<big>");
                sb.Append(b.Fext);
                for (int i = 0; i < b.FSize / 10; ++i)
                    sb.Append("</big>");
                b.Text = sb.ToString();
            }
        }
    }
}