package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wecar.D_FireBase.CarItem;
import com.example.wecar.D_FireBase.User;
import com.example.wecar.pagess.CarDetailsFragment;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ShoeAdapter extends RecyclerView.Adapter<ShoeAdapter.MyViewHolder> {
    Context context;
    ArrayList<ShoeItem> shoesList;
    private ShoeAdapter.OnItemClickListener itemClickListener;
    private FirebaseServices fbs;

    public ShoeAdapter(Context context, ArrayList<ShoeItem> shoesList) {
        this.context = context;
        this.shoesList = shoesList;
        this.fbs = FirebaseServices.getInstance();
        this.itemClickListener = new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                /*
                String selectedItem = filteredList.get(position).getNameCar();
                Toast.makeText(getActivity(), "Clicked: " + selectedItem, Toast.LENGTH_SHORT).show(); */
                /*
                Bundle args = new Bundle();
                args.putParcelable("car", carsList.get(position)); // or use Parcelable for better performance
                ShoeDetailsFragment cd = new ShoeDetailsFragment();
                cd.setArguments(args);
                FragmentTransaction ft= ((MainActivity)context).getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayout,cd);
                ft.commit(); */
            }
        } ;
    }

    @NonNull
    @Override
    public shoesList.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View v= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return  new shoesList.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CarListAdapter2.MyViewHolder holder, int position){
        ShoeItem car= shoesList.get(position);

        holder.carName.setText(car.getNameShoe());
        holder.Price.setText(car.getPrice() + " ₪");
        holder.Year.setText(car.getYear());
        holder.Shoe.setOnClickListener(v -> {
            if (itemClickListener != null) {
                itemClickListener.onItemClick(position);
            }
        });
/*
        holder.carName.setOnClickListener(v -> {
            if (clickListener != null) {
                clickListener.setOnItemClick(position);
            }
        }); */
        if (car.getPhoto() == null || car.getPhoto().isEmpty())
        {
            Picasso.get().load(R.drawable.ic_fav).into(holder.ivCar);
        }
        else {
            Picasso.get().load(car.getPhoto()).into(holder.ivCar);
        }

    }







    @Override
    public int getItemCount(){
        return shoesList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView carName,Price,Year,location,GearShift,kilometre;
        ImageView ivCar, ivFavourite;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ShoeName=itemView.findViewById(R.id.tvNameShoe_carListFragment);
            Price=itemView.findViewById(R.id.tvPrice_carListFragment);
            Year=itemView.findViewById(R.id.tvYear_carListFragment);
            ivCar = itemView.findViewById(R.id.ivCarPhotoItem);
            ivFavourite = itemView.findViewById(R.id.ivFavoriteIcon);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(shoesList.OnItemClickListener listener) {
        this.itemClickListener = listener;
    }
}
