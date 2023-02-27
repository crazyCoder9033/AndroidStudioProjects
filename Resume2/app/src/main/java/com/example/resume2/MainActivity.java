package com.example.resume2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtFullName,edtPhone,edtEmail,edtAddress,edt10th,edt12th,edtGrad,edtYear10th,edtYear12th,edtYearGrad,edtJobxp;
    CheckBox chkENG,chkHindi,chkMarathi,chkGujarati,chkSing,chkDance,chkGym,chkRead,chkCycle,chkMovie,chkCricket,chkTravel;
    CheckBox chkMsoffice,chkCommunication,chkTeamWork,chkProblem,chkLeader,chkTime;
    RadioGroup rdgGender,rdgStatus;
    Button btnSubmit;
    String Gender,Status;
    StringBuilder sb1=new StringBuilder();
    StringBuilder sb2=new StringBuilder();
    StringBuilder sb3=new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idbinding();
        codeExecute();
    }

    private void idbinding() {
        edtFullName=findViewById(R.id.edtFullName);
        edtPhone=findViewById(R.id.edtPhone);
        edtEmail=findViewById(R.id.edtEmail);
        edtAddress=findViewById(R.id.edtAddress);
        chkENG=findViewById(R.id.chkENG);
        chkHindi=findViewById(R.id.chkHindi);
        chkMarathi=findViewById(R.id.chkMarathi);
        chkGujarati=findViewById(R.id.chkGujarati);
        rdgGender=findViewById(R.id.rdgGender);
        rdgStatus=findViewById(R.id.rdgStatus);
        chkSing=findViewById(R.id.chkSing);
        chkDance=findViewById(R.id.chkDance);
        chkGym=findViewById(R.id.chkGym);
        chkRead=findViewById(R.id.chkRead);
        chkCycle=findViewById(R.id.chkCycle);
        chkMovie=findViewById(R.id.chkMovie);
        chkCricket=findViewById(R.id.chkCricket);
        chkTravel=findViewById(R.id.chkTravel);
        edt10th=findViewById(R.id.edt10th);
        edt12th=findViewById(R.id.edt12th);
        edtGrad=findViewById(R.id.edtGrad);
        edtYear10th=findViewById(R.id.edtYear10th);
        edtYear12th=findViewById(R.id.edtYear12th);
        edtYearGrad=findViewById(R.id.edtYearGrad);
        edtJobxp=findViewById(R.id.edtJobxp);
        chkMsoffice=findViewById(R.id.chkMsoffice);
        chkCommunication=findViewById(R.id.chkCommunication);
        chkTeamWork=findViewById(R.id.chkTeamWork);
        chkProblem=findViewById(R.id.chkProblem);
        chkLeader=findViewById(R.id.chkLeader);
        chkTime=findViewById(R.id.chkTime);
        btnSubmit=findViewById(R.id.btnSubmit);
    }

    private void codeExecute() {

        btnSubmit.setOnClickListener( view -> {

        String FullName = edtFullName.getText().toString();
        String Phone = edtPhone.getText().toString();
        String Email= edtEmail.getText().toString();
        String Address= edtAddress.getText().toString();
        String Percent10=edt10th.getText().toString();
        String Percent12=edt12th.getText().toString();
        String PercentGrad=edtGrad.getText().toString();
        String Year10=edtYear10th.getText().toString();
        String Year12=edtYear12th.getText().toString();
        String YearGrad=edtYearGrad.getText().toString();
        String Jobxp=edtJobxp.getText().toString();

//        GENDER RADIO GROUP
        int id1=rdgGender.getCheckedRadioButtonId();
        RadioButton rb= findViewById(id1);
        if(id1 != -1){
            Gender=rb.getText().toString();
        }

//MARTIAL STATUS RADIO GROUP
        int id2=rdgStatus.getCheckedRadioButtonId();
        RadioButton rb1= findViewById(id2);
        if(id2 != -1){
            Status=rb1.getText().toString();
        }

//      Languages CHECKBOX
        if(chkENG.isChecked()){
            sb1.append(" " + chkENG.getText().toString());
        }

        if(chkHindi.isChecked()){
            sb1.append(" " + chkHindi.getText().toString());
        }

        if(chkMarathi.isChecked()){
            sb1.append(" " + chkMarathi.getText().toString());
        }

        if(chkGujarati.isChecked()){
            sb1.append(" " + chkGujarati.getText().toString());
        }

//        HOBBIES CHECKBOX

        if(chkSing.isChecked()){
            sb2.append(" " + chkSing.getText().toString());
        }

        if(chkDance.isChecked()){
            sb2.append(" " + chkDance.getText().toString());
        }

        if(chkGym.isChecked()){
            sb2.append(" " + chkGym.getText().toString());
        }

        if(chkRead.isChecked()){
            sb2.append(" " + chkRead.getText().toString());
        }

        if(chkCycle.isChecked()){
            sb2.append(" " + chkCycle.getText().toString());
        }

        if(chkMovie.isChecked()){
            sb2.append(" " + chkMovie.getText().toString());
        }

        if(chkCricket.isChecked()){
            sb2.append(" " + chkCricket.getText().toString());
        }

        if(chkTravel.isChecked()){
            sb2.append(" " + chkTravel.getText().toString());
        }

//        SKILLS CHECBOX
        if(chkMsoffice.isChecked()){
            sb3.append(" " + chkMsoffice.getText().toString());
        }

        if(chkCommunication.isChecked()){
            sb3.append(" " + chkCommunication.getText().toString());
        }

        if(chkTeamWork.isChecked()){
            sb3.append(" " + chkTeamWork.getText().toString());
        }

        if(chkProblem.isChecked()){
            sb3.append(" " + chkProblem.getText().toString());
        }

        if(chkLeader.isChecked()){
            sb3.append(" " + chkLeader.getText().toString());
        }

        if(chkTime.isChecked()){
            sb3.append(" " + chkTime.getText().toString());
        }

//      CONDITION CHECKS HERE
        if(FullName.isEmpty()){
            Toast.makeText(this, "Please Enter your name", Toast.LENGTH_SHORT).show();
        }
//        else if(FullName.length()<5 || FullName.length()>10){
//            Toast.makeText(this, "Full Name should more than 5 letters", Toast.LENGTH_SHORT).show();
//        }

        else if (Phone.isEmpty()) {
            Toast.makeText(this, "Please enter phone number", Toast.LENGTH_SHORT).show();
        }
        else if (Phone.length() < 10) {
            Toast.makeText(this, "Phone number should be 10 digits", Toast.LENGTH_SHORT).show();
        }

        else if (Email.isEmpty()) {
            Toast.makeText(this, "Email field is empty", Toast.LENGTH_SHORT).show();
        }
        else if (Address.isEmpty()) {
            Toast.makeText(this, "Address field is empty", Toast.LENGTH_SHORT).show();
        }

        else if(sb1==null){
            Toast.makeText(this, "Please select at least one Language", Toast.LENGTH_SHORT).show();
        }

        else if(Gender==null){
            Toast.makeText(this, "Please select Gender", Toast.LENGTH_SHORT).show();
        }

        else if(Status==null){
            Toast.makeText(this, "Please select Marital Status", Toast.LENGTH_SHORT).show();
        }

        else if(sb2==null){
            Toast.makeText(this, "Please select at least one Hobby", Toast.LENGTH_SHORT).show();
        }

        else if (Percent10.isEmpty()) {
            Toast.makeText(this, "Please Fill 10th%", Toast.LENGTH_SHORT).show();
        }
        else if (Percent12.isEmpty()) {
            Toast.makeText(this, "Please Fill 12th%", Toast.LENGTH_SHORT).show();
        }
        else if (PercentGrad.isEmpty()) {
            Toast.makeText(this, "Please Fill Graduation %", Toast.LENGTH_SHORT).show();
        }
        else if (Year10.isEmpty()) {
            Toast.makeText(this, "Please fill passing year of 10th", Toast.LENGTH_SHORT).show();
        }
        else if (Year12.isEmpty()) {
            Toast.makeText(this, "Please fill passing year of 12th", Toast.LENGTH_SHORT).show();
        }
        else if (YearGrad.isEmpty()) {
            Toast.makeText(this, "Please fill passing year of graduation", Toast.LENGTH_SHORT).show();
        }
        else if (Jobxp.isEmpty()) {
            Toast.makeText(this, "Please fill past job field", Toast.LENGTH_SHORT).show();
        }

        else if(sb3==null){
            Toast.makeText(this, "Please select at least one skill", Toast.LENGTH_SHORT).show();
        }
        else{

            Intent i=new Intent(this,OutputActivity.class);
            i.putExtra("FullName",FullName);
            i.putExtra("Phone",Phone);
            i.putExtra("Email",Email);
            i.putExtra("Address",Address);
            i.putExtra("Percent10", Percent10);
            i.putExtra("Percent12", Percent12);
            i.putExtra("PercentGrad", PercentGrad);
            i.putExtra("Year10", Year10);
            i.putExtra("Year12", Year12);
            i.putExtra("YearGrad", YearGrad);
            i.putExtra("Jobxp", Jobxp);
            i.putExtra("Gender",Gender);
            i.putExtra("Status",Status);
            i.putExtra("Languages",""+sb1);
            i.putExtra("Hobbies",""+sb2);
            i.putExtra("Skills",""+sb3);


            AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Application Message");
            builder.setMessage("Are you sure want to submit");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "processing", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder1= new AlertDialog.Builder(MainActivity.this);
                    builder1.setTitle("ALERT");
                    builder1.setMessage("Click OK to continue");
                    builder1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(i);
                        }
                    });
                    builder1.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "Okay stepping back", Toast.LENGTH_SHORT).show();
                        }
                    });
                    builder1.setCancelable(false);
                    builder1.show();

                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Exiting", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setCancelable(false);
            builder.show();
        }

        });

    }


}