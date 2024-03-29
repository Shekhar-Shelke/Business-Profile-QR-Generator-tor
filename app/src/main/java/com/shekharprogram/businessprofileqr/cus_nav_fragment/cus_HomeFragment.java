package com.shekharprogram.businessprofileqr.cus_nav_fragment;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.shekharprogram.businessprofileqr.Adapter.Bus_profileRecyclerAdapter;
import com.shekharprogram.businessprofileqr.R;
import com.shekharprogram.businessprofileqr.cus_nav_fragment.Home_sub_business_profile.cus_business_profile;
import com.shekharprogram.businessprofileqr.data.Bus_profile_data;
import com.shekharprogram.businessprofileqr.data.OrderData;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link cus_HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class cus_HomeFragment extends Fragment{
    RecyclerView recyclerView;

    private List<Bus_profile_data> profile_dataList=new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public cus_HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment cus_HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static cus_HomeFragment newInstance(String param1, String param2) {
        cus_HomeFragment fragment = new cus_HomeFragment();
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
         View view=inflater.inflate(R.layout.fragment_cus__home, container, false);
        recyclerView=view.findViewById(R.id.recycleView_Cus_home);
        FragmentManager fm= getActivity().getSupportFragmentManager();
//        cardView=view.findViewById(R.id.recycleView_Cus_home);
        profile_dataList.add(new Bus_profile_data("Men’s fashion store",R.drawable.bus_profile_image));
        profile_dataList.add(new Bus_profile_data("Kisan Mall Pvt Ltd",R.drawable.kisanmall));
        Bus_profileRecyclerAdapter busProfileRecyclerAdapter=new Bus_profileRecyclerAdapter(profile_dataList,getActivity(),fm);
        recyclerView.setAdapter(busProfileRecyclerAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));


        return view;

    }




}