package com.example.hrentalapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TenantsDashboard extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenants_dashboard);
        bottomNavigationView = findViewById(R.id.bottommenu);
        Home home = new Home();
        Payments payments = new Payments();
        Messages messages = new Messages();
        changeitems(home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.home:
                        changeitems(home);
                        return true;
                    case R.id.payments:
                        changeitems(payments);
                        return true;
                    case R.id.message:
                        changeitems(messages);
                        return true;

                    default:
                        return false;


                }
            }
        });
    }
    public void changeitems(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.myframes,fragment);
        fragmentTransaction.commit();

    }
}