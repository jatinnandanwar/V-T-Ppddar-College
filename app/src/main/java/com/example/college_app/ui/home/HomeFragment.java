package com.example.college_app.ui.home;

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

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.college_app.FullScreenImage;
import com.example.college_app.MainActivity;
import com.example.college_app.R;
import com.example.college_app.ui.about.ImageAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private ImageSlider imageSlider;
    ImageView facebook,website,insta;
    GridView gridView;
    TextView addm1,addm2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        imageSlider = view.findViewById(R.id.slider);
        facebook = view.findViewById(R.id.img_facebook);
        website = view.findViewById(R.id.img_website);
        insta = view.findViewById(R.id.img_instagram);
        gridView = view.findViewById(R.id.gridView);
        addm1 = view.findViewById(R.id.txtAddmission1);
        addm2 = view.findViewById(R.id.txtAddmission2);

        gridView.setAdapter(new ImageAdapter(this.getContext()));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getActivity(), FullScreenImage.class);
                intent.putExtra("id",i);
                startActivity(intent);
            }
        });

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.ima2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ima3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ima4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ima5, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ima7, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels,ScaleTypes.FIT);

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

        addm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUrl("http://vtpoddar.com/?p=321");
            }
        });

        addm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUrl("http://vtpoddar.com/?p=332");
            }
        });


        return view;
    }

    private void openUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

//    public void admission1(View view) {
//        openUrl("http://vtpoddar.com/?p=321");
//    }
//
//    public void admission2(View view) {
//        openUrl("http://vtpoddar.com/?p=332");
//    }
}