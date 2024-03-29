package com.shekharprogram.businessprofileqr;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.window.OnBackInvokedDispatcher;

import com.google.android.material.navigation.NavigationView;
import com.shekharprogram.businessprofileqr.nav_fragment.HomeFragment;
import com.shekharprogram.businessprofileqr.nav_fragment.MyOrderFragment;
import com.shekharprogram.businessprofileqr.nav_fragment.MyProductFragment;
import com.shekharprogram.businessprofileqr.nav_fragment.PasswordFragment;

public class Business_main extends AppCompatActivity {
    ImageButton buttonDrawerToggle, addproductbtn;
    DrawerLayout drawer_layout;
    NavigationView navigationview;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_main);
        buttonDrawerToggle=findViewById(R.id.buttonDrawerToggle);
//        addproductbtn=findViewById(R.id.add_btn);
        drawer_layout=findViewById(R.id.drawer_layout);
        navigationview=findViewById(R.id.navigationview);
        toolbar=findViewById(R.id.toolbar);
        View headerView=navigationview.getHeaderView(0);
        ImageView ToggleClose=headerView.findViewById(R.id.toggleclosebtn);

//        setSupportActionBar(toolbar);
//        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer_layout,toolbar,R.string.OpenDrawer,R.string.CloseDrawer);
//        drawer_layout.addDrawerListener(toggle);
//        toggle.syncState();
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
//        addproductbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(Business_main.this, Add_products.class);
//                startActivity(intent);
//            }
//        });
        loadFragment(new HomeFragment());

        navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemid=item.getItemId();
                if (itemid==R.id.Info){

                    Toast.makeText(Business_main.this, "Info Clicked", Toast.LENGTH_SHORT).show();
                    loadFragment(new HomeFragment());

                }
                if (itemid==R.id.Password){
                    Toast.makeText(Business_main.this, "Password Clicked", Toast.LENGTH_SHORT).show();
                    loadFragment(new PasswordFragment());
                }
                if (itemid==R.id.myOder){
                    Toast.makeText(Business_main.this, "myOder Clicked", Toast.LENGTH_SHORT).show();
                    loadFragment(new MyOrderFragment());
                }
                if (itemid==R.id.MyProduct){
//                    Intent intent=new Intent(Business_main.this, my_product_business.class);
//                    startActivity(intent);
                    loadFragment(new MyProductFragment());
                    Toast.makeText(Business_main.this, "MyProduct Clicked", Toast.LENGTH_SHORT).show();
                }
                if (itemid==R.id.Logout){
                    Toast.makeText(Business_main.this, "Logout Clicked", Toast.LENGTH_SHORT).show();
                }

//                drawer_layout.closeDrawer(GravityCompat.START);
                drawer_layout.close();
                return false;
            }
        });

    }

//    @NonNull
//    @Override
//    public OnBackInvokedDispatcher getOnBackInvokedDispatcher() {
//        if (drawer_layout.isDrawerOpen(GravityCompat.START)){
//                drawer_layout.closeDrawer(GravityCompat.START);
//        }else {
//            super.getOnBackInvokedDispatcher();
//        }
//        return null;
//    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.framecontainer,fragment);
        ft.commit();

    }
}