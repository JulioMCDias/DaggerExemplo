package com.jlmcdeveloper.daggerexemplo.ui;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jlmcdeveloper.daggerexemplo.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView textViewName;
    TextView textViewYear;

    ViewHolder(@NonNull View itemView) {
        super(itemView);

        textViewName = itemView.findViewById(R.id.cad_view_text_name);
        textViewYear = itemView.findViewById(R.id.cad_view_text_year);
    }
}
