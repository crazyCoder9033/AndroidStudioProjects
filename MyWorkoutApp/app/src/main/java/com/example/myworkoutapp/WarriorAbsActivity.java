package com.example.myworkoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myworkoutapp.databinding.ActivityWarriorAbsBinding;

public class WarriorAbsActivity extends AppCompatActivity {
    ActivityWarriorAbsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_warrior_abs);
        binding=ActivityWarriorAbsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }
}