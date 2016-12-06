using Android.Widget;
using System.ComponentModel;
using Android.Text;
using CalcXamForms;
using CalcXamForms.Droid;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

[assembly: ExportRenderer(typeof(HtmlLabel), typeof(HtmlLabelRenderer))]
namespace CalcXamForms.Droid
{
    class HtmlLabelRenderer : LabelRenderer
    {
        protected override void OnElementChanged(ElementChangedEventArgs<Label> e)
        {
            base.OnElementChanged(e);
            if (Android.OS.Build.VERSION.SdkInt >= Android.OS.BuildVersionCodes.N)
            {
                Control?.SetText(Html.FromHtml(Element.Text, Android.Text.FromHtmlOptions.ModeLegacy), TextView.BufferType.Spannable);
            }
            else
            {
                Control?.SetText(Html.FromHtml(Element.Text), TextView.BufferType.Spannable);
            }
        }

        protected override void OnElementPropertyChanged(object sender, PropertyChangedEventArgs e)
        {
            base.OnElementPropertyChanged(sender, e);

            if (e.PropertyName == Label.TextProperty.PropertyName)
            {
                Control?.SetText(Html.FromHtml(Element.Text), TextView.BufferType.Spannable);
            }
        }
    }
}