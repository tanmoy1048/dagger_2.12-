package com.gabrielsamojlo.dagger_212.di;

import android.app.Application;
import android.content.Context;


import java.util.Calendar;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;


@Module
public abstract class AppModule {

    @Binds
    public abstract Context bindContext(Application application);

    @Provides
    static String provideDummyDependency() {
        return "I love Dagger";
    }

    @Provides
    static Calendar provideInt() {
        return Calendar.getInstance();
    }
}
