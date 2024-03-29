package com.shekharprogram.businessprofileqr.cus_nav_fragment.Home_sub_business_profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shekharprogram.businessprofileqr.Adapter.ProductRecyclerAdapter;
import com.shekharprogram.businessprofileqr.Adapter.cus_view_per_bus_product_RecyclerAdapter;
import com.shekharprogram.businessprofileqr.R;
import com.shekharprogram.businessprofileqr.data.ProductData;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link cus_business_profile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class cus_business_profile extends Fragment {
    private List<ProductData> cus_view_per_bus_productList=new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public cus_business_profile() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment cus_business_profile.
     */
    // TODO: Rename and change types and number of parameters
    public static cus_business_profile newInstance(String param1, String param2) {
        cus_business_profile fragment = new cus_business_profile();
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
       View view= inflater.inflate(R.layout.fragment_cus_business_profile, container, false);
       RecyclerView recyclerView=view.findViewById(R.id.cus_recycleView_Myproduct);
        
        cus_view_per_bus_productList.add(new ProductData("Nike Sportswear Club Fleece","It is a very cheppest product","$"+"999",R.drawable.image1,101));
        cus_view_per_bus_productList.add(new ProductData("Trail Running Jacket Nike Windrunner","It is a very highest product","$"+"799",R.drawable.image2,102));
        cus_view_per_bus_productList.add(new ProductData("Training Top Nike Sport Clash","It is a very low  qulity product","$"+"199",R.drawable.image3,103));
        cus_view_per_bus_productList.add(new ProductData("Training Top Nike Sport Clash","It is a very low  qulity product","$"+"199",R.drawable.image3,103));
        cus_view_per_bus_productList.add(new ProductData("Training Top Nike Sport Clash","It is a very low  qulity product","$"+"199",R.drawable.image3,103));
        cus_view_per_bus_productList.add(new ProductData("Training Top Nike Sport Clash","It is a very low  qulity product","$"+"199",R.drawable.image3,103));
        cus_view_per_bus_productList.add(new ProductData("Training Top Nike Sport Clash","It is a very low  qulity product","$"+"199",R.drawable.image3,103));
        cus_view_per_bus_productList.add(new ProductData("Training Top Nike Sport Clash","It is a very low  qulity product","$"+"199",R.drawable.image3,103));
        cus_view_per_bus_productList.add(new ProductData("Trail Running Jacket Nike Windrunner","It is a very high qulity  product","$"+"499",R.drawable.image4,104));
        cus_view_per_bus_product_RecyclerAdapter adapter = new cus_view_per_bus_product_RecyclerAdapter(cus_view_per_bus_productList, getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        return view;
    }
}