package com.example.college_app.ui.notice;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.college_app.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    Activity activity;
    JSONArray jsonArray;

    DatabaseHelper databaseHelper;

    public MainAdapter(Activity activity,JSONArray jsonArray){
        this.activity = activity;
        this.jsonArray = jsonArray;
    }

    public void updateArray(JSONArray jsonArray){
        this.jsonArray = jsonArray;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main,parent,false);
        databaseHelper = new DatabaseHelper(view.getContext());
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        try {
            JSONObject object = jsonArray.getJSONObject(position);
            holder.tvText.setText(object.getString("text"));
            holder.tvDate.setText(object.getString("date"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    JSONObject object = jsonArray.getJSONObject(holder.getAdapterPosition());
                    String sID = object.getString("id");
                    String sText = object.getString("text");

                    Dialog dialog = new Dialog(activity);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialog.setContentView(R.layout.dialog_main);
                    dialog.show();

                    EditText editText = dialog.findViewById(R.id.edit_text);
                    Button btUpdate = dialog.findViewById(R.id.bt_submit);

                    editText.setText(sText);
                    btUpdate.setText("Update");
                    btUpdate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String sText = editText.getText().toString().trim();

                            databaseHelper.update(sID,sText);
                            updateArray(databaseHelper.getArray());
                            notifyItemChanged(holder.getAdapterPosition());
                            dialog.dismiss();
                        }
                    });
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                int position = holder.getAdapterPosition();
                try {
                    JSONObject object = jsonArray.getJSONObject(position);
                    String sID = object.getString("id");
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                    builder.setTitle("Confirm");
                    builder.setMessage("Are you sure to delete?");
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        //@RequiresApi(api = Build.VERSION_CODES.KITKAT)
                        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            databaseHelper.delete(sID);
                            jsonArray.remove(position);

                            notifyItemRemoved(position);
                            notifyItemChanged(position,jsonArray.length());
                        }
                    });
                    builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    builder.show();
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return true;
            }
        });
    }

    @Override
    public int getItemCount() {

        return jsonArray.length();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvText,tvDate;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvText = itemView.findViewById(R.id.tv_text);
            tvDate = itemView.findViewById(R.id.tv_date);
        }
    }
}
