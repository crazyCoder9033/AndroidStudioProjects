package com.example.toasttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        AppCompatButton btnSubmit;
        EditText edtNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intview();

    }

    private void intview() {
        btnSubmit=findViewById(R.id.btnSubmit);
        edtNumber=findViewById(R.id.edtNumber);

        btnSubmit.setOnClickListener(view ->{

            Toast.makeText(this, "LOL", Toast.LENGTH_SHORT).show();
        });
    }

}