using System;
using Rg.Plugins.Popup.Extensions;
using Rg.Plugins.Popup.Pages;
using CalcXamForms.ViewModels;

namespace CalcXamForms.Pages
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
