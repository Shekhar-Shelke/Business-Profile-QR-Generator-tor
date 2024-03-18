package com.shekharprogram.businessprofileqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Signin extends AppCompatActivity {
    TextView textView,forgettext;
    ImageView backbtn;
    Button sendotp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        textView=findViewById(R.id.term_and_condition);
        backbtn=findViewById(R.id.backbtn);
        forgettext=(TextView) findViewById(R.id.forgettext);
        sendotp=findViewById(R.id.sendotp);
        sendotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Signin.this, Business_main.class);
                startActivity(intent);
            }
        });
        forgettext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forget=new Intent(Signin.this, Forget_Pass.class);
                startActivity(forget);
            }
        });
        String text = "By connecting your account confirm that you agree \n with our Term and Condition";
        SpannableString ss = new SpannableString(text);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss.setSpan(boldSpan, 60, 79, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);


    }
}