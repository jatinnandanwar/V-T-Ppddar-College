package com.example.college_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CourseDetails extends AppCompatActivity {


    TextView course,course1,course2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        course = findViewById(R.id.Dcourse);
        course1 = findViewById(R.id.Dcourse1);
        course2 = findViewById(R.id.Dcourse2);

        course.setText(getIntent().getStringExtra("course"));
        course1.setText(getIntent().getStringExtra("course1"));
        course2.setText(getIntent().getStringExtra("course2"));

    }
}