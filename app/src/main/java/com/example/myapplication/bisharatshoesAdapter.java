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
        ArrayList<Shoe> shoeList;
        private FirebaseServices fbs;

        public RestaurantAdapter(Context context, ArrayList<Shoe> restList) {
            this.context = context;
            this.shoeList = restList;
            this.fbs = FirebaseServices.getInstance();
        }

        @NonNull
        @Override
        public RestaurantAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(context).inflate(R.layout._item, parent, false);
            return new RestaurantAdapter.MyViewHolder(v);
        }
        @Override
        public void onBindViewHolder(@NonNull RestaurantAdapter.MyViewHolder holder, int position) {
            Shoe rest = shoeList.get(position);
            holder.tvName.setText(rest.getName());
            holder.tvSize.setText(rest.getSize());
        }

        @Override
        public int getItemCount() {
            return shoeList.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView tvName, tvPhone, tvSize;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                tvName = itemView.findViewById(R.id.tvNameProductItem);
                tvSize = itemView.findViewById(R.id.tvSizeProductItem);

            }
        }
    }
}

