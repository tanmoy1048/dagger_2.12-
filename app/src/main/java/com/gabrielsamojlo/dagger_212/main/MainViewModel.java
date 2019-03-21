package com.gabrielsamojlo.dagger_212.main;

import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public MainViewModel(String test) {
        this.test = test;
    }

    public String test;
}
