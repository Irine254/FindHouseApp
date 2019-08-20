package com.example.findhouseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    private static int TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
         handler.postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent intent = new Intent(getApplicationContext(),splashScreen.class);
                 startActivity(intent);
                 finish();

             }
         },TIME_OUT);

    }
}
