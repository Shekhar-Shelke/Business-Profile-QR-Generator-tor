package com.shekharprogram.businessprofileqr.cus_nav_fragment.Home_sub_business_profile;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shekharprogram.businessprofileqr.R;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Preview_product#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Preview_product extends Fragment {
    TextView textViewDescription;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Preview_product() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Preview_product.
     */
    // TODO: Rename and change types and number of parameters
    public static Preview_product newInstance(String param1, String param2) {
        Preview_product fragment = new Preview_product();
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
        View view=inflater.inflate(R.layout.fragment_preview_product, container, false);

        String text = textViewDescription.toString();
        SpannableString ss = new SpannableString(text);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss.setSpan(boldSpan, text.length() - 5, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textViewDescription.setText(ss);

        TextView textDesc =textViewDescription.findViewById(R.id.textViewDescription);

        textDesc.setOnClickListener(new View.OnClickListener() {
            boolean isExpanded = false;
            @Override
            public void onClick(View v) {
                if (isExpanded) {
                    // Collapse the TextView to show only the initial text
                    textDesc.setMaxLines(2);
                    textDesc.setEllipsize(TextUtils.TruncateAt.END);
                    isExpanded = false;
                } else {
                    // Expand the TextView to show the full text
                    textDesc.setMaxLines(Integer.MAX_VALUE);
                    textDesc.setEllipsize(null);
                    isExpanded = true;
                }
            }
        });

        return view;
    }
}