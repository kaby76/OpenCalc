using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Webkit;
using Android.Widget;
using CalcXamForms.Droid;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;
using WebView = Xamarin.Forms.WebView;

[assembly: ExportRenderer(typeof(WebView), typeof(NoChacheWebViewRenderer))]
namespace CalcXamForms.Droid
{

    public class NoChacheWebViewRenderer : WebViewRenderer
    {
        protected override void OnElementChanged(ElementChangedEventArgs<WebView> e)
        {
            base.OnElementChanged(e);
            if (Control == null) return;

            Control.ClearCache(true);
            Control.Settings.SetAppCacheEnabled(false);
            Control.Settings.CacheMode = CacheModes.NoCache;
        }
    }
}
