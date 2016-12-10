using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;

namespace CalcXamForms
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
    }
}
