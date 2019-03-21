package com.gabrielsamojlo.dagger_212.main.fragment;

import android.arch.lifecycle.ViewModelProvider;

import com.gabrielsamojlo.dagger_212.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class MainFragmentModule {

    @Provides
    MainFragmentViewModel provideMainFragmentViewModel() {
        return new MainFragmentViewModel("Another test");
    }

    /*@Provides
    ViewModelProvider.Factory mainFragmentViewModelProvider(MainFragmentViewModel mainFragmentViewModel) {
        return new ViewModelProviderFactory<>(mainFragmentViewModel);
    }*/
}
