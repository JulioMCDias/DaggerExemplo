package com.jlmcdeveloper.daggerexemplo.contract;


import android.app.Application;
import android.content.Context;

import com.jlmcdeveloper.daggerexemplo.module.AppModule;
import com.jlmcdeveloper.daggerexemplo.module.SQLiteModule;
import com.jlmcdeveloper.daggerexemplo.scope.ApplicationContext;
import com.jlmcdeveloper.daggerexemplo.ui.AddCarActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, SQLiteModule.class})
public interface ApplicationComponent {
    void inject(AddCarActivity addCarActivity);
}
