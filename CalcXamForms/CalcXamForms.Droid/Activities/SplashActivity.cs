using Android.App;
using Android.Content;
using Android.OS;
using Android.Content.PM;
using Android.Support.V7.App;

namespace CalcXamForms.Droid.Activities
{
    [Activity(
        Label = "OpenCalc",
        Icon = "@drawable/icon",
        Theme = "@style/Theme.Splash",
        MainLauncher = true,
        NoHistory = true,
        ScreenOrientation = ScreenOrientation.Portrait)]
    public class SplashActivity : AppCompatActivity
    {
        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
            InvokeMainActivity();
        }

        private void InvokeMainActivity()
        {
            Intent mainActivityIntent = new Intent(this, typeof(MainActivity));
            StartActivity(mainActivityIntent);
        }
    }
}