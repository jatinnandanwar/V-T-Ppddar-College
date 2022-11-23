package com.example.college_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.college_app.ui.AdapterRecHol;
import com.example.college_app.ui.LinearPojoHol;
import com.example.college_app.ui.faculty.AdapterRecycler;
import com.example.college_app.ui.faculty.LinearPojo;

import java.util.ArrayList;

public class Holiday extends AppCompatActivity {

    ArrayList<LinearPojoHol> arrayList;
    RecyclerView recyclerView;
    AdapterRecHol adapterRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday);

        linearlistdata();

        recyclerView = findViewById(R.id.recycleviewLinerHol);
        adapterRecycler = new AdapterRecHol(this, arrayList);
        recyclerView.setAdapter(adapterRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    private void linearlistdata() {
        arrayList = new ArrayList<LinearPojoHol>();
        arrayList.add(new LinearPojoHol("9 Aug","Tuesday","Moharam"));
        arrayList.add(new LinearPojoHol("11 Aug","Tuesday","Rakshabandhan"));
        arrayList.add(new LinearPojoHol("15 Aug","Monday","Independent day"));
        arrayList.add(new LinearPojoHol("16 Aug","Tuesday","Pateti"));
        arrayList.add(new LinearPojoHol("19 Aug","Friday","Janmashtami"));
        arrayList.add(new LinearPojoHol("31 Aug","Wednesday","Ganesh Chaturthi"));
        arrayList.add(new LinearPojoHol("9 Sep","Friday","Ganesh Vishrjan"));
        arrayList.add(new LinearPojoHol("5 Oct","Wednesday","Dashera"));
        arrayList.add(new LinearPojoHol("19 Oct \n to \n 8 Nov","","Diwali Vacation"));
    }
}