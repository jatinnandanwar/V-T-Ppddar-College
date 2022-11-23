package com.example.college_app.ui.about;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.college_app.R;
import com.example.college_app.ui.home.HomeFragment;

public class ImageAdapter extends BaseAdapter {
    
    private Context context;
    
    public int[] imageArray = {
            R.drawable.ima2,R.drawable.ima3,R.drawable.ima4,
            R.drawable.ima5,R.drawable.icon,R.drawable.ima7,
            R.drawable.ima3,R.drawable.ima4,R.drawable.ima2
    };

    public ImageAdapter(Context context) {
        this.context = context;
    }



    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imageArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imageView = new ImageView(context);
        imageView.setImageResource(imageArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,350));
        
        return imageView;
    }
}
