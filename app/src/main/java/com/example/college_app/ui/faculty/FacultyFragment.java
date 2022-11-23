package com.example.college_app.ui.faculty;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.college_app.MainActivity;
import com.example.college_app.R;

import java.util.ArrayList;

public class FacultyFragment extends Fragment {

    ArrayList<LinearPojo> arrayList;
    RecyclerView recyclerView;
    AdapterRecycler adapterRecycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_faculty, container, false);

        recyclerView = view.findViewById(R.id.recycleviewLiner);
        adapterRecycler = new AdapterRecycler(getContext(), arrayList);
        recyclerView.setAdapter(adapterRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        arrayList = new ArrayList<>();
        arrayList.add(new LinearPojo(R.drawable.f1,"Prof. Hemang Desai","I/C Principal BCA Department","Qualification: BCA,M.SC,Ph.D","He has Twelve years of teaching experience. He has published and presented five Research papers, Article in National level and International level Journal. He has attended Workshops, Seminars, Conferences and various Faculty development programs."));
        arrayList.add(new LinearPojo(R.drawable.f2,"Dr. Kavita Ahuja","Assistant Professor","Qualification: B.SC,MCA,Ph.D","She has 13 years of teaching experience. She is a Member of Board of Studies (BOS) at VNSGU in Computer Science and I.T. faculty. Her areas of interest are Data Analytics, Sensors Data, IoT, Big Data,Python and Database Management System. She has published more than 5 National and more than 10 International Peer reviewed Research papers. She has attended various MOOC programs, National and State level Workshops, Seminars, Conference and various Faculty development programs."));
        arrayList.add(new LinearPojo(R.drawable.f3,"Dr. Prashant Ghantiwala","Assistant Professor","Qualification: BCA,M.SC,Ph.D","He has Eleven years of teaching experience. He has published and presented four Research papers, Article in National level and International level Journal. He has attended Workshops, Seminars, Conferences and various Faculty development programs. His Area of interest are Microsoft .Net Technologies, Data Structures, Database Management System,  Machine Learning and Soft Computing."));
        arrayList.add(new LinearPojo(R.drawable.f4,"Dr. Ishaan Tamhankar","Assistant Professor","Qualification: BCA,MCA,Ph.D","He has seven years of teaching experience. He has published and presented 14 Research papers, Articles at the National level, and International level journals. He is a Reviewer also in Peer Review and UGC Approved Journal. He has published a book on “Fundamental of C Programming”. He has attended Workshops, Seminars, Conferences, and various Faculty development programs. His area of Interest in C, C++,Data Structure, Computer Graphics, Software Engineering, and Machine Learning."));
        arrayList.add(new LinearPojo(R.drawable.f5,"Prof. Aarti Jariwala","Assistant Professor","Qualification: BCA,MCA","Starting her career as a private educator for the past five years teaching young minds, she now has an overall teaching experience of more than a year at college-level teaching students of undergraduate courses like BCA and BBA. She is presently also working as a visiting Professor at Agarwal Vidya Vihar English Medium College. Her areas of interest are JAVA Programming, Android Application Development, IOT (Internet of Things). She has published One Research paper National level Conference."));
        arrayList.add(new LinearPojo(R.drawable.f6,"Prof. Pinal Solanki","Assistant Professor","Qualification: BCA,MCA","She has five years of teaching experience. She has published 2 research papers in national level Journals & presented one in International conferences. Her areas of interest are C Programming Language, Software Engineering, Network Technologies, and Database Management System. She has attended National, International and State level Seminars & Conferences."));
        arrayList.add(new LinearPojo(R.drawable.f7,"Prof. Ritu Bhatiya","Assistant Professor","Qualification: BCA,MCA","She has 3 years teaching experience as a private educator. Started her career as a teaching assistant from last one year in BCA. She has published 2 research papers in national level Journals & presented one in International conference. Her areas of interest are Microsoft .Net Technologies, Web Designing, Android programming, and Database Management System. She has attended National, International and State level Seminars & Conferences."));

    }
}