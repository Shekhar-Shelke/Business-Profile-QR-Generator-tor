package com.shekharprogram.businessprofileqr.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.shekharprogram.businessprofileqr.Customer_main;
import com.shekharprogram.businessprofileqr.R;
import com.shekharprogram.businessprofileqr.cus_nav_fragment.Home_sub_business_profile.Preview_product;
import com.shekharprogram.businessprofileqr.cus_nav_fragment.Home_sub_business_profile.Review_product;
import com.shekharprogram.businessprofileqr.cus_nav_fragment.Home_sub_business_profile.cus_business_profile;
import com.shekharprogram.businessprofileqr.data.Bus_profile_data;
import com.shekharprogram.businessprofileqr.data.ProductData;

import java.util.List;
import java.util.zip.Inflater;

public class cus_view_per_bus_product_RecyclerAdapter extends RecyclerView.Adapter<cus_view_per_bus_product_RecyclerAdapter.cus_per_Bus_productView> {
    public cus_view_per_bus_product_RecyclerAdapter(List<ProductData> productList, Context context,FragmentManager fragmentManager) {
        this.productList = productList;
        this.context = context;
        this.fragmentManager=fragmentManager;
    }

    private List<ProductData> productList;
    private Context context;
    private FragmentManager fragmentManager;
    @NonNull
    @Override
    public cus_per_Bus_productView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.product_list_item,parent,false);
        cus_view_per_bus_product_RecyclerAdapter.cus_per_Bus_productView productViewHolder = new cus_view_per_bus_product_RecyclerAdapter.cus_per_Bus_productView(view);
        return productViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull cus_per_Bus_productView holder, int position) {
        ProductData productData_data = productList.get(position);
        holder.imageName.setImageResource(productData_data.getImage_Name());
        holder.proName.setText(productData_data.getPro_name());
        holder.proPrice.setText(productData_data.getPro_Price());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                Preview_product fragment = new Preview_product();
                transaction.replace(R.id.cus_framecontainer, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


//        Intent intent = new Intent(context, Customer_main.class);
//        intent.putExtra("data", productData_data.getPro_name());
//        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class cus_per_Bus_productView extends RecyclerView.ViewHolder {
        private TextView proName,proDesc,proPrice;
        private ImageView imageName;
        RelativeLayout relativeLayout;
        public cus_per_Bus_productView(@NonNull View itemView) {
            super(itemView);
            proName=itemView.findViewById(R.id.proName);
            proPrice=itemView.findViewById(R.id.number_of_order);
            imageName=itemView.findViewById(R.id.imageView);
            relativeLayout=itemView.findViewById(R.id.relative_layout);
        }
    }

}
