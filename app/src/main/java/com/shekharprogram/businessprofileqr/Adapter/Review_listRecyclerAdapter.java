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
import com.shekharprogram.businessprofileqr.cus_nav_fragment.Home_sub_business_profile.Review_product;
import com.shekharprogram.businessprofileqr.data.ReviewCommentData;

import java.util.List;

public class Review_listRecyclerAdapter extends RecyclerView.Adapter<Review_listRecyclerAdapter.Review_listViewholder> {
    private List<ReviewCommentData> reviewList;
    Context context;

    public Review_listRecyclerAdapter(List<ReviewCommentData> reviewList, Context context) {
        this.reviewList = reviewList;
        this.context = context;
    }



    @NonNull
    @Override
    public Review_listViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.reviews_list_item,parent,false);
        Review_listViewholder review_listViewholder=new Review_listViewholder(view);
        return review_listViewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Review_listViewholder holder, int position) {
        ReviewCommentData reviewCommentData=reviewList.get(position);
        holder.imageView.setImageResource(reviewCommentData.getImageView());
        holder.rateing.setText(String.valueOf(reviewCommentData.getNumber_of_rateing()));
        holder.date.setText(reviewCommentData.getTime());
        holder.name.setText(reviewCommentData.getName());
        holder.desc.setText(reviewCommentData.getDescription());

    }



    @Override
    public int getItemCount() {
        return reviewList.size();
    }

    class Review_listViewholder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView rateing,date,name,desc;
        public Review_listViewholder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.reviewImage);
            rateing=itemView.findViewById(R.id.rateing);
            date=itemView.findViewById(R.id.reviewDate);
            name=itemView.findViewById(R.id.reviewname);
            desc=itemView.findViewById(R.id.reviewdescription);
        }
    }
}
