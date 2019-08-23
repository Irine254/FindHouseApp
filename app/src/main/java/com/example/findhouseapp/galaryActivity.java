package com.example.findhouseapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class galaryActivity extends AppCompatActivity {
    private ImageView uploadImageView;
    private Button uploadButton;
    private static final int PICK_IMAGE_REQUEST = 1000;
    private Uri mImageUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galary3);




        uploadButton = (Button)findViewById(R.id.bt_upload_id);
        uploadImageView = (ImageView)findViewById(R.id.iv_uploadGalary_id);

        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChooseImage ();
            }
        });

    }

    private void ChooseImage() {

        Intent intentImage = new Intent();

        intentImage.setType("image/*");
        intentImage.setAction(intentImage.ACTION_GET_CONTENT);

        startActivityForResult(intentImage, PICK_IMAGE_REQUEST);




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode ==PICK_IMAGE_REQUEST && resultCode ==RESULT_OK && data !=null && data.getData()!=null){
            mImageUri = data.getData();
            uploadImageView.setImageURI(mImageUri);

        }else {
            Toast.makeText(this, "No image selected", Toast.LENGTH_SHORT).show();
        }
    }
}
