package com.example.hrentalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tenants extends AppCompatActivity {
TextView noaccount;
Button tenantslogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenants);
        tenantslogin = findViewById(R.id.tenantslogin);
        noaccount = findViewById(R.id.noaccount);
        noaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TenantsRegister.class);
                startActivity(i);
                finish();
            }
        });
        tenantslogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TenantsDashboard.class));
            }
        });
    }
}