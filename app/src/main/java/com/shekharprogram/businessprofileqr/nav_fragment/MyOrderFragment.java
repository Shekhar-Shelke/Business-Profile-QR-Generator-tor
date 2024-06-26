package com.shekharprogram.businessprofileqr.nav_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shekharprogram.businessprofileqr.Adapter.OrderRecyclerAdapter;
import com.shekharprogram.businessprofileqr.R;
import com.shekharprogram.businessprofileqr.data.OrderData;
import com.shekharprogram.businessprofileqr.data.ProductData;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyOrderFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyOrderFragment extends Fragment {
    private List<OrderData> orderList=new ArrayList<>();
    RecyclerView recyclerView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MyOrderFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MyOrderFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MyOrderFragment newInstance(String param1, String param2) {
        MyOrderFragment fragment = new MyOrderFragment();
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
        View view = inflater.inflate(R.layout.fragment_my_order, container, false);
        recyclerView=view.findViewById(R.id.recycleView_MyOrder);
        orderList.add(new OrderData("Nike Sportswear Club Fleece",R.drawable.image1,5,  101));
        orderList.add(new OrderData("Training Top Nike Sport Clash",R.drawable.image2,3,  102));
        orderList.add(new OrderData("Trail Running Jacket Nike Windrunner",R.drawable.image3,10,  103));
        OrderRecyclerAdapter orderRecyclerAdapter=new OrderRecyclerAdapter(orderList,getActivity());
        recyclerView.setAdapter(orderRecyclerAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));

        return view;
    }
}