package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class bisharatshoesAdapter {
    public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.MyViewHolder> {
        Context context;
        ArrayList<Shoe> restList;
        private FirebaseServices fbs;

        public RestaurantAdapter(Context context, ArrayList<Shoe> restList) {
            this.context = context;
            this.restList = restList;
            this.fbs = FirebaseServices.getInstance();
        }

        @NonNull
        @Override
        public RestaurantAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
            View v= LayoutInflater.from(context).inflate(R.layout._item,parent,false);
            return  new RestaurantAdapter.MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder() {
            onBindViewHolder(null, 0);
        }

        @Override
        public void onBindViewHolder(@NonNull RestaurantAdapter.MyViewHolder holder, int position) {
            Shoe rest = restList.get(position);
            holder.tvName.setText(rest.getName());
            holder.tvsize.setText(rest.getSize());
        }

        @Override
        public int getItemCount(){
            return restList.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView tvName, tvPhone, tvsize;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                tvName = itemView.findViewById(R.id.);
                View tvSize = itemView.findViewById(R.id.);

            }
}

