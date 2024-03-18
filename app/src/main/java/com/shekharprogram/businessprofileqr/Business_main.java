package com.shekharprogram.businessprofileqr;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Business_main extends AppCompatActivity {
    ImageButton buttonDrawerToggle, addproductbtn;
    DrawerLayout drawer_layout;
    NavigationView navigationview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_main);
        buttonDrawerToggle=findViewById(R.id.buttonDrawerToggle);
        addproductbtn=findViewById(R.id.add_btn);
        drawer_layout=findViewById(R.id.drawer_layout);
        navigationview=findViewById(R.id.navigationview);
        View headerView=navigationview.getHeaderView(0);
        ImageView ToggleClose=headerView.findViewById(R.id.toggleclosebtn);
        ToggleClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer_layout.close();
            }
        });
        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer_layout.open();
            }
        });
        addproductbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Business_main.this, Add_products.class);
                startActivity(intent);
            }
        });

        navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemid=item.getItemId();
                if (itemid==R.id.Info){
                    Toast.makeText(Business_main.this, "Info Clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemid==R.id.Password){
                    Toast.makeText(Business_main.this, "Password Clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemid==R.id.myOder){
                    Toast.makeText(Business_main.this, "myOder Clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemid==R.id.MyProduct){
                    Toast.makeText(Business_main.this, "MyProduct Clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemid==R.id.Logout){
                    Toast.makeText(Business_main.this, "Logout Clicked", Toast.LENGTH_SHORT).show();
                }

                drawer_layout.close();
                return false;
            }
        });

    }
}