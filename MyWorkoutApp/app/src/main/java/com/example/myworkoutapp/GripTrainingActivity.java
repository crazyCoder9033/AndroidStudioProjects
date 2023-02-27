package com.example.myworkoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myworkoutapp.databinding.ActivityGripTrainingBinding;

public class GripTrainingActivity extends AppCompatActivity {
        ActivityGripTrainingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_grip_training);
        binding=ActivityGripTrainingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}