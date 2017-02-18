using System;
using System.Collections.Generic;
using System.Text;
using System.ComponentModel;
using CalcXamForms;
using CalcXamForms.Controls;
using CalcXamForms.iOS.Renderers;
using Foundation;
using UIKit;
using Xamarin.Forms;
using Xamarin.Forms.Platform.iOS;
using Xamarin.Forms.PlatformConfiguration;

[assembly: ExportRenderer(typeof(HtmlLabel), typeof(HtmlLabelRenderer))]
namespace CalcXamForms.iOS.Renderers
{
    public static class NSStringExtensions
    {
        public static NSAttributedString AsAttributedString(this string input, NSDocumentType docType)
        {
            NSError err = null;
            var rtn = new NSAttributedString(input, new NSAttributedStringDocumentAttributes { DocumentType = docType }, ref err);
            if (err == null)
            {
                return rtn;
            }
            throw new NSErrorException(err);
        }
    }

    class HtmlLabelRenderer : LabelRenderer
    {
        protected override void OnElementChanged(ElementChangedEventArgs<Label> e)
        {
            base.OnElementChanged(e);
            var text = Control.Text.AsAttributedString(NSDocumentType.HTML);
            Control.AttributedText = new UITextView { AttributedText = text }.AttributedText;
            Control.TextColor = UIColor.White;
        }

        protected override void OnElementPropertyChanged(object sender, PropertyChangedEventArgs e)
        {
            base.OnElementPropertyChanged(sender, e);

            if (e.PropertyName == Label.TextProperty.PropertyName)
            {
                if (Control != null)
                {
                    HtmlLabel wer = Element as HtmlLabel;
                    var text = Control.Text.AsAttributedString(NSDocumentType.HTML);
                    Control.AttributedText = new UITextView { AttributedText = text }.AttributedText;
                    Control.TextColor = UIColor.White;
                }
            }
        }
    }
}