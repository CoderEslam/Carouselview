package com.doubleclick.carouselview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created By Eslam Ghazy on 4/16/2022
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {
    @NonNull
    @Override
    public RecyclerViewAdapter.RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecyclerViewViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.RecyclerViewViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
