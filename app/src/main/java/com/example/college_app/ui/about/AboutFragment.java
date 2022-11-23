package com.example.college_app.ui.about;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.college_app.FullScreenImage;
import com.example.college_app.R;

public class AboutFragment extends Fragment {

    ImageView facebook,website,insta,map;
    GridView gridView;
    TextView txtadd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_about, container, false);

        facebook = view.findViewById(R.id.img_Afacebook);
        website = view.findViewById(R.id.img_Awebsite);
        insta = view.findViewById(R.id.img_Ainstagram);
        map = view.findViewById(R.id.college_map);
        gridView = view.findViewById(R.id.AgridView);
        txtadd = view.findViewById(R.id.txtAdd);

        gridView.setAdapter(new ImageAdapter(this.getContext()));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getActivity(), FullScreenImage.class);
                intent.putExtra("id",i);
                startActivity(intent);
            }
        });

        txtadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.co.in/maps/place/Vimal+Tormal+Poddar+BCA+%26+Commerce+College/@21.1464072,72.8479896,17z/data=!3m1!4b1!4m5!3m4!1s0x3be051d2dd3459af:0x3312b11c699e47fe!8m2!3d21.1464072!4d72.8501783?hl=en");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUrl("https://m.facebook.com/vtpbcabcomcollege");
            }
        });

        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUrl("http://vtpoddar.com/");
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUrl("https://www.instagram.com/vtp_bca_bcom_official/?utm_medium=copy_link");
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.co.in/maps/place/Vimal+Tormal+Poddar+BCA+%26+Commerce+College/@21.1464072,72.8479896,17z/data=!3m1!4b1!4m5!3m4!1s0x3be051d2dd3459af:0x3312b11c699e47fe!8m2!3d21.1464072!4d72.8501783?hl=en");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        return view;
    }

    private void openUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}