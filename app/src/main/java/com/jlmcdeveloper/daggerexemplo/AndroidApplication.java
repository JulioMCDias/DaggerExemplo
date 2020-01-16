package com.jlmcdeveloper.daggerexemplo;

import android.app.Application;

import com.jlmcdeveloper.daggerexemplo.contract.ApplicationComponent;
import com.jlmcdeveloper.daggerexemplo.contract.DaggerApplicationComponent;
import com.jlmcdeveloper.daggerexemplo.module.AppModule;
import com.jlmcdeveloper.daggerexemplo.module.SQLiteModule;


public class AndroidApplication extends Application {

    public static ApplicationComponent component;

    public static ApplicationComponent getComponent(){
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        component = buildComponent();
    }

    private ApplicationComponent buildComponent(){
        return DaggerApplicationComponent.builder()
                .appModule(new AppModule(this))
                .sQLiteModule(new SQLiteModule())
                .build();
    }

}
