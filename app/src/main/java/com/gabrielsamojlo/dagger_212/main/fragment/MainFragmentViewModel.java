package com.gabrielsamojlo.dagger_212.main.fragment;

import android.arch.lifecycle.ViewModel;

public class MainFragmentViewModel extends ViewModel {
    public String anotherTest;

    public MainFragmentViewModel(String anotherTest) {
        this.anotherTest = anotherTest;
    }
}
