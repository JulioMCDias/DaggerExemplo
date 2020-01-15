package com.jlmcdeveloper.daggerexemplo.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.jlmcdeveloper.daggerexemplo.R;
import com.jlmcdeveloper.daggerexemplo.data.db.model.Car;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<Car> carList;

    public RecycleAdapter(List<Car> list){
        carList = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_view, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Car car = carList.get(position);
        holder.textViewName.setText(car.getName());
        holder.textViewYear.setText(String.valueOf(car.getYear()));
    }


    @Override
    public int getItemCount() {
        return carList.size();
    }
}
