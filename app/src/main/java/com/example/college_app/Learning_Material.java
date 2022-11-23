package com.example.college_app;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.college_app.ui.course.AdapterRecyclerC;
import com.example.college_app.ui.course.LinearPojoC;

import java.util.ArrayList;

public class Learning_Material extends AppCompatActivity {

    ArrayList<LinearPojoC> arrayList;
    RecyclerView recyclerView;
    AdapterRecyclerC adapterRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_material);

        linearlistdata();

        recyclerView = findViewById(R.id.recycleviewLinerExam);
        adapterRecycler = new AdapterRecyclerC(this, arrayList);
        recyclerView.setAdapter(adapterRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void linearlistdata() {

        arrayList = new ArrayList<>();
        arrayList.add(new LinearPojoC(" 1  Advanced Mobile Computing","Cilck Below link : ","https://drive.google.com/drive/folders/18tlP0VmTZ1xMc0unQusb83AMUt2v0J1x"));
        arrayList.add(new LinearPojoC(" 2  Unix and Shell Programming","Cilck Below link : ","https://drive.google.com/drive/folders/1aIGQZrKq-Yq5ESJBWEpcNXzWuk0KDk2i"));
        arrayList.add(new LinearPojoC(" 3  Network Technologies","Click Below link : ","https://drive.google.com/drive/folders/1ch4wHEShFLrBXexX_3LiR38LLwa9h5To"));
        arrayList.add(new LinearPojoC(" 4  Web Framework and Services","Cilck Below link : ","https://drive.google.com/drive/folders/1Ov-FOucBO4xhQ1U9ucQ0WZ-9UW5ooJXD?usp=sharing"));
        arrayList.add(new LinearPojoC(" 5  ASP.NET","Cilck Below link : ","https://drive.google.com/drive/folders/1qfDF4BnfpClo4kyYxWdi3xjbmavO_g7C"));
        arrayList.add(new LinearPojoC(" 6  Advanced Web Designing","No Record",""));

    }
}