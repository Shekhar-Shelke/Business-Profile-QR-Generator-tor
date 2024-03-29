package com.shekharprogram.businessprofileqr.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shekharprogram.businessprofileqr.R;
import com.shekharprogram.businessprofileqr.data.ProductData;

import java.util.List;

public class ProductRecyclerAdapter extends RecyclerView.Adapter<ProductRecyclerAdapter.ProductViewHolder> {
    private List<ProductData> productList;
    private Context context;

    public ProductRecyclerAdapter(List<ProductData> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //  xml view--> java Object

        View view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false);
        ProductViewHolder productViewHolder = new ProductViewHolder(view);
        return productViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        ProductData product = productList.get(position);
        holder.proName.setText(product.getPro_name());
        holder.proPrice.setText(product.getPro_Price());
        holder.imageName.setImageResource(product.getImage_Name());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {
    private TextView proName,proDesc,proPrice;
    private ImageView imageName;
    private int id;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        proName=itemView.findViewById(R.id.proName);
        proPrice=itemView.findViewById(R.id.number_of_order);
        imageName=itemView.findViewById(R.id.imageView);


    }
}
}
