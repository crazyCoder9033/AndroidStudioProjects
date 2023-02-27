package com.example.listkarade;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listkarade.databinding.ActivityContactListBinding;

public class ContactListActivity extends AppCompatActivity {
ActivityContactListBinding binding;

String name[]={"Abhishek","Bobby","Chandu","Dhawal","Esha","Farhan","Gotu","Himanshu","Isha","Jatin","Kamal","Lovely","Mahesh","Naveen","Oyo","Purvish","Sanjay","Tannu"};
   String number[]={"24324545","24324545","24324545","24324545","24324545","24324545","24324545","24324545","24324545","24324545","24324545","24324545","24324545","24324545","24324545","24324545","24324545","24324545","24324545"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_contact_list);
        binding=ActivityContactListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        contactlist();
    }

    private void contactlist() {
        ContactAdapter contactAdapter=new ContactAdapter(name, number,this);

        binding.listContact.setAdapter(contactAdapter);

    }

}