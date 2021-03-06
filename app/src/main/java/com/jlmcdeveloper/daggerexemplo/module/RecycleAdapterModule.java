package com.jlmcdeveloper.daggerexemplo.module;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import com.jlmcdeveloper.daggerexemplo.data.db.CarsDAO;
import com.jlmcdeveloper.daggerexemplo.scope.PerActivity;
import com.jlmcdeveloper.daggerexemplo.ui.RecycleAdapter;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class RecycleAdapterModule {
    private AppCompatActivity mActivity;


    public RecycleAdapterModule(AppCompatActivity appCompatActivity){
        this.mActivity = appCompatActivity;
    }

    @Provides
    @PerActivity
    Context provideContext() {
        return mActivity;
    }


    @Provides
    @PerActivity
    @Inject
    public RecycleAdapter provideRecycleAdapter(CarsDAO carsDAO){
        carsDAO.open();
        RecycleAdapter adapter = new RecycleAdapter(carsDAO.getAll());
        carsDAO.close();
        return adapter;
    }
}
