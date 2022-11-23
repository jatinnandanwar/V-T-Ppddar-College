package com.example.college_app.ui.notice;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import com.example.college_app.MainActivity;
import com.example.college_app.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class NoticeFragment extends Fragment {

    RecyclerView recyclerView;
    FloatingActionButton btAdd;

    DatabaseHelper databaseHelper;
    MainAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notice, container, false);

        recyclerView = view.findViewById(R.id.recycle_view);
        btAdd = view.findViewById(R.id.bt_add);

        databaseHelper = new DatabaseHelper(getActivity());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MainAdapter(getActivity(),databaseHelper.getArray());
        recyclerView.setAdapter(adapter);

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(getActivity());
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setContentView(R.layout.dialog_main);
                dialog.show();

                EditText editText = dialog.findViewById(R.id.edit_text);
                Button btSubmit = dialog.findViewById(R.id.bt_submit);

                btSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String sText = editText.getText().toString().trim();
                        String sDate = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(new Date());
                        databaseHelper.insert(sText,sDate);
                        adapter.updateArray(databaseHelper.getArray());
                        dialog.dismiss();
                    }
                });
            }
        });

        btAdd.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Confirm");
                builder.setMessage("Are you sure to delete all?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        databaseHelper.truncate();
                        adapter.updateArray(databaseHelper.getArray());
                        recyclerView.setAdapter(adapter);
                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                builder.show();
                return true;
            }
        });

        return view;
    }

}