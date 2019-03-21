package com.gabrielsamojlo.dagger_212.di;

import com.gabrielsamojlo.dagger_212.main.MainActivity;
import com.gabrielsamojlo.dagger_212.main.MainActivityModule;
import com.gabrielsamojlo.dagger_212.main.fragment.MainFragment;
import com.gabrielsamojlo.dagger_212.main.fragment.MainFragmentProvider;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityContributorModule {

    @ContributesAndroidInjector(modules = {MainActivityModule.class, MainFragmentProvider.class})
    abstract MainActivity contributeMainActivity();

    //@ContributesAndroidInjector
    //abstract MainFragment contributeMainFragment();
}
