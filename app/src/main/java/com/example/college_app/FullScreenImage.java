package com.example.college_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.college_app.ui.about.ImageAdapter;

public class FullScreenImage extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        imageView = (ImageView)findViewById(R.id.image_view);

        getSupportActionBar().hide();
        getSupportActionBar().setTitle("Full Screen Image");

        Intent i = getIntent();

        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);
        imageView.setImageResource(imageAdapter.imageArray[position]);


    }
}