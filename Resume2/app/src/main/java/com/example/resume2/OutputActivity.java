package com.example.resume2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {

    TextView edtFullName,edtPhone,edtEmail,edtAddress,edtGender,edtStatus,edtLanguage;
    TextView txtpercent10,txtpercent12,txtpercentGrad,txtYear10,txtYear12,txtYearGrad,txtJobxp,txtSkill;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        idbind();
        display();
    }



    private void idbind() {

        edtFullName=findViewById(R.id.edtFullName);
        edtPhone=findViewById(R.id.edtPhone);
        edtEmail=findViewById(R.id.edtEmail);
        edtAddress=findViewById(R.id.edtAddress);
        edtGender=findViewById(R.id.edtGender);
        edtStatus=findViewById(R.id.edtStatus);
        edtLanguage=findViewById(R.id.edtLanguage);
        txtpercent10=findViewById(R.id.txtpercent10);
        txtpercent12=findViewById(R.id.txtpercent12);
        txtpercentGrad=findViewById(R.id.txtpercentGrad);
        txtYear10=findViewById(R.id.txtYear10);
        txtYear12=findViewById(R.id.txtYear12);
        txtYearGrad=findViewById(R.id.txtYearGrad);
        txtJobxp=findViewById(R.id.txtJobxp);
        txtSkill=findViewById(R.id.txtSkill);

    }

    private void display() {

        String FullName = getIntent().getStringExtra("FullName");
        String Address = getIntent().getStringExtra("Address");
        String Phone = getIntent().getStringExtra("Phone");
        String Email = getIntent().getStringExtra("Email");
        String Gender = getIntent().getStringExtra("Gender");
        String Status = getIntent().getStringExtra("Status");
        String Language = getIntent().getStringExtra("Languages");
        String Percent10 = getIntent().getStringExtra("Percent10");
        String Percent12 = getIntent().getStringExtra("Percent12");
        String PercentGrad = getIntent().getStringExtra("PercentGrad");
        String Year10 = getIntent().getStringExtra("Year10");
        String Year12 = getIntent().getStringExtra("Year12");
        String YearGrad = getIntent().getStringExtra("YearGrad");
        String Jobxp = getIntent().getStringExtra("Jobxp");
        String Skills = getIntent().getStringExtra("Skills");




        edtFullName.setText("Full Name:- " + FullName);
        edtPhone.setText("Phone:- " + Phone);
        edtEmail.setText("Email:- " + Email);
        edtAddress.setText("Address:- " + Address);
        edtGender.setText("Gender:- " + Gender);
        edtStatus.setText("Status:- " + Status);
        edtLanguage.setText("Language speaks:- " + Language);
        txtpercent10.setText("10th(%):- " + Percent10);
        txtpercent12.setText("12th(%):- " + Percent12);
        txtpercentGrad.setText("Graduation(%):- " + PercentGrad);
        txtYear10.setText("Passing Year(10th):- " + Year10);
        txtYear12.setText("Passing Year(12th):- " + Year12);
        txtYearGrad.setText("Passing Year(graduation):- " + YearGrad);
        txtJobxp.setText(Jobxp);
        txtSkill.setText(Skills);





    }



}