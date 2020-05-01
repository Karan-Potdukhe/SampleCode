package com.practice.manualapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bta, btb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bta = (Button)findViewById(R.id.buttonlogin);
        Button btb = (Button)findViewById(R.id.buttonregister);
        bta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia = new Intent(MainActivity.this,LoginPage.class);
                startActivity(ia);
            }

        });
        btb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ib = new Intent(MainActivity.this, Registration.class);
                startActivity(ib);
            }
    });
}}
