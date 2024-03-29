package com.shekharprogram.businessprofileqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    Button createbtn;
    ImageView backbtn ,gogglebtn;
    TextView Signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        getSupportActionBar().setTitle("Login");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        gogglebtn=findViewById(R.id.gogglebtn);
        backbtn=findViewById(R.id.backbtn);
        createbtn=findViewById(R.id.signupbtn);
        Signin=(TextView)findViewById(R.id.Signin);

        gogglebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this, Customer_main.class);
                startActivity(intent);
            }
        });
        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Signin=new Intent(Login.this, Signin.class);
                startActivity(Signin);
            }
        });
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        createbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent check=new Intent(Login.this, Sign_up.class);
                startActivity(check);
            }
        });



    }

}