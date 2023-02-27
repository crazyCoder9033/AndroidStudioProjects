package com.example.form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class LOGINPAGE extends AppCompatActivity {

    AppCompatButton btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        button();
    }

    private void button() {

        btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(view->{

            Intent intent = new Intent(LOGINPAGE.this,signup.class);
            startActivity(intent);
        });
    }
}