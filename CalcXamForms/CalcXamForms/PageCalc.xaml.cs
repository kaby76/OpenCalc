﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;

namespace CalcXamForms
{
    public partial class PageCalc : ContentPage
    {
        public PageCalc()
        {
            this.BindingContext = PageCalcViewModel.Singleton(this);
            InitializeComponent();
        }
    }
}
