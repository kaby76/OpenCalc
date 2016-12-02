using System;
using Xamarin.Forms;

namespace CalcXamForms
{
    public class MasterPageItem
    {
        public Func<Page> Act { get; set; }
        public string Title { get; set; }
        public string IconSource { get; set; }
    }
}
