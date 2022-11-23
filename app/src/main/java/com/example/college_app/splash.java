package com.example.college_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.college_app.ui.SplashScreen;

public class splash extends AppCompatActivity {

    private static int SPLASH_SCREEN = 3000;

    Animation topAni,bottomAni,middleAni,middleAni1;
    ImageView image,image2;
    TextView col1,col2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        topAni = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAni = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAni = AnimationUtils.loadAnimation(this,R.anim.middle_ani);
        middleAni1 = AnimationUtils.loadAnimation(this,R.anim.middle_ani1);

        image = findViewById(R.id.img_splash);
        image2 = findViewById(R.id.img_splash2);
        col1 = findViewById(R.id.txtcol1);
        col2 = findViewById(R.id.txtcol2);


        image.setAnimation(topAni);
        col1.setAnimation(middleAni);
        col2.setAnimation(middleAni1);
        image2.setAnimation(bottomAni);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}