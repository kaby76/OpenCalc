using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Rg.Plugins.Popup.Extensions;
using Rg.Plugins.Popup.Pages;
using Xamarin.Forms;

namespace CalcXamForms
{
    public partial class EditorPopup : PopupPage
    {
        private PageCalcViewModel _pcvm;

        public EditorPopup(PageCalcViewModel pcvm)
        {
            _pcvm = pcvm;
            InitializeComponent();
            string str = _pcvm.Commands[_pcvm.Commands.Count - 1];
            TheEditor.Text = str;
        }

        private async void OnClose(object sender, EventArgs e)
        {
            await Navigation.PopPopupAsync();
            _pcvm.Commands[_pcvm.Commands.Count - 1] = TheEditor.Text;
            _pcvm.CompileAndRun();
        }
    }
}
