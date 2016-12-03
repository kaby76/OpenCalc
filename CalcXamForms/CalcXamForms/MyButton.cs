using System.Windows.Input;
using Xamarin.Forms;

namespace CalcXamForms
{
    public class MyButton : Forms9Patch.Label
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
                base.HtmlText = $@"<font size=""5"" >{_text}</font>";
                base.HorizontalTextAlignment = TextAlignment.Center;
                base.VerticalTextAlignment = TextAlignment.Center;
            }
        }
    }
}
