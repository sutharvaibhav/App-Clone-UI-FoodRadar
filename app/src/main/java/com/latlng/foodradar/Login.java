package com.latlng.foodradar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    EditText userMail;
    EditText pass;
    private TextView forget;
    private TextView register;
    Button login;
    Button facebook;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout
                .activity_login);

        forget = findViewById(R.id.forTv);
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Forget.class);
                startActivity(intent);
            }
        });

        register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Signup.class);
                startActivity(intent);

            }
        });

        userMail=findViewById(R.id.uEmail);
        pass=findViewById(R.id.passEt);
        login=findViewById(R.id.logIn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uMail = userMail.getText().toString();
                String Pass = pass.getText().toString();

                if(uMail.length()==0){
                    userMail.requestFocus();
                    userMail.setError("Can't be empty!");
                }
                else if(!uMail.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
                    userMail.requestFocus();
                    userMail.setError("Enter valid Mail!");
                }
                else if(Pass.length()==0){
                    pass.requestFocus();
                    pass.setError("Can't be empty!");
                }
            }
        });
    }




}