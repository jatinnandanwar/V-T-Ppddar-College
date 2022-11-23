package com.example.college_app.ui.course;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.college_app.CourseDetails;
import com.example.college_app.FacultyDetails;
import com.example.college_app.R;

import java.util.List;

public class AdapterRecyclerC extends RecyclerView.Adapter<AdapterRecyclerC.MyViewHolder> {

    Context context;
    List<LinearPojoC> mList;

    public AdapterRecyclerC(Context context, List<LinearPojoC> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.custom_recycle_listc,parent,false);
        return new  MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final LinearPojoC temp = mList.get(position);

        holder.textView.setText(mList.get(position).getCourse());
        holder.textView1.setText(mList.get(position).getCourse1());
        holder.textView2.setText(mList.get(position).getCourse2());

        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CourseDetails.class);
                intent.putExtra("course",temp.getCourse());
                intent.putExtra("course1",temp.getCourse1());
                intent.putExtra("course2",temp.getCourse2());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CourseDetails.class);
                intent.putExtra("course",temp.getCourse());
                intent.putExtra("course1",temp.getCourse1());
                intent.putExtra("course2",temp.getCourse2());
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

        CardView cardView;
        TextView textView,textView1,textView2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.course);
            textView1 = itemView.findViewById(R.id.txtcourse1);
            textView2 = itemView.findViewById(R.id.txtcourse2);
            cardView = itemView.findViewById(R.id.course_card);
        }
    }
}
