package com.jlmcdeveloper.daggerexemplo.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jlmcdeveloper.daggerexemplo.AndroidApplication;
import com.jlmcdeveloper.daggerexemplo.R;
import com.jlmcdeveloper.daggerexemplo.contract.ActivityComponent;
import com.jlmcdeveloper.daggerexemplo.contract.DaggerActivityComponent;
import com.jlmcdeveloper.daggerexemplo.module.RecycleAdapterModule;

import javax.inject.Inject;

public class ListCarActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Inject
    RecycleAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_car);
        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);


       ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .applicationComponent(AndroidApplication.getComponent())
                .recycleAdapterModule(new RecycleAdapterModule(this))
                .build();

        activityComponent.inject(this);


        recyclerView = findViewById(R.id.rc_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
    }
}
