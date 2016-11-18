using System.Windows.Input;
using Xamarin.Forms;

namespace CalcXamForms
{
    public class MyListView : Xamarin.Forms.ListView
    {
        public static BindableProperty ItemClickCommandProperty =
            BindableProperty.Create("ItemClickCommand",
                typeof(ICommand), typeof(MyListView),
                null);

        public MyListView()
        {
            this.ItemTapped += this.OnItemTapped;
            this.HasUnevenRows = true;
        }

        public ICommand ItemClickCommand
        {
            get { return (ICommand)this.GetValue(ItemClickCommandProperty); }
            set { this.SetValue(ItemClickCommandProperty, value); }
        }

        private void OnItemTapped(object sender, ItemTappedEventArgs e)
        {
            if (e.Item != null && this.ItemClickCommand != null && this.ItemClickCommand.CanExecute(e))
            {
                this.ItemClickCommand.Execute(e.Item);
                this.SelectedItem = null;
            }
        }
    }
}
