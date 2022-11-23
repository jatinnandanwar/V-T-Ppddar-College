package com.example.college_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.college_app.ui.about.AboutFragment;
import com.example.college_app.ui.course.CourseFragment;
import com.example.college_app.ui.faculty.FacultyFragment;
import com.example.college_app.ui.home.HomeFragment;
import com.example.college_app.ui.notice.NoticeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNavigationView;
    private NavController navController;
    AlertDialog.Builder builder;

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;

   // private AppBarConfiguration appBarConfiguration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navController = Navigation.findNavController(this,R.id.frame_layout);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigation_view);
        builder = new AlertDialog.Builder(this);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.start,R.string.close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        //Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(this);

        NavigationUI.setupWithNavController(bottomNavigationView,navController);

//        appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_home, R.id.navigation_notice, R.id.navigation_faculty, R.id.navigation_course, R.id.navigation_about)
//                .setDrawerLayout(drawerLayout)
//                .build();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return true;
    }



//    @Override
//    public boolean setNavigationItemSelectedListener(@NonNull MenuItem item) {
//        int id = item.getItemId();
//        item.setChecked(true);
//        drawerLayout.closeDrawer(GravityCompat.START);
//        switch (id){
//            case R.id.navigation_home:
//                //Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
//                replaceFragement(new HomeFragment());
//
//                break;
//            case R.id.navigation_notice:
//                //Toast.makeText(this, "Notice", Toast.LENGTH_SHORT).show();
//                replaceFragement(new NoticeFragment());
//                break;
//            case R.id.navigation_faculty:
//                //Toast.makeText(this, "Faculty", Toast.LENGTH_SHORT).show();
//                replaceFragement(new FacultyFragment());
//                break;
//            case R.id.navigation_course:
//                //Toast.makeText(this, "Course", Toast.LENGTH_SHORT).show();
//                replaceFragement(new CourseFragment());
//                break;
//            case R.id.navigation_about:
//                //Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
//                replaceFragement(new AboutFragment());
//                break;
//        }
//        return true;
//    }
//    private void replaceFragement(Fragment fragment){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frame_layout,fragment);
//        fragmentTransaction.commit();
//    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        item.setChecked(true);
        drawerLayout.closeDrawer(GravityCompat.START);
        switch (id){
            case R.id.navigation_home:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                //Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                //replaceFragement(new HomeFragment());

                break;
            case R.id.navigation_material:
                Intent intent1 = new Intent(this,Learning_Material.class);
                startActivity(intent1);
                //Toast.makeText(this, "Learning Material", Toast.LENGTH_SHORT).show();
                //replaceFragement(new NoticeFragment());
                break;
            case R.id.navigation_ExamSc:
                Intent intent2 = new Intent(this,Exam_Schedule.class);
                startActivity(intent2);
                //Toast.makeText(this, "Exam Schedule", Toast.LENGTH_SHORT).show();
                //replaceFragement(new FacultyFragment());
                break;
            case R.id.navigation_timetable:
                Intent intent3 = new Intent(this,TimeTable.class);
                startActivity(intent3);
                //Toast.makeText(this, "Time Table", Toast.LENGTH_SHORT).show();
                //replaceFragement(new CourseFragment());
                break;
            case R.id.navigation_holiday:
                Intent intent4 = new Intent(this,Holiday.class);
                startActivity(intent4);
                //Toast.makeText(this, "Holiday", Toast.LENGTH_SHORT).show();
                //replaceFragement(new AboutFragment());
                break;
            case R.id.navigation_exit:
                builder.setMessage("Do you want to close this application ?") .setTitle("Logout");

                //Setting message manually and performing action on button click
                builder.setMessage("Do you want to close this application ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                //Toast.makeText(getApplicationContext(),"you choose yes action for alertbox",
                                   //     Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //  Action for 'NO' Button
                                dialog.cancel();
                                //Toast.makeText(getApplicationContext(),"you choose no action for alertbox",
                                  //      Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Logout");
                alert.show();
                break;
        }
        return true;
    }
}