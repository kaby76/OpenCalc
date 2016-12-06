using System.Windows.Input;
using Xamarin.Forms;

namespace CalcXamForms
{
    //public class MyButton : Forms9Patch.Label
    //public class MyButton : WebView
    public class MyButton : HtmlLabel
    {
        public MyButton()
        {
            base.Margin = new Thickness(0,0,0,0);
            TapGestureRecognizer gestureRecognizer = new TapGestureRecognizer();
            gestureRecognizer.Tapped += (s, e) => {
                if (Command != null && Command.CanExecute(null))
                {
                    Command.Execute(null);
                }
            };
            this.GestureRecognizers.Add(gestureRecognizer);
        }

        public static readonly BindableProperty CommandProperty =
            BindableProperty.Create<MyButton, ICommand>(x => x.Command, null);

        public ICommand Command
        {
            get { return (ICommand)GetValue(CommandProperty); }
            set { SetValue(CommandProperty, value); }
        }

        private string _text;
        public string Fext
        {
            get
            {
                return _text.ToString();
            }
            set
            {
                _text = value;

                //var htmlSource = new HtmlWebViewSource();
                //htmlSource.Html = $@"<html><body><font size=""5"" >{_text}</font></body></html>";
                //this.Source = htmlSource;
                //this.HeightRequest = 20;
                //this.WidthRequest = 20;

                //base.HtmlText = $@"<font size=""5"" >{_text}</font>";
                //base.HtmlText = $@"<html><body><font size=""5"" >{_text}</font></body></html>";

                this.FontSize = 28;// Font size is not observed in html at all!
                this.Text = $@"<html><body><font size=""35"" >{_text}</font></body></html>";
                base.HorizontalTextAlignment = TextAlignment.Center;
                base.VerticalTextAlignment = TextAlignment.Center;
            }
        }
    }
}
