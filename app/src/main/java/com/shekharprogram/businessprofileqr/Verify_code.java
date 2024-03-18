package com.shekharprogram.businessprofileqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Verify_code extends AppCompatActivity {
    Button submitotp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);
        submitotp=findViewById(R.id.submitotp);
        submitotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newpass=new Intent(Verify_code.this,New_password.class);
                startActivity(newpass);
            }
        });
    }
}