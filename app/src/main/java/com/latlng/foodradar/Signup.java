package com.latlng.foodradar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {

    TextView getBack;
    EditText eAdd;
    EditText uN;
    EditText pAss;
    Button sup;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getBack=findViewById(R.id.back);
        getBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(getApplicationContext(),Login.class);
                startActivity(back);
            }

        });

        eAdd=findViewById(R.id.addEmail);
        uN=findViewById(R.id.pAss);
        pAss=findViewById(R.id.cPass);
        sup=findViewById(R.id.sUp);

        sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EA = eAdd.getText().toString();
                String UN = uN.getText().toString();
                String CP = pAss.getText().toString();


                if(EA.length()==0){
                    eAdd.requestFocus();
                    eAdd.setError("Can't be empty!");
                }
                else if(!EA.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
                    eAdd.requestFocus();
                    eAdd.setError("Enter valid Mail!");
                }
                else if(UN.length()==0){
                    uN.requestFocus();
                    uN.setError("Can't be empty!");
                }
                else if(CP.length()==0){
                    pAss.requestFocus();
                    pAss.setError("Can't be empty!");
                }







            }
        });



    }
}
