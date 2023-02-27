package com.example.arraylistmodelclass.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.arraylistmodelclass.R;
import com.example.arraylistmodelclass.adapter.StudentAdapter;
import com.example.arraylistmodelclass.databinding.ActivityMainBinding;
import com.example.arraylistmodelclass.modelclass.StudentDetailsModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ActivityMainBinding binding;

        ArrayList<StudentDetailsModelClass> data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
            records();
    }

    private void records() {
        StudentDetailsModelClass s1=new StudentDetailsModelClass();
        s1.setName("Himanshu");
        s1.setFname("Ramchandra");
        s1.setId(001);
        s1.setFees(75000);
        s1.setCity("Surat");
        data.add(s1);


        StudentDetailsModelClass s2=new StudentDetailsModelClass();
        s2.setName("Shruti");
        s2.setFname("Shivlal Bhai");
        s2.setId(002);
        s2.setFees(75000);
        s2.setCity("Surat");
        data.add(s2);

        StudentDetailsModelClass s3=new StudentDetailsModelClass();
        s3.setName("Akshay");
        s3.setFname("FDFASD");
        s3.setId(003);
        s3.setFees(85000);
        s3.setCity("Surat");
        data.add(s3);


        StudentDetailsModelClass s4=new StudentDetailsModelClass();
        s4.setName("raj");
        s4.setFname("FDFASD");
        s4.setId(003);
        s4.setFees(85000);
        s4.setCity("Surat");
        data.add(s4);

        StudentDetailsModelClass s5=new StudentDetailsModelClass();
        s5.setName("Dikshit");
        s5.setFname("FDFASD");
        s5.setId(003);
        s5.setFees(85000);
        s5.setCity("Surat");
        data.add(s5);

        StudentDetailsModelClass s6=new StudentDetailsModelClass();
        s6.setName("Purvish");
        s6.setFname("FDFASD");
        s6.setId(003);
        s6.setFees(85000);
        s6.setCity("Surat");
        data.add(s6);


        StudentDetailsModelClass s7=new StudentDetailsModelClass();
        s7.setName("Sanjay");
        s7.setFname("FDFASD");
        s7.setId(003);
        s7.setFees(85000);
        s7.setCity("Surat");
        data.add(s7);



        StudentAdapter adapter=new StudentAdapter(data,this);
        binding.listView.setAdapter(adapter);

    }
}