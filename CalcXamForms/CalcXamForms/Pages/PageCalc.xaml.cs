using CalcXamForms.Controls;
using Xamarin.Forms;
using CalcXamForms.ViewModels;

namespace CalcXamForms.Pages
{
    public partial class PageCalc : ContentPage
    {
        public PageCalc()
        {
            this.BindingContext = PageCalcViewModel.Singleton(this);
            InitializeComponent();
        }

        protected override void OnSizeAllocated(double width, double height)
        {
            base.OnSizeAllocated(width, height);
            if (PageCalcViewModel.Singleton(this).Dimensions.Width != width ||
                PageCalcViewModel.Singleton(this).Dimensions.Height != height)
            {
                PageCalcViewModel.Singleton(this).Dimensions = new Size(width, height);
            }
        }

        public void DoScroll(PageCalcViewModel.DisplayResults item)
        {
            Display.ScrollTo(item, ScrollToPosition.Start, false);
        }
    }
}
