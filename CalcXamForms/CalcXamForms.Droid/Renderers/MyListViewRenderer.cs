using System.ComponentModel;
using Xamarin.Forms.Platform.Android;
using CalcXamForms;
using CalcXamForms.Controls;
using CalcXamForms.Droid;
using Xamarin.Forms;

[assembly: ExportRenderer(typeof(MyListView), typeof(MyListViewRenderer))]
namespace CalcXamForms.Droid
{
    public class MyListViewRenderer : ListViewRenderer
    {
        public MyListViewRenderer() : base()
        {
            if (this.Control != null)
                this.Control.StackFromBottom = true;
        }

        protected override void OnElementChanged(ElementChangedEventArgs<Xamarin.Forms.ListView> e)
        {
            base.OnElementChanged(e);
            if (this.Control != null)
                this.Control.StackFromBottom = true;
        }

        protected override void OnElementPropertyChanged(object sender, PropertyChangedEventArgs e)
        {
            base.OnElementPropertyChanged(sender, e);

            if (e.PropertyName == Label.TextProperty.PropertyName)
            {
                if (this.Control != null)
                    this.Control.StackFromBottom = true;
            }
        }
    }
}