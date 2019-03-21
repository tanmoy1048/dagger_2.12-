
package com.gabrielsamojlo.dagger_212.main.fragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class MainFragmentProvider {

    @ContributesAndroidInjector(modules = MainFragmentModule.class)
    abstract MainFragment provideMainFragmentFactory();
}
