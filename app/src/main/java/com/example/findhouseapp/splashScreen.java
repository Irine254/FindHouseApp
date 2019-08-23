package com.example.findhouseapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mikhaellopez.circularimageview.CircularImageView;

public class splashScreen extends AppCompatActivity {

    private Button uploadButton;
    private Uri mUri;
    private CircularImageView profileCircularImageView;
    private static final int PICK_IMAGE_REQUEST =1;
    private Button saveButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        uploadButton = (Button)findViewById(R.id.bt_upload_id);
        profileCircularImageView = (CircularImageView)findViewById(R.id.ci_image_id);


        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChooseImage ();
            }
        });

        saveButton = (Button)findViewById(R.id.bt_save_id);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent saveIntent = new Intent (getApplicationContext(),tenantActivity.class);
                startActivity(saveIntent);
            }
        });






    }

    private void ChooseImage() {

        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(intent.ACTION_GET_CONTENT);

        startActivityForResult(intent, PICK_IMAGE_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData()!= null){

            mUri = data.getData();
            profileCircularImageView.setImageURI(mUri);






        } else {
            Toast.makeText(this, "No image selected", Toast.LENGTH_SHORT).show();
        }
    }
}
