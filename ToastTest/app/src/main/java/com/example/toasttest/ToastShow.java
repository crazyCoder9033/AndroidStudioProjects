package com.example.toasttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class ToastShow extends AppCompatActivity {
    AppCompatButton btnSubmit;
    EditText edtNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_show);

        intview();
    }

    private void intview() {
        btnSubmit=findViewById(R.id.btnSubmit);
        edtNumber=findViewById(R.id.edtNumber);

        btnSubmit.setOnClickListener(view -> {

            String s=edtNumber.getText().toString();

            Toast.makeText(this, ""+s, Toast.LENGTH_SHORT).show();

        });

    }
}