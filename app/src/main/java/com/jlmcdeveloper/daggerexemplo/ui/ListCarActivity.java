package com.jlmcdeveloper.daggerexemplo.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jlmcdeveloper.daggerexemplo.R;
import com.jlmcdeveloper.daggerexemplo.data.db.CarsDAO;
import com.jlmcdeveloper.daggerexemplo.data.db.model.Car;

import java.util.List;

public class ListCarActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecycleAdapter adapter;
    private CarsDAO carsDAO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_car);
        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.rc_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        carsDAO = new CarsDAO(this);
        carsDAO.open();
        List<Car> cars = carsDAO.getAll();

        adapter = new RecycleAdapter(carsDAO.getAll());
        carsDAO.close();

        recyclerView.setAdapter(adapter);
    }
}
