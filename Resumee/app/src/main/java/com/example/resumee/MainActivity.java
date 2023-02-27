package com.example.resumee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtFname, edtLname, edtAddress, edtPhone, edtEmail, edt10per, edt12per, edtGradper, edt10year, edt12year, edtGradyear, edtPastJob, edtInterest;
    RadioGroup rdgFirst, rdgSecond;
    CheckBox chkSing, chkDance, chkRead, chkCycle, chkGym, chkMovie, chkCricket, chkTravel, chkC, chkCsharp, chkCplus, chkCss, chkJava, chkAndroid, chkPhp, chkHtml, chkWeb, chkKotlin;
    Button btnSubmit;
    String hobby, gender, status;
    //            Lan1, Lan2, Lan3, Lan4, Lan5, Lan6, Lan7, Lan8, Lan9, Lan10;
    StringBuilder sb = new StringBuilder();
    StringBuilder sb1 = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idbinding();
        execute();

    }


    private void idbinding() {

        edtFname = findViewById(R.id.edtFname);
        edtLname = findViewById(R.id.edtLname);
        edtAddress = findViewById(R.id.edtAddress);
        edtPhone = findViewById(R.id.edtPhone);
        edtEmail = findViewById(R.id.edtEmail);
        edt10per = findViewById(R.id.edt10per);
        edt12per = findViewById(R.id.edt12per);
        edtGradper = findViewById(R.id.edtGradper);
        edt10year = findViewById(R.id.edt10year);
        edt12year = findViewById(R.id.edt12year);
        edtGradyear = findViewById(R.id.edtGradyear);
        edtPastJob = findViewById(R.id.edtPastJob);
        edtInterest = findViewById(R.id.edtInterest);
        rdgFirst = findViewById(R.id.rdgFirst);
        rdgSecond = findViewById(R.id.rdgSecond);
        chkSing = findViewById(R.id.chkSing);
        chkDance = findViewById(R.id.chkDance);
        chkRead = findViewById(R.id.chkRead);
        chkCycle = findViewById(R.id.chkCycle);
        chkGym = findViewById(R.id.chkGym);
        chkMovie = findViewById(R.id.chkMovie);
        chkCricket = findViewById(R.id.chkCricket);
        chkTravel = findViewById(R.id.chkTravel);
        chkC = findViewById(R.id.chkC);
        chkCsharp = findViewById(R.id.chkCsharp);
        chkCplus = findViewById(R.id.chkCplus);
        chkCss = findViewById(R.id.chkCss);
        chkJava = findViewById(R.id.chkJava);
        chkAndroid = findViewById(R.id.chkAndroid);
        chkPhp = findViewById(R.id.chkPhp);
        chkHtml = findViewById(R.id.chkHtml);
        chkWeb = findViewById(R.id.chkWeb);
        chkKotlin = findViewById(R.id.chkKotlin);
        btnSubmit = findViewById(R.id.btnSubmit);
    }


    private void execute() {

        btnSubmit.setOnClickListener(view -> {

            String name = edtFname.getText().toString();
            String LastName = edtLname.getText().toString();
            String Address = edtAddress.getText().toString();
            String Phone = edtPhone.getText().toString();
            String Email = edtEmail.getText().toString();
            String Percent10 = edt10per.getText().toString();
            String Percent12 = edt12per.getText().toString();
            String PercentGrad = edtGradper.getText().toString();
            String Year10 = edt10year.getText().toString();
            String Year12 = edt12year.getText().toString();
            String YearGrad = edtGradyear.getText().toString();
            String PastJob = edtPastJob.getText().toString();
            String Interest = edtInterest.getText().toString();


//GENDER RADIO BUTTON
            int id = rdgFirst.getCheckedRadioButtonId();
            RadioButton rb = findViewById(id);
            if (id != -1) {
                gender = rb.getText().toString();

            }
//MARITAL STATUS BUTTON
            int id2 = rdgSecond.getCheckedRadioButtonId();
            RadioButton rb2 = findViewById(id2);
            if (id2 != -1) {
                status = rb2.getText().toString();
            }

//HOBBBIES  Chrck boxx
            if (chkSing.isChecked()) {
                sb.append(" " + chkSing.getText().toString());
            }

            if (chkDance.isChecked()) {
//                hobby2 = chkDance.getText().toString();
                sb.append(" " + chkDance.getText().toString());
            }

            if (chkCycle.isChecked()) {
//                hobby3 = chkCycle.getText().toString();
                sb.append(" " + chkCycle.getText().toString());
            }

            if (chkGym.isChecked()) {
//                hobby4 = chkGym.getText().toString();
                sb.append(" " + chkGym.getText().toString());
            }

            if (chkMovie.isChecked()) {
                sb.append(" " + chkMovie.getText().toString());
            }

            if (chkCricket.isChecked()) {
//                hobby6 = chkCricket.getText().toString();
                sb.append(" " + chkCricket.getText().toString());
            }

            if (chkTravel.isChecked()) {
//                hobby7 = chkTravel.getText().toString();
                sb.append(" " + chkTravel.getText().toString());
            }

            if (chkRead.isChecked()) {
//                hobby8 = chkRead.getText().toString();
                sb.append(" " + chkRead.getText().toString());
            }


//            langguages

            if (chkC.isChecked()) {
//                Lan1 = chkC.getText().toString();
                sb1.append("  " + chkC.getText().toString());
            }
            if (chkCsharp.isChecked()) {
//                Lan2 = chkCsharp.getText().toString();
                sb1.append("  " + chkCsharp.getText().toString());
            }
            if (chkCplus.isChecked()) {
//                Lan3 = chkCplus.getText().toString();
                sb1.append("  " + chkCplus.getText().toString());
            }
            if (chkCss.isChecked()) {
//                Lan4 = chkCss.getText().toString();
                sb1.append("  " + chkCss.getText().toString());
            }
            if (chkJava.isChecked()) {
//                Lan5 = chkJava.getText().toString();
                sb1.append("  " + chkJava.getText().toString());
            }
            if (chkAndroid.isChecked()) {
//                Lan6 = chkAndroid.getText().toString();
                sb1.append("  " + chkAndroid.getText().toString());
            }
            if (chkPhp.isChecked()) {
//                Lan7 = chkPhp.getText().toString();
                sb1.append("  " + chkPhp.getText().toString());
            }
            if (chkHtml.isChecked()) {
//                Lan8 = chkHtml.getText().toString();
                sb1.append("  " + chkHtml.getText().toString());
            }
            if (chkWeb.isChecked()) {
//                Lan9 = chkWeb.getText().toString();
                sb1.append("  " + chkWeb.getText().toString());
            }

            if (chkKotlin.isChecked()) {
//                Lan10 = chkKotlin.getText().toString();
                sb1.append("  " + chkKotlin.getText().toString());
            }

//            CONDITION CHECK STARTS HERE**********

            if (name.isEmpty()) {
                Toast.makeText(this, "please enter your name", Toast.LENGTH_SHORT).show();
            } else if (name.length() < 5 || name.length() > 10) {
                Toast.makeText(this, "First Name should be more than 3 letters & less than 10 letters", Toast.LENGTH_SHORT).show();
            } else if (LastName.isEmpty()) {
                Toast.makeText(this, "please enter last name", Toast.LENGTH_SHORT).show();

            } else if (LastName.length() < 5) {
                Toast.makeText(this, "Last Name should be more than 3 letters", Toast.LENGTH_SHORT).show();
            } else if (Phone.isEmpty()) {
//                Log.e("TAG", "Phone filed is empty");
                Toast.makeText(this, "Please enter phone number", Toast.LENGTH_SHORT).show();
            } else if (Phone.length() < 10) {
                Toast.makeText(this, "Phone number should be 10 digits", Toast.LENGTH_SHORT).show();
            } else if (Email.isEmpty()) {
//
                Toast.makeText(this, "Email field is empty", Toast.LENGTH_SHORT).show();
            } else if (Address.isEmpty()) {
//
                Toast.makeText(this, "Address field is empty", Toast.LENGTH_SHORT).show();
            } else if (gender == null) {
//                Log.e("TAG", "execute:Gender field is empty ");
                Toast.makeText(this, "Please select Gender", Toast.LENGTH_SHORT).show();
            } else if (status == null) {
//                Log.e("TAG", "execute:Status field is empty ");
                Toast.makeText(this, "Please select your marital status", Toast.LENGTH_SHORT).show();
            } else if (sb == null) {
//                    && hobby2 == null && hobby3 == null && hobby4 == null && hobby5 == null && hobby6 == null && hobby7 == null && hobby8 == null) {
//                Log.e("TAG", "execute: hobby field is empty ");
                Toast.makeText(this, "Please select at least one hobby", Toast.LENGTH_SHORT).show();
            } else if (Percent10.isEmpty()) {
//                Log.e("TAG", "Percent10 filed is empty");
                Toast.makeText(this, "Please Fill empty field", Toast.LENGTH_SHORT).show();
            } else if (Percent12.isEmpty()) {
//                Log.e("TAG", "Percent12 filed is empty");
                Toast.makeText(this, "Please Fill empty field", Toast.LENGTH_SHORT).show();
            } else if (PercentGrad.isEmpty()) {
//                Log.e("TAG", "PercentGrad filed is empty");
                Toast.makeText(this, "Please Fill empty field", Toast.LENGTH_SHORT).show();
            } else if (Year10.isEmpty()) {
//                Log.e("TAG", "Year10 filed is empty");
                Toast.makeText(this, "Please Fill empty field", Toast.LENGTH_SHORT).show();
            } else if (Year12.isEmpty()) {
//                Log.e("TAG", "Year12 field is empty");
                Toast.makeText(this, "Please Fill empty field", Toast.LENGTH_SHORT).show();
            } else if (YearGrad.isEmpty()) {
//                Log.e("TAG", "YearGrad filed is empty");
                Toast.makeText(this, "Please Fill empty field", Toast.LENGTH_SHORT).show();
            } else if (PastJob.isEmpty()) {
//                Log.e("TAG", "PastJob experience field is empty");
                Toast.makeText(this, "Please fill past job field", Toast.LENGTH_SHORT).show();
            } else if (Interest.isEmpty()) {
//                Log.e("TAG", "Interest field is empty");
                Toast.makeText(this, "Please fill your Interests", Toast.LENGTH_SHORT).show();
            } else if (sb1 == null) {
//             Lan2 == null && Lan3 == null && Lan4 == null && Lan5 == null && Lan6 == null && Lan7 == null && Lan9 == null && Lan10 == null) {

//                Log.e("TAG", "execute: Skill field is empty ");
                Toast.makeText(this, "Please select at least one Language", Toast.LENGTH_SHORT).show();
            } else {
                Intent i = new Intent(MainActivity.this, FinalView.class);
                i.putExtra("FirstName", name);
                i.putExtra("LastName", LastName);
                i.putExtra("Address", Address);
                i.putExtra("Phone", Phone);
                i.putExtra("Email", Email);
                i.putExtra("Percent10", Percent10);
                i.putExtra("Percent12", Percent12);
                i.putExtra("PercentGrad", PercentGrad);
                i.putExtra("Year10", Year10);
                i.putExtra("Year12", Year12);
                i.putExtra("YearGrad", YearGrad);
                i.putExtra("PastJob", PastJob);
                i.putExtra("Interest", Interest);
                i.putExtra("Hobby", "" + sb);
//                i.putExtra("Hobby2", hobby2);
//                i.putExtra("Hobby3", hobby3);
//                i.putExtra("Hobby4", hobby4);
//                i.putExtra("Hobby5", hobby5);
//                i.putExtra("Hobby6", hobby6);
//                i.putExtra("Hobby7", hobby7);
//                i.putExtra("Hobby8", hobby8);
//                i.putExtra("Hobby8", hobby8);
                i.putExtra("1", "" + sb1);
//                i.putExtra("2", Lan2);
//                i.putExtra("3", Lan3);
//                i.putExtra("4", Lan4);
//                i.putExtra("5", Lan5);
//                i.putExtra("6", Lan6);
//                i.putExtra("7", Lan7);
//                i.putExtra("8", Lan8);
//                i.putExtra("9", Lan9);
//                i.putExtra("10", Lan10);
                i.putExtra("Gender", gender);
                i.putExtra("status", status);
                startActivity(i);

            }


        });
    }
}

