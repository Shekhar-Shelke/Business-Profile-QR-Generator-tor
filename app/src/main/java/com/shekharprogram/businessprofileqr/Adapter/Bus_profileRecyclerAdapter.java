package com.shekharprogram.businessprofileqr.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.shekharprogram.businessprofileqr.Customer_main;
import com.shekharprogram.businessprofileqr.R;
import com.shekharprogram.businessprofileqr.cus_nav_fragment.Home_sub_business_profile.cus_business_profile;
import com.shekharprogram.businessprofileqr.data.Bus_profile_data;
import com.shekharprogram.businessprofileqr.data.ProductData;

import java.util.List;
import java.util.zip.Inflater;

public class Bus_profileRecyclerAdapter extends RecyclerView.Adapter<Bus_profileRecyclerAdapter.Bus_profileViewholder> {
    private List<Bus_profile_data> profileList;
    private List<ProductData> productList;

    public Bus_profileRecyclerAdapter(List<ProductData> productList) {
        this.productList = productList;
    }

    private Context context;
    private FragmentManager fragmentManager;



    public Bus_profileRecyclerAdapter(List<Bus_profile_data> profileList, Context context, FragmentManager fragmentManager) {
        this.profileList = profileList;
        this.context = context;
        this.fragmentManager = fragmentManager;
    }

    @NonNull
    @Override
    public Bus_profileViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.business_profile_list_item_cus, parent, false);
        return new Bus_profileViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Bus_profileViewholder holder, int position) {
        Bus_profile_data profile_data = profileList.get(position);
        holder.imageView.setImageResource(profile_data.getImage());
        holder.name.setText(profile_data.getName());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                 cus_business_profile fragment = new cus_business_profile();
//                 Bundle bundle = new Bundle();
////                 bundle.putString("key", profile_data.getName());
//                 fragment.setArguments(bundle);


                Intent intent = new Intent(context, Customer_main.class);
                Bundle cus_main_data = new Bundle();
                cus_main_data.putString("data",profile_data.getName() );
                intent.putExtras(cus_main_data);


                transaction.replace(R.id.cus_framecontainer, fragment);
                transaction.addToBackStack(null);
                transaction.commit();


            }
        });
    }

    @Override
    public int getItemCount() {
        return profileList.size();
    }

    static class Bus_profileViewholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        CardView cardView;

        public Bus_profileViewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.bus_profile_image);
            name = itemView.findViewById(R.id.bus_name);
            cardView = itemView.findViewById(R.id.bus_profile_card);
        }
    }
}
