package com.example.hrentalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Owner extends AppCompatActivity {
EditText username,password;
Button ownerlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        ownerlogin = findViewById(R.id.login);
        ownerlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().isEmpty())
                {
                    username.setError("Required");
                    return;
                }
                if(password.getText().toString().isEmpty())
                {
                    password.setError("Required");
                    return;
                }
                startActivity(new Intent(getApplicationContext(),OwnersDashboard.class));
                finish();
            }
        });

    }
}