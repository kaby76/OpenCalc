using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;

namespace CalcXamForms
{
    public partial class App : Xamarin.Forms.Application
    {
        public App()
        {
            InitializeComponent();

            // The root page of your application
            //MainPage = new PageCalc();
            switch (Device.OS)
            {
                case TargetPlatform.Android:
                    MainPage = new RootPage();
                    break;
                //case TargetPlatform.iOS:
                //    _app.MainPage = new EvolveNavigationPage(new RootPageiOS());
                //    break;
                //case TargetPlatform.Windows:
                //case TargetPlatform.WinPhone:
                //    _app.MainPage = new RootPageWindows();
                //    break;
                default:
                    throw new NotImplementedException();
            }
        }
        protected override void OnStart()
        {
            // Handle when your app starts
        }

        protected override void OnSleep()
        {
            // Handle when your app sleeps
        }

        protected override void OnResume()
        {
            // Handle when your app resumes
        }
    }
}
