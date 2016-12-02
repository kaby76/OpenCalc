using System;
using Xamarin.Forms;

namespace CalcXamForms
{
    public partial class RootPage : MasterDetailPage
    {
        public RootPage()
        {
            InitializeComponent();
            //EventPublisher event_publisher = new EventPublisher();
            Detail = new NavigationPage(new PageCalc(/*event_publisher*/));
            masterPage.ListView.ItemSelected += OnItemSelected;
        }

        void OnItemSelected(object sender, SelectedItemChangedEventArgs e)
        {
            var item = e.SelectedItem as MasterPageItem;
            if (item != null)
            {
                Detail = new NavigationPage(item.Act());
                masterPage.ListView.SelectedItem = null;
                IsPresented = false;
            }
        }
    }
}
