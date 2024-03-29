package com.shekharprogram.businessprofileqr.cus_nav_fragment.Home_sub_business_profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shekharprogram.businessprofileqr.Adapter.Review_listRecyclerAdapter;
import com.shekharprogram.businessprofileqr.R;
import com.shekharprogram.businessprofileqr.data.ProductData;
import com.shekharprogram.businessprofileqr.data.ReviewCommentData;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Review_product#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Review_product extends Fragment {
    private List<ReviewCommentData> reviewlist=new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Review_product() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Review_product.
     */
    // TODO: Rename and change types and number of parameters
    public static Review_product newInstance(String param1, String param2) {
        Review_product fragment = new Review_product();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_review_product, container, false);
        FragmentManager fm= getActivity().getSupportFragmentManager();
        reviewlist.add(new ReviewCommentData(R.drawable.image1,3.5,"Shekhar","15 feb 2024","Amazing Product it look like ohhh"));
        reviewlist.add(new ReviewCommentData(R.drawable.image2,2.5,"Naresh","20 feb 2024"," Very cute and comfortable"));
        reviewlist.add(new ReviewCommentData(R.drawable.image3,4.5,"Akash","12 mar 2024"," Love this shirt"));
        reviewlist.add(new ReviewCommentData(R.drawable.image4,3.0,"Ayush","17 mar 2024","Great quality. Comfortable. Looks nice."));
        reviewlist.add(new ReviewCommentData(R.drawable.image1,5.0,"Aditya","25 mar 2024","PERFECT FOR AND HALLOWEEN COSTUME"));
        Review_listRecyclerAdapter adapter=new Review_listRecyclerAdapter(reviewlist,getActivity(),fm);
        RecyclerView recyclerView=view.findViewById(R.id.comments_recycler);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }
}