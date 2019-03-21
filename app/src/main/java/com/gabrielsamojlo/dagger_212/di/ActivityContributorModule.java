package com.gabrielsamojlo.dagger_212.di;

import com.gabrielsamojlo.dagger_212.main.MainActivity;
import com.gabrielsamojlo.dagger_212.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityContributorModule {

    @ContributesAndroidInjector(modules = {MainActivityModule.class, FragmentContributorModule.class})
    abstract MainActivity contributeMainActivity();

}
