package com.example.college_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.college_app.ui.course.AdapterRecyclerC;
import com.example.college_app.ui.course.LinearPojoC;

import java.util.ArrayList;

public class Exam_Schedule extends AppCompatActivity {

    ArrayList<LinearPojoC> arrayList;
    RecyclerView recyclerView;
    AdapterRecyclerC adapterRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_schedule);

        linearlistdata();

        recyclerView = findViewById(R.id.recycleviewLinerExam);
        adapterRecycler = new AdapterRecyclerC(this, arrayList);
        recyclerView.setAdapter(adapterRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void linearlistdata() {
        arrayList = new ArrayList<>();
        arrayList.add(new LinearPojoC("BCA Internal Exam","Cilck Below link : ","https://drive.google.com/file/d/1atL8p5dIX83aYtvV9WJZmqqVCnrWYXzA/view?usp=drivesdk"));
        arrayList.add(new LinearPojoC("BCA External Exam","Cilck Below link : ","https://drive.google.com/file/d/1bEEhKEL9-rfCPWQpp2gBMDIzaj7zTh6o/view?usp=drivesdk"));

    }
}