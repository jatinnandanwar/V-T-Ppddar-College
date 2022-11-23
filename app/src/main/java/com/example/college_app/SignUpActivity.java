package com.example.college_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.college_app.ui.DBHelper;

public class SignUpActivity extends AppCompatActivity {

    TextView txtSignIn;
    Button sighup;
    EditText fullnameE,emailE,mobileE,passE,conpassE;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txtSignIn = findViewById(R.id.txtSignIn);
        sighup = findViewById(R.id.btnSignUp);
        fullnameE = findViewById(R.id.edtSignUpFullName);
        emailE = findViewById(R.id.edtSignUpEmail);
        mobileE = findViewById(R.id.edtSignUpMobile);
        passE = findViewById(R.id.edtSignUpPassword);
        conpassE = findViewById(R.id.edtSignUpConfirmPassword);

        DB = new DBHelper(this);

        txtSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        sighup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullname = fullnameE.getText().toString();
                String email = emailE.getText().toString();
                String mobile = mobileE.getText().toString();
                String pass = passE.getText().toString();
                String conpass = conpassE.getText().toString();

                boolean check =  validateinfo(fullname,email,mobile,pass,conpass);

                if (check==false){
                    //Intent intent = new Intent(SignUpActivity.this,MainActivity.class);
                    //startActivity(intent);
                    Toast.makeText(SignUpActivity.this, "Please enter all the fill", Toast.LENGTH_SHORT).show();
                }
                else{
                    Boolean checkuser = DB.checkusername(email);
                    if (checkuser==false){
                        Boolean insert = DB.insertData(fullname,email,mobile,pass);
                        //data in database then show toast message
                        if (insert == true){
                            Toast.makeText(SignUpActivity.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SignUpActivity.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }else{
                            Toast.makeText(SignUpActivity.this, "Registered failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(SignUpActivity.this, "User already exists! please sign in", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private boolean validateinfo(String fullname, String email, String mobile, String pass, String conpass) {
        if (fullname.isEmpty()){
            fullnameE.requestFocus();
            fullnameE.setError("FULLNAME CONNOT BE EMPTY");
            return false;
        }
        else if (email.isEmpty()){
            emailE.requestFocus();
            emailE.setError("EMAIL CONNOT BE EMPTY");
            return false;
        }
        else if (!email.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")){
            emailE.requestFocus();
            emailE.setError("PLEASE ENTER VALID EMAIL");
            return false;
        }
        else if (mobile.isEmpty()){
            mobileE.requestFocus();
            mobileE.setError("MOBILE NUMBER CONNOT BE EMPTY");
            return false;
        }
        else if (!mobile.matches("[0-9]{10}$")){
            mobileE.requestFocus();
            mobileE.setError("ENTER VALID MOBILE NUMBER");
            return false;
        }
        else if (pass.length()<=5){
            passE.requestFocus();
            passE.setError("MINIMUM 6 CHARACTER REQUIRED");
            return false;
        }
        else if (!pass.equals(conpass)){
            conpassE.requestFocus();
            conpassE.setError("PLEASE ENTER SAME PASSWORD");
            return false;
        }
        else {
            return true;
        }
    }
}