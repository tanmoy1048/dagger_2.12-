package com.gabrielsamojlo;

import com.gabrielsamojlo.dagger_212.di.AppComponent;
import com.gabrielsamojlo.dagger_212.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class MyApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }

}
