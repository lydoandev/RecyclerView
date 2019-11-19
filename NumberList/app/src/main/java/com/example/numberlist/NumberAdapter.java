package com.example.numberlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.number_item, parent, false);
        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.txtNum.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public class NumberViewHolder extends RecyclerView.ViewHolder {
        TextView txtNum;
        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNum = itemView.findViewById(R.id.number);
        }
    }

}
