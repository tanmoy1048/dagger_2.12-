package com.gabrielsamojlo.dagger_212.di;

import com.gabrielsamojlo.dagger_212.MainActivity;
import com.gabrielsamojlo.dagger_212.MainFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentContributorModule {
    @ContributesAndroidInjector
    abstract MainFragment contributeMainFragment();

}
