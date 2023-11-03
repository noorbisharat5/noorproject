package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class bisharatshoesAdapter {
    public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.MyViewHolder> {
        Context context;
        ArrayList<bisharatshoes> restList;
        private FirebaseServices fbs;

        public RestaurantAdapter(Context context, ArrayList<bisharatshoes> restList) {
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
        public void onBindViewHolder(@NonNull RestaurantAdapter.MyViewHolder holder, int position) {
            bisharatshoes rest = restList.get(position);
            holder.tvName.setText(rest.getName());
            holder.tvsize.setText(rest.getSize());
        }

        @Override
        public int getItemCount(){
            return restList.size();
        }

        public static class MyViewHolder extends RecyclerView.ViewHolder{
            public BreakIterator tvsize;
            TextView tvName, tvPhone;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                tvName=itemView.findViewById(R.id.);
                View tvSize = itemView.findViewById(R.id.);

            }
}

