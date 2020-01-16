package com.jlmcdeveloper.daggerexemplo.module;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;

import com.jlmcdeveloper.daggerexemplo.scope.ApplicationContext;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    Application myApplication;

    public AppModule(@NonNull Application application){
        myApplication = application;
    }

    @Provides
    Context provideContext(){
        return myApplication;
    }
}
