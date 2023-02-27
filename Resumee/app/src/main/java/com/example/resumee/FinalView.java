package com.example.resumee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class FinalView extends AppCompatActivity {

    TextView txtFname, txtLname, txtGender, txtHobby, txtStatus;
    //            txtHobby2, txtHobby3, txtHobby4, txtHobby5, txtHobby6, txtHobby7, txtHobby8,
    TextView txt10marks, txt12marks, txtGradMarks, txt10year, txt12year, txtGradYear, txtPastjob, txtInterst;
    TextView txtC;
    //            txtCplus, Csharp, txtCss, txtJava, txtAndroid, txtPhp, txtHtml, txtWeb, txtKotlin;
    TextView txtPhone, txtEmail, txtAddress;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_view);

        idbind();
        passingAll();


    }









    private void idbind() {

        txtFname = findViewById(R.id.txtFname);
        txtLname = findViewById(R.id.txtLname);
        txtPhone = findViewById(R.id.txtPhone);
        txtEmail = findViewById(R.id.txtEmail);
        txtAddress = findViewById(R.id.txtAddress);
        txtGender = findViewById(R.id.txtGender);
        txtHobby = findViewById(R.id.txtHobby);

        txtStatus = findViewById(R.id.txtStatus);
        txt10marks = findViewById(R.id.txt10marks);
        txt12marks = findViewById(R.id.txt12marks);
        txtGradMarks = findViewById(R.id.txtGradMarks);
        txt12year = findViewById(R.id.txt12year);
        txt10year = findViewById(R.id.txt10year);
        txtGradYear = findViewById(R.id.txtGradYear);
        txtPastjob = findViewById(R.id.txtPastjob);
        txtInterst = findViewById(R.id.txtInterst);
        txtC = findViewById(R.id.txtC);
        imgView = findViewById(R.id.imgView);
//
    }

    private void passingAll() {


        String name = getIntent().getStringExtra("FirstName");
        String Lastname = getIntent().getStringExtra("LastName");
        String Address = getIntent().getStringExtra("Address");
        String Phone = getIntent().getStringExtra("Phone");
        String Email = getIntent().getStringExtra("Email");
        String Gender = getIntent().getStringExtra("Gender");
        String Hobby = getIntent().getStringExtra("Hobby");
//
        String status = getIntent().getStringExtra("status");
        String Percent10 = getIntent().getStringExtra("Percent10");
        String Percent12 = getIntent().getStringExtra("Percent12");
        String PercentGrad = getIntent().getStringExtra("PercentGrad");
        String Year10 = getIntent().getStringExtra("Year10");
        String Year12 = getIntent().getStringExtra("Year12");
        String YearGrad = getIntent().getStringExtra("YearGrad");
        String PastJob = getIntent().getStringExtra("PastJob");
        String Interest = getIntent().getStringExtra("Interest");
        String Lan1 = getIntent().getStringExtra("1");
//


        txtFname.setText("◘ First name:- " + name);
        txtLname.setText("◘ Last name:- " + Lastname);
        txtEmail.setText("◘ Email:- " + Email);
        txtAddress.setText("◘ Address:- " + Address);
        txtPhone.setText("◘ Phone number:- " + Phone);
        txtGender.setText("◘ Gender:- " + Gender);
        txtStatus.setText("◘ Marital status:- " + status);
        txtHobby.setText("◘ HOBBIES:- " + Hobby);
//
        txt10marks.setText("• 10th Percent:- " + Percent10);
        txt12marks.setText("• 12th Percent:- " + Percent12);
        txtGradMarks.setText("• Graduation Percent:- " + PercentGrad);
        txt10year.setText("• Passing Year(10th):- " + Year10);
        txt12year.setText("• Passing Year(12th):- " + Year12);
        txtGradYear.setText("• Passing Year(Graduation):- " + YearGrad);
        txtPastjob.setText("◘ Experience:- " + PastJob);
        txtC.setText("◘ Languages known:- " + Lan1);
        txtInterst.setText("◘ Interests:- " + Interest);

        Glide.with(FinalView.this).load("https://i.picsum.photos/id/933/200/200.jpg?hmac=OW5v0bUFqC97kOeYWLjXhU-5mkb6atERs7CrqdPlRfs").into(imgView);
//
    }
}
