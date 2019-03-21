package com.gabrielsamojlo.dagger_212.main;

import android.arch.lifecycle.ViewModelProvider;

import com.gabrielsamojlo.dagger_212.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    ViewModelProvider.Factory mainViewModelProvider(MainViewModel mainViewModel) {
        return new ViewModelProviderFactory<>(mainViewModel);
    }

    @Provides
    MainViewModel provideMainViewModel(String value) {
        return new MainViewModel(value);
    }
}
