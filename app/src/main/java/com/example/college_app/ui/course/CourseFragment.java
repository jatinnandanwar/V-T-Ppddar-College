package com.example.college_app.ui.course;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.college_app.MainActivity;
import com.example.college_app.R;
import com.example.college_app.ui.faculty.AdapterRecycler;
import com.example.college_app.ui.faculty.LinearPojo;

import java.util.ArrayList;
import java.util.List;

public class CourseFragment extends Fragment {

    ListView listView,VlistView;
    ArrayList<LinearPojoC> arrayList,arrayList1;
    RecyclerView recyclerView,recyclerView1;
    AdapterRecyclerC adapterRecycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_course, container, false);

        //listView = view.findViewById(R.id.course_listview);
        //VlistView = view.findViewById(R.id.Voc_course_listview);

        recyclerView = view.findViewById(R.id.recycleviewLinerC);
        adapterRecycler = new AdapterRecyclerC(getContext(), arrayList);
        recyclerView.setAdapter(adapterRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView1 = view.findViewById(R.id.recycleviewLinerCV);
        adapterRecycler = new AdapterRecyclerC(getContext(), arrayList1);
        recyclerView1.setAdapter(adapterRecycler);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));
/*
//        List<String> list = new ArrayList<>();
//        list.add("BCA");
//        list.add("B.COM");
//        list.add("B.ED");

        List<String> Vlist = new ArrayList<>();
        Vlist.add("Basic Of Python Programming Language");
        Vlist.add("Communication Skills, Personality Development And Etiquette");
        Vlist.add("Creative Writing");
        Vlist.add("Life Skill Education");
        Vlist.add("Foundation Course On Yoga");
        Vlist.add("Foundation Course for Competitive Exams");
        Vlist.add("Basic Accounting, Tally Erp 9 & Tally Prime");

//        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1,list);
//        listView.setAdapter(arrayAdapter);

        ArrayAdapter VarrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1,Vlist);
        VlistView.setAdapter(VarrayAdapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position==0){
//                    Uri uri = Uri.parse("http://vtpoddar.com/?page_id=423");
//                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
//                }else if (position==1){
//                    Uri uri = Uri.parse("http://vtpoddar.com/?page_id=421");
//                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
//                }else if (position==2){
//                    Uri uri = Uri.parse("http://smvmt.com/");
//                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
//                }else {
//
//                }
//            }
//        });

        VlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Uri uri = Uri.parse("http://vtpoddar.com/?page_id=219");
                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
                }else if (position==1){
                    Uri uri = Uri.parse("http://vtpoddar.com/?page_id=221");
                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
                }else if (position==2){
                    Uri uri = Uri.parse("http://vtpoddar.com/?page_id=223");
                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
                }else if (position==3){
                    Uri uri = Uri.parse("http://vtpoddar.com/?page_id=225");
                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
                }else if (position==4){
                    Uri uri = Uri.parse("http://vtpoddar.com/?page_id=227");
                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
                }else if (position==5){
                    Uri uri = Uri.parse("http://vtpoddar.com/?page_id=229");
                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
                }else if (position==6){
                    Uri uri = Uri.parse("http://vtpoddar.com/?page_id=231");
                    startActivity(new Intent(Intent.ACTION_VIEW,uri));
                }else {

                }
            }
        });
*/

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        arrayList = new ArrayList<>();
        arrayList.add(new LinearPojoC("BCA","The Bachelor of Degrees in Computer Applications (BCA) is one of the most popular degrees among  students pursuing a career in  IT (Information Technology). The  course lasts 3 years and is divided into 6 semesters. During the BCA Period, C programming (basic and advanced), networking, WorldWideWeb, data structures, advanced C programming, database management, mathematics, software engineering, object-oriented programming using C ++, Visual Basic. Includes various subjects such as programming with PHP. , JAVA, Oracle, operating system, web scripting and development etc.\n" +
                "\n" +
                "This course offers many opportunities for students who are interested in computers and want to work in the IT field as a programmer or software developer and a Standalone option is also available. If you have that many skills, you can develop freelance work or your own software. There are many software MNCs (Multinational Companies) that provide jobs to BCA graduates. If the candidate has work experience and all the necessary skills, he / she can take a good position in a multinational corporation.",""));
        arrayList.add(new LinearPojoC("B.COM","Bachelor of Commerce (BCom) is a three-year undergraduate course pursued by a large number of students across the country every year. In this era of globalisation and industrialization, there is a boom in jobs related to the Bachelor of Commerce course and one who pursues it, gets a chance to become successful in his/her career.\n" +
                "\n" +
                "The three year BCom course is divided into six semesters. Students pursuing the course can choose elective subjects of their choice in some semesters. Subjects taught during a BCom degree course includes Financial Accounting, Business Laws, Economics, Taxation, Auditing, Cost Accounting, among others.\n" +
                "\n" +
                "The Bachelor of Commerce has the objective of providing students with the knowledge, tools of analysis and skills with which to understand and participate in the modern business and economics world, to prepare them for subsequent graduate studies and to achieve success in their professional careers.\n" +
                "\n" +
                "Bachelor of Commerce course graduates can make a career in corporate and financial services, banking, management services. One also has the opportunity to practice independently and make a business out of it.",""));
        arrayList.add(new LinearPojoC("B.ED","Shri Mahavir Vidyamandir Trust Sanchalit and Veer Narmad South Gujarat University Affiliated Shri Mahavir Vidyamandir Trust B.Ed. College (SMVMT) is NCTE recognized (No. WRC/323080) and established in the year of 2003. SMVMT is associated with Vidyabharti, Uchcha Siksha Sansthan. It is teacher training college, working for the all-round development of trainees. Aim of colleges to develop skill full future teachers with a sense of patriotism.\n" +
                "\n" +
                "SMVMT has the distinction of being a resourceful teacher training center due to the pedagogical and field works related to the teacher training in the field of education. SMVMT has highly qualified and efficient faculties. Faculties are continuously involved in nurturing trainees. Faculties are publishing research paper and thematic articles in various national and international journals and magazines. College has adequate and updated infrastructure.",""));

        arrayList1 = new ArrayList<>();
        arrayList1.add(new LinearPojoC("Basic Of Python Programming Language","Python is a powerful general-purpose programming language, and is the most demanding language in today’s automated world. It is used in data analysis, Robotics, web development, data science, creating software prototypes, and so on, But Python also has some awesome libraries and frameworks for creating desktop applications and GUI apps. Learning how to create desktop applications using Python is a great skill to have because it is easy and allows you to develop your own app. You can create apps for yourself and use it for personal purposes or automate your daily stuff or maybe design an app and use it for commercial purposes like designing games.\n" +
                "\n" +
                "After completion of this course, the aspirants will learn Master GUI Development with Tkinter and Python, Create multiple Tkinter projects, including forms, games, and even a chat app that interacts with a web API. Throughout the entire course, follow best practices for Python and Tkinter code as taught by a professional software developer with years of experience.\n" +
                "\n" +
                "Admission Eligibility: 12th Pass   \n" +
                "\n" +
                "Course Credits: 2 Credit\n" +
                "\n" +
                "Course Duration: 35 hrs\n" +
                "\n" +
                "Course Fees: Rs. 1000/-\n" +
                "\n" +
                "Contact Person Name: Dr. Kavita K. Ahuja, Prof. Hemang Desai   \n" +
                "\n" +
                "Contact Number: 9033696385, 9879204700\n" +
                "\n" +
                "Click here to fill registration form:","https://docs.google.com/forms/d/e/1FAIpQLSf1kGJSAM2AhegoyCViBAbaX9JE_J7jinjjS7UmoyaMQ2TppA/viewform"));
        arrayList1.add(new LinearPojoC("Communication Skills, Personality Development And Etiquette","The word personality refers to the overall outcome of what a man is. Personality development means developing a personality cult so as to create a strong positive impression about you. Personality development occurs through the ongoing interaction of temperament character, and environment. Personality constitutes of various elements like intelligence, physique, temperament, patience etc. All these elements lead to a good personality. In the field of management personality plays a key role in career building and success. The personality development has become a vital constituent of a successful person. Personality is somewhere eternal and it is mainly dependent on the atmosphere in which a human being grows up.\n" +
                "\n" +
                "Objective of the program convey information—instructions, policies, procedures, decisions, etc., so the listener will hear, read, understand what is said, agree and accept the message and react as intended by the sender of communication and Focus on Personality Development Skills, Dressing Sense, Body Language and Etiquette. Develop and exhibit and accurate sense of self. Develop and nurture a deep understanding of personal motivation. Develop an understanding of and practice personal and professional responsibility as well as get to Learn Methods of Stress Management and Improved Vocabulary of English and Resume and Business Letter Writing.\n" +
                "\n" +
                "Admission Eligibility: 12th Pass   \n" +
                "\n" +
                "Course Credits: 2 Credit\n" +
                "\n" +
                "Course Duration: 40 hrs\n" +
                "\n" +
                "Course Fees: Rs. 1000/-\n" +
                "\n" +
                "Contact Person Name: Dr. Ishaan Tamhankar, Prof. Hemang Desai   \n" +
                "\n" +
                "Contact Number: 9978279064, 9879204700\n" +
                "\n" +
                "Click here to fill registration form:","https://docs.google.com/forms/d/e/1FAIpQLSf1kGJSAM2AhegoyCViBAbaX9JE_J7jinjjS7UmoyaMQ2TppA/viewform"));
        arrayList1.add(new LinearPojoC("Creative Writing","The Certificate Course in Creative Writing provides an introduction to the foundations of creative writing in English. It aims at imparting the key concepts of traditional and modern forms of creative writing and shaping the amateur’s mind into the professional writer’s mind. Thus, the course will provide the basics of creative writing such as fundamental principles and elements of writing, and introduce the traditional and new modes/forms of creative writing to the aspiring and budding writers.\n" +
                "\n" +
                "i. Distinguish between the literary genres\n" +
                "\n" +
                "ii. Write for various literary and social media\n" +
                "\n" +
                "iii. Critically appreciate various forms of literature\n" +
                "\n" +
                "iv. Make innovative use of their creative and critical faculties\n" +
                "\n" +
                "v. Seek employment in various creative fields\n" +
                "\n" +
                "Admission Eligibility: 12th Pass       \n" +
                "\n" +
                "Course Credits: 2 Credit\n" +
                "\n" +
                "Course Duration: 30 hrs\n" +
                "\n" +
                "Course Fees: Rs. 1000/-\n" +
                "\n" +
                "Contact Person Name: Dr. Riddhi Desai, Shri Chandrakantbhai Shah   \n" +
                "\n" +
                "Contact Number: 9624316566, 9428450684\n" +
                "\n" +
                "Click here to fill registration form:","https://docs.google.com/forms/d/e/1FAIpQLSf1kGJSAM2AhegoyCViBAbaX9JE_J7jinjjS7UmoyaMQ2TppA/viewform"));
        arrayList1.add(new LinearPojoC("Life Skill Education","This course is designed to cater to participants from multidisciplinary areas like education, health, counseling, corporate sector, heads of different institutes, women development organizations, social work activists, NGOs, parents, students of higher education and policy makers. The course covers various elements of Life Skills Education (LSE) process, including fundamentals of LSE, scope of LSE, theoretical foundations of LSE, different types of Life skills and its relation to media, health and education professionals, parents and other members of society in practicing skills for better living.\n" +
                "\n" +
                "Develop understanding into the fundamentals of life skills.\n" +
                "Experience self-awareness and develops ways to face demands and challenges of life.\n" +
                "Examine the theoretical and application-based perspective of life skills education.\n" +
                "Develop competencies to classify different types of life skills.\n" +
                "Admission Eligibility: 12th Pass   \n" +
                "\n" +
                "Course Credits: 2 Credit\n" +
                "\n" +
                "Course Duration: 30 hrs\n" +
                "\n" +
                "Course Fees: Rs. 1000/-\n" +
                "\n" +
                "Contact Person Name: Dr. Riddhi Desai, Shri Chandrakantbhai Shah   \n" +
                "\n" +
                "Contact Number: 9624316566, 9428450684\n" +
                "\n" +
                "Click here to fill registration form:","https://docs.google.com/forms/d/e/1FAIpQLSf1kGJSAM2AhegoyCViBAbaX9JE_J7jinjjS7UmoyaMQ2TppA/viewform"));
        arrayList1.add(new LinearPojoC("Foundation Course On Yoga","Yoga is a mental, spiritual and physical practice that helps one attain inner peace. Yoga not only relaxes an individual but also keeps the human body fit. Apart from physical fitness, yoga is also beneficial for reducing respiratory disorders, hypertension, and helps in the management of diseases like diabetes, depression, stress etc.\n" +
                "\n" +
                "Thinking creatively\n" +
                "Coordination\n" +
                "Flexibility\n" +
                "Judgment and Decision Making\n" +
                "Learning Strategies\n" +
                "Cure Physical Disease\n" +
                "Cure Mental Health\n" +
                "Admission Eligibility: 12th Pass       \n" +
                "\n" +
                "Course Credits: 2 Credit\n" +
                "\n" +
                "Course Duration: 30 hrs\n" +
                "\n" +
                "Course Fees: Rs. 1000/-\n" +
                "\n" +
                "Contact Person Name: Prof. Ankit Jadav, Shri Chandrakantbhai Shah   \n" +
                "\n" +
                "Contact Number: 8905284898, 9428450684\n" +
                "\n" +
                "Click here to fill registration form: ","https://docs.google.com/forms/d/e/1FAIpQLSf1kGJSAM2AhegoyCViBAbaX9JE_J7jinjjS7UmoyaMQ2TppA/viewform"));
        arrayList1.add(new LinearPojoC("Foundation Course for Competitive Exams","This course is meant to help you in the preparation for all kinds of competitive exams coming your way in the Future. This course will help you to built your reasoning skill, verbal ability and enhance your data interpretation skills.\n" +
                "\n" +
                "Understand and practice  quantitative aptitude \n" +
                "Understand and practice logical reasoning \n" +
                "Understand and Practice verbal reasoning\n" +
                "Admission Eligibility: 12th Pass   \n" +
                "\n" +
                "Course Credits: 2 Credit\n" +
                "\n" +
                "Course Duration: 30 hrs\n" +
                "\n" +
                "Course Fees: Rs. 1000/-\n" +
                "\n" +
                "Contact Person Name: Mrs. Hetal Mahuvagara, Prof. Hemang Desai   \n" +
                "\n" +
                "Contact Number: 9275700469, 9879204700\n" +
                "\n" +
                "Click here to fill registration form:","https://docs.google.com/forms/d/e/1FAIpQLSf1kGJSAM2AhegoyCViBAbaX9JE_J7jinjjS7UmoyaMQ2TppA/viewform"));
        arrayList1.add(new LinearPojoC("Basic Accounting, Tally Erp 9 & Tally Prime","This course is designed to impart knowledge regarding concepts of Financial Accounting Tally is an accounting package which is used for learning to maintain accounts. As this course is useful \n" +
                "\n" +
                "for Commerce students to get placements in different offices as well as companies in Accounts departments.\n" +
                "\n" +
                "It will prepare the aspiring students to become computer programmers who can work in companies at entry level and can also work independently.\n" +
                "\n" +
                "Admission Eligibility: 12th Pass   \n" +
                "\n" +
                "Course Credits: 2 Credit\n" +
                "\n" +
                "Course Duration: 40 Hours (Theory + Practical)\n" +
                "\n" +
                "Course Fees: Rs. 1500/-\n" +
                "\n" +
                "Contact Person Name: Mr. Ajay Patil, Prof. Hemang Desai   \n" +
                "\n" +
                "Contact Number: 8460860106, 9879204700\n" +
                "\n" +
                "Click here to fill registration form:","https://docs.google.com/forms/d/e/1FAIpQLSf1kGJSAM2AhegoyCViBAbaX9JE_J7jinjjS7UmoyaMQ2TppA/viewform"));
    }
}