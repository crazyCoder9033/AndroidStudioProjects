package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RelativeRegist extends AppCompatActivity {

    CheckBox chkSinging,chkDancing,chkReading;
    RadioGroup rdg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_regist);

        intview();
    }

    void intview() {

        Button btnSubmit = findViewById(R.id.btnSubmit);
        EditText edtName = findViewById(R.id.edtName);
        EditText txtEmail = findViewById(R.id.txtEmail);
        EditText edtpass = findViewById(R.id.edtpass);
        EditText edtconfirmpass = findViewById(R.id.edtconfirmpass);
        EditText txtAddress = findViewById(R.id.txtAddress);
         chkSinging = findViewById(R.id.chkSinging);
         chkDancing = findViewById(R.id.chkDancing);
         chkReading = findViewById(R.id.chkReading);
         rdg =findViewById(R.id.rdg);

        rdg.setOnCheckedChangeListener((radiogroup,i) -> {
            RadioButton rb=findViewById(i);
            Log.e("TAGrb", "direct gender: "+rb.getText() );
        });

        btnSubmit.setOnClickListener(v -> {

            String name = edtName.getText().toString();
            String email = txtEmail.getText().toString();
            String password = edtpass.getText().toString();
            String confrim = edtconfirmpass.getText().toString();
            String address = txtAddress.getText().toString();

            boolean a= chkSinging.isChecked();
            boolean b= chkDancing.isChecked();
            boolean c= chkReading.isChecked();


            Log.e("TAG123", "Button is clicked");
            Log.e("TAG123", "FULL NAME:" + name);
            Log.e("TAG123", "EMAIL:" + email);
            Log.e("TAG123", "Password:" + password);
            Log.e("TAG123", "Confrim password:" + confrim);
            Log.e("TAG123", "Address:" + address);

            if(a)
            {
                Log.e("TAG", " your hobby is  " +chkSinging.getText());
            }

            if(b)
            {
                Log.e("TAG", " your hobby is  " +chkDancing.getText());
            }

            if(c)
            {
                Log.e("TAG", " your hobby is " +chkReading.getText());
            }

            int selectid=rdg.getCheckedRadioButtonId();
            RadioButton rb=findViewById(selectid);

            Log.e("TAG", "GENDER " +rb.getText() );


        });

        Button btncancel = findViewById(R.id.btncancel);

        btncancel.setOnClickListener( b -> {

            Log.e("TAG", "cancel button is clicked: ");
        });
    }
}