package com.practice.manualapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {
    Button ir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Button ir = (Button)findViewById(R.id.btn_reg);
        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ira = new Intent(LoginPage.this, Registration.class);
                startActivity(ira);
            }
        });
    }

    public void btn_signupForm(View view) {

    }
}
