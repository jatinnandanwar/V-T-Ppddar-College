package com.example.college_app.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.college_app.R;

import java.util.List;

public class AdapterRecHol extends RecyclerView.Adapter<AdapterRecHol.MyHolder> {

    Context context;
    List<LinearPojoHol> mList;

    public AdapterRecHol(Context context, List<LinearPojoHol> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.custom_recycle_holiday,parent,false);

        MyHolder myHolder = new MyHolder(view);

        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.textView1.setText(mList.get(position).getHoldate());
        holder.textView2.setText(mList.get(position).getHolday());
        holder.textView3.setText(mList.get(position).getHolevent());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView textView1,textView2,textView3;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.hol_date);
            textView2 = itemView.findViewById(R.id.hol_day);
            textView3= itemView.findViewById(R.id.hol_event);
        }
    }
}
