using System.Collections.Generic;
using Xamarin.Forms;

namespace CalcXamForms.Pages
{
    public partial class MasterPage : ContentPage
    {
        public Xamarin.Forms.ListView ListView { get { return listView; } }

        public MasterPage()
        {
            InitializeComponent();
            var masterPageItems = new List<MasterPageItem>();
            masterPageItems.Add(new MasterPageItem
            {
                Title = "Functions",
                Act = () =>
                {
                    return null;
                    //EventPublisher event_publisher = new EventPublisher();
                    //return new PageHistory(event_publisher, AppController.Singleton.Model.TrackData);
                }
            });
            masterPageItems.Add(new MasterPageItem
            {
                Title = "Options",
                Act = () =>
                {
                    return null;
                    //return new PageOptions();
                }
                //               IconSource = "reminders.png",
            });

            listView.ItemsSource = masterPageItems;
        }
    }
}
