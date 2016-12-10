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

                // Font size in html is not observed!
                // See http://stackoverflow.com/questions/7247113/using-size-html-attribute-in-textview
                this.Text = $@"<big><big><big><big>{_text}</big></big></big></big>";
                base.HorizontalTextAlignment = TextAlignment.Center;
                base.VerticalTextAlignment = TextAlignment.Center;
            }
        }
    }
}
