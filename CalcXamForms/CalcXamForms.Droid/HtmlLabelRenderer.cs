using Android.Widget;
using System.ComponentModel;
using Android.Text;
using Android.Views;
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
                if (Control != null)
                {
                    HtmlLabel wer = Element as HtmlLabel;
                    Control?.SetText(Html.FromHtml(Element.Text, Android.Text.FromHtmlOptions.ModeLegacy), TextView.BufferType.Spannable);
                    TextView x = Control;
                    if (wer != null && wer.Align == HtmlLabel.Alignment.Right)
                        x.Gravity = Android.Views.GravityFlags.Right | Android.Views.GravityFlags.CenterVertical;
                    else if (wer != null && wer.Align == HtmlLabel.Alignment.Center)
                        x.Gravity = Android.Views.GravityFlags.Center | Android.Views.GravityFlags.CenterVertical;
                    else if (wer != null && wer.Align == HtmlLabel.Alignment.Left)
                        x.Gravity = Android.Views.GravityFlags.Left | Android.Views.GravityFlags.CenterVertical;
                }
            }
            else
            {
                if (Control != null)
                {
                    HtmlLabel wer = Element as HtmlLabel;
                    Control?.SetText(Html.FromHtml(Element.Text), TextView.BufferType.Spannable);
                    TextView x = Control;
                    if (wer != null && wer.Align == HtmlLabel.Alignment.Right)
                        x.Gravity = Android.Views.GravityFlags.Right | Android.Views.GravityFlags.CenterVertical;
                    else if (wer != null && wer.Align == HtmlLabel.Alignment.Center)
                        x.Gravity = Android.Views.GravityFlags.Center | Android.Views.GravityFlags.CenterVertical;
                    else if (wer != null && wer.Align == HtmlLabel.Alignment.Left)
                        x.Gravity = Android.Views.GravityFlags.Left | Android.Views.GravityFlags.CenterVertical;
                }
            }
        }

        protected override void OnElementPropertyChanged(object sender, PropertyChangedEventArgs e)
        {
            base.OnElementPropertyChanged(sender, e);

            if (e.PropertyName == Label.TextProperty.PropertyName)
            {
                if (Control != null)
                {
                    HtmlLabel wer = Element as HtmlLabel;
                    Control?.SetText(Html.FromHtml(Element.Text), TextView.BufferType.Spannable);
                    TextView x = Control;
                    if (wer != null && wer.Align == HtmlLabel.Alignment.Right)
                        x.Gravity = Android.Views.GravityFlags.Right | Android.Views.GravityFlags.CenterVertical;
                    else if (wer != null && wer.Align == HtmlLabel.Alignment.Center)
                        x.Gravity = Android.Views.GravityFlags.Center | Android.Views.GravityFlags.CenterVertical;
                    else if (wer != null && wer.Align == HtmlLabel.Alignment.Left)
                        x.Gravity = Android.Views.GravityFlags.Left | Android.Views.GravityFlags.CenterVertical;
                }
            }
        }
    }
}