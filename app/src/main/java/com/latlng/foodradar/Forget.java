package com.latlng.foodradar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Forget extends AppCompatActivity {

    TextView getBack;
    EditText eAdd;
    Button sendP;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);

        getBack=findViewById(R.id.back);
        getBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getBack  = new Intent(getApplicationContext(),Login.class);
                startActivity(getBack);
            }
        });

        eAdd=findViewById(R.id.addEmail);
        sendP=findViewById(R.id.sPass);

        sendP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EA = eAdd.getText().toString();
                String SP = eAdd.getText().toString();

                if (EA.length()==0){
                    eAdd.requestFocus();
                    eAdd.setError("Can't be empty!");
                }
                else if(!EA.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
                    eAdd.requestFocus();
                    eAdd.setError("Enter valid mail!");
                }
                else if (SP.length()==0){
                    sendP.requestFocus();
                    sendP.setError("Can't be empty!");
                }
            }
        });




    }
}
