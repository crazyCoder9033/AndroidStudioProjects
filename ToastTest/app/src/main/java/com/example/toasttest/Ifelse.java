package com.example.toasttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class Ifelse extends AppCompatActivity {

    AppCompatButton btnSubmit;
    EditText edtNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifelse);

        intview();
    }

    private void intview() {

        btnSubmit=findViewById(R.id.btnSubmit);
        edtNumber=findViewById(R.id.edtNumber);

        btnSubmit.setOnClickListener(view -> {

            String a=edtNumber.getText().toString();
            int b= Integer.parseInt(a);

            if(b<=18)
            {
                Toast.makeText(this, "You are not Eligible to vote", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "Youre are Eligible to vote", Toast.LENGTH_SHORT).show();
            }
        });
    }
}