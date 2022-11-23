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

public class LoginActivity extends AppCompatActivity {

    TextView txtSignUp;
    Button signin;
    EditText emailE,passE;
    DBHelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtSignUp = findViewById(R.id.txtSignUp);
        signin = findViewById(R.id.btnSignIn);
        emailE = findViewById(R.id.edtSignInEmail);
        passE = findViewById(R.id.edtSignInPassword);

        DB = new DBHelper(this);

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String email = emailE.getText().toString();
                String pass = passE.getText().toString();

                boolean check =  validateinfo(email,pass);

                if (check==true){
//                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                    startActivity(intent);
//                    finish();
                    Boolean chechuserpass = DB.checkusernamepassword(email,pass);
                    //user exists or not
                    if (chechuserpass==true){
                        Toast.makeText(LoginActivity.this, "Sign in successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                    else{
                        Toast.makeText(LoginActivity.this, "invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

    private Boolean validateinfo(String email, String pass) {
        if (email.isEmpty()){
            emailE.requestFocus();
            emailE.setError("FIELD CANNOT BE EMPTY");
            return false;
        }
        else if (!email.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")){
            emailE.requestFocus();
            emailE.setError("ENTER VALID EMAIL");
            return false;
        }
        else if (pass.length()<=5){
            passE.requestFocus();
            passE.setError("MINIMUM 6 CHARACTER REQUIRED");
            return false;
        }
        else {
            return true;
        }
    }
}
