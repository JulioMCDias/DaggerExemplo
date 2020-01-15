package com.jlmcdeveloper.daggerexemplo.ui;

import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;

import com.jlmcdeveloper.daggerexemplo.R;
import com.jlmcdeveloper.daggerexemplo.data.db.CarsDAO;
import com.jlmcdeveloper.daggerexemplo.data.db.model.Car;

public class AddCarActivity extends AppCompatActivity {

    private CarsDAO carsDAO;
    private AppCompatEditText editTextName;
    private AppCompatEditText editTextYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        carsDAO = new CarsDAO(this);

        editTextName = findViewById(R.id.ed_name);
        editTextYear = findViewById(R.id.ed_year);
    }


    public void btnSaveCar(View view) {
        carsDAO.open();
        String name = editTextName.getEditableText().toString();
        int year = Integer.decode(editTextYear.getEditableText().toString());
        Car car = new Car();
        car.setName(name);
        car.setYear(year);
        carsDAO.create(car);
        carsDAO.close();
        finish();
    }


    public void btnCancel(View view) {
        finish();
    }
}
