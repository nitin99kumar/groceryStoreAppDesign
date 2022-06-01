package com.example.grocerystoreproject;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class SeeOrdersAdapter extends RecyclerView.Adapter<SeeOrdersAdapter.AdapterViewHolder> {

    public static Context contxt;

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_see_all_orders,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {

        holder.Heading.setText("ABCS");
        holder.Id.setText("1234");
        holder.Price.setText("$124");
        holder.Stocks.setText("14%");
        holder.Quantity.setText("15");
        holder.imgUrl.setVisibility(View.GONE);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class AdapterViewHolder extends RecyclerView.ViewHolder {

        TextView Heading,Id, Description, Price , Stocks, Quantity;
        ImageView imgUrl;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            Heading = itemView.findViewById(R.id.productName);
            Id = itemView.findViewById(R.id.productId);
            Description= itemView.findViewById(R.id.productName);
            Price = itemView.findViewById(R.id.productPrice);
            Stocks = itemView.findViewById(R.id.productStock);
            Quantity = itemView.findViewById(R.id.productQuantity);
            imgUrl = itemView.findViewById(R.id.productImageUrl);

        }
    }

}


