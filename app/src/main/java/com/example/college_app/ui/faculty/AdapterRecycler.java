package com.example.college_app.ui.faculty;

import android.content.Context;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.college_app.FacultyDetails;
import com.example.college_app.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.MyViewHolder> {

    Context context;
    List<LinearPojo> mList;

    public AdapterRecycler(Context context, List<LinearPojo> mList) {
        this.context = context;
        this.mList = mList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.custom_recycle_list,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final LinearPojo temp = mList.get(position);

        holder.imageView.setImageResource(mList.get(position).getImg());
        holder.textView.setText(mList.get(position).getName());
        holder.textView2.setText(mList.get(position).getAge());
        holder.textView3.setText(mList.get(position).getDes());
        holder.textView4.setText(mList.get(position).getDet());

        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FacultyDetails.class);
                intent.putExtra("image",temp.getImg());
                intent.putExtra("name",temp.getName());
                intent.putExtra("desc",temp.getDes());
                intent.putExtra("quali",temp.getAge());
                intent.putExtra("details",temp.getDet());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FacultyDetails.class);
                intent.putExtra("image",temp.getImg());
                intent.putExtra("name",temp.getName());
                intent.putExtra("desc",temp.getDes());
                intent.putExtra("quali",temp.getAge());
                intent.putExtra("details",temp.getDet());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

        holder.textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FacultyDetails.class);
                intent.putExtra("image",temp.getImg());
                intent.putExtra("name",temp.getName());
                intent.putExtra("desc",temp.getDes());
                intent.putExtra("quali",temp.getAge());
                intent.putExtra("details",temp.getDet());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView,textView2,textView3,textView4;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.rec_img1);
            textView = itemView.findViewById(R.id.rec_name);
            textView2 = itemView.findViewById(R.id.rec_ade);
            textView3= itemView.findViewById(R.id.rec_des);
            textView4= itemView.findViewById(R.id.rec_det);

        }
    }

}
