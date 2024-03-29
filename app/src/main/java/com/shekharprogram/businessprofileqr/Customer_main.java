package com.shekharprogram.businessprofileqr;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.widget.Toolbar;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.shekharprogram.businessprofileqr.Adapter.Bus_profileRecyclerAdapter;
import com.shekharprogram.businessprofileqr.cus_nav_fragment.Home_sub_business_profile.cus_business_profile;
import com.shekharprogram.businessprofileqr.cus_nav_fragment.cus_HomeFragment;
import com.shekharprogram.businessprofileqr.cus_nav_fragment.cus_Wishlist;

public class Customer_main extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;
    ImageButton buttonDrawerToggle;
    Toolbar toolbar;
    TextView top_bar_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_main);
        toolbar=findViewById(R.id.toolbar);
        buttonDrawerToggle=findViewById(R.id.buttonDrawerToggle);
        View topBarLayout = findViewById(R.id.cus_top_nav);
        top_bar_text = topBarLayout.findViewById(R.id.cus_top_bar_text);
        fragmentManager = getSupportFragmentManager();


        drawerLayout=findViewById(R.id.cus_drawer_layout);
        bottomNavigationView=findViewById(R.id.bottom_navigation);
//        setSupportActionBar(toolbar);
//        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer_layout,toolbar,R.string.OpenDrawer,R.string.CloseDrawer);
//        drawer_layout.addDrawerListener(toggle);
//        toggle.syncState(); //setSupportActionBar(toolbar);
       NavigationView navigationView=findViewById(R.id.cus_navigation_drawer);
       navigationView.setNavigationItemSelectedListener(this);
       bottomNavigationView=findViewById(R.id.bottom_navigation);
       bottomNavigationView.setBackground(null);
        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.open();
            }
        });
       bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               top_bar_text.setText("");
               int itemid=item.getItemId();
               if (itemid==R.id.cus_watchlist){
                   openFragment(new cus_Wishlist());
                   top_bar_text.setText("Wishlist");

                   return true;
               } else if (itemid==R.id.cus_home) {
                   openFragment(new cus_HomeFragment());

                   return true;
               }
               return false;
           }
       });

       openFragment(new cus_HomeFragment());


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String receivedData = bundle.getString("data");
            if (receivedData != null) {
                // Do something with the received data
                top_bar_text.setText(receivedData);
            }
        }



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        top_bar_text.setText("");
        int itemid=item.getItemId();
        if (itemid==R.id.cus_Wishlist) {
            openFragment(new cus_Wishlist());
            top_bar_text.setText("Wishlist");
        } else if (itemid==R.id.cus_acc_info) {
            openFragment(new cus_HomeFragment());
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true ;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }

    }
    private void openFragment(Fragment fragment){
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.cus_framecontainer,fragment);
        transaction.commit();
    }


}