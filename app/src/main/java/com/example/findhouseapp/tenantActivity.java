package com.example.findhouseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tenantActivity extends AppCompatActivity {

    private Button buttonOne;
    private Button buttonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenant);

        buttonOne = (Button)findViewById(R.id.bt_next_id);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextOneIntent = new Intent(getApplicationContext(), galaryActivity.class);
                startActivity(nextOneIntent);


            }
        });

        buttonTwo = (Button)findViewById(R.id.bt_next2_id);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextTwoIntent = new Intent(getApplicationContext(), galaryActivity.class);
                startActivity(nextTwoIntent);
            }
        });
    }
}
