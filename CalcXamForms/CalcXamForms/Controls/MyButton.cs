using System;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using System.Text;
using System.Windows.Input;
using Xamarin.Forms;

namespace CalcXamForms.Controls
{
    public class MyButton : HtmlLabel
    {
        public MyButton()
        {
            base.Margin = new Thickness(0,0,0,0);
            BackgroundColor = Color.Gray;
            TapGestureRecognizer gestureRecognizer = new TapGestureRecognizer();
            gestureRecognizer.Tapped += (s, e) => {
                if (Command != null && Command.CanExecute(null))
                {
                    Command.Execute(null);
                }
            };
            this.GestureRecognizers.Add(gestureRecognizer);
        }

        public static readonly BindableProperty FSizeProperty =
            BindableProperty.Create(
                "FSize" // propertyName
                , typeof(int) // returnType
                , typeof(MyButton) // declaringType
                , default(int) // defaultValue
                , BindingMode.TwoWay // defaultBindingMode, copy only to this control.
                , // validateValue, null = no validation.
                (bindable, value) =>
                {
                    // Here we would validate the new value against
                    // whatever criteria we choose.
                    // Note: "bindable" in this case is an object with a "RatingView" type.
                    return true;
                }
                , // propertyChanged, bool function fired after set.
                (bindable, oldValue, newValue) =>
                {
                    // Property has changed
                    MyButton b = bindable as MyButton;
                    b.OnPropertyChanged("FSize");
                }
                , // propertyChanging, void function fired before set.
                (bindable, oldValue, newValue) =>
                {
                    // Property is changing
                }
                , // coerceValue, mutator of value fired before set.
                (bindable, value) =>
                {
                    // Coerce the property
                    // Here we would override what the passed in value is
                    // And return something else - if we wanted to
                    return value;
                }
                , // defaultValueCreator, function that returns default value.
                (bindable) =>
                {
                    // This is the default creator
                    return default(int);
                }
                );

        public int FSize
        {
            get { return (int)GetValue(FSizeProperty); }
            set { SetValue(FSizeProperty, value); }
        }

        public static readonly BindableProperty CommandProperty =
            BindableProperty.Create(
                "Command" // propertyName
                , typeof(ICommand) // returnType
                , typeof(MyButton) // declaringType
                , default(ICommand) // defaultValue
                , BindingMode.TwoWay // defaultBindingMode, copy only to this control.
                , // validateValue, null = no validation.
                (bindable, value) => true
                , // propertyChanged, bool function fired after set.
                (bindable, oldValue, newValue) => { }
                , // propertyChanging, void function fired before set.
                (bindable, oldValue, newValue) => { }
                , // coerceValue, mutator of value fired before set.
                (bindable, value) => value
                , // defaultValueCreator, function that returns default value.
                (bindable) => default(ICommand)
                );

        public ICommand Command
        {
            get { return (ICommand)GetValue(CommandProperty); }
            set { SetValue(CommandProperty, value); }
        }

        public string HtmlText { get; set; }
    }
}
