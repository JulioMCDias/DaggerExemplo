package com.jlmcdeveloper.daggerexemplo.ui;

import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.jlmcdeveloper.daggerexemplo.R;

public class AddCarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    public void btnSaveCar(View view) {

    }


    public void btnCancel(View view) {

    }
}
