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
import com.shekharprogram.businessprofileqr.data.OrderData;
import com.shekharprogram.businessprofileqr.data.ProductData;

import org.w3c.dom.Text;

import java.util.List;
import java.util.zip.Inflater;

public class OrderRecyclerAdapter extends RecyclerView.Adapter<OrderRecyclerAdapter.OrderviewHolder> {
    private List<OrderData> orderList;
    private Context context;

    public OrderRecyclerAdapter(List<OrderData> orderList, Context context) {
        this.orderList = orderList;
        this.context = context;
    }


    @NonNull
    @Override
    public OrderviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.order_list_item,parent,false);
        OrderviewHolder orderviewHolder = new OrderviewHolder(view);
        return orderviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderviewHolder holder, int position) {
       OrderData orderData= orderList.get(position);
       holder.ImageName.setImageResource(orderData.getImageVIew());
       holder.Order_Name.setText(orderData.getPro_Name());
       holder.Num_of_Order.setText(String.valueOf(orderData.getNumber_of_order()));


    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    class OrderviewHolder extends RecyclerView.ViewHolder {
        ImageView ImageName;
        TextView Order_Name,Num_of_Order;

        public OrderviewHolder(@NonNull View itemView) {
            super(itemView);
            ImageName=itemView.findViewById(R.id.Order_imageView);
            Order_Name=itemView.findViewById(R.id.Order_Name);
            Num_of_Order=itemView.findViewById(R.id.number_of_order);

        }
    }
}
