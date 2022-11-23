package com.example.college_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FacultyDetails extends AppCompatActivity {

    ImageView imageView;
    TextView name,desc,quali,det;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_details);

        imageView = findViewById(R.id.Drec_img1);
        name = findViewById(R.id.Drec_name);
        desc = findViewById(R.id.Drec_des);
        quali = findViewById(R.id.Drec_ade);
        det = findViewById(R.id.Drec_det);

        imageView.setImageResource(getIntent().getIntExtra("image",0));
        name.setText(getIntent().getStringExtra("name"));
        desc.setText(getIntent().getStringExtra("desc"));
        quali.setText(getIntent().getStringExtra("quali"));
        det.setText(getIntent().getStringExtra("details"));

    }
}