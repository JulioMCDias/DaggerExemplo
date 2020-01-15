package com.jlmcdeveloper.daggerexemplo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jlmcdeveloper.daggerexemplo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnAddCar(View view){
        startActivity(new Intent(this, AddCarActivity.class));
    }

    public void btnListCar(View view){
        startActivity(new Intent(this, ListCarActivity.class));
    }
}
