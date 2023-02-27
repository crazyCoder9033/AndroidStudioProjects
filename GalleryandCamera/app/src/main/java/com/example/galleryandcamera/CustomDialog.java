package com.example.galleryandcamera;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;

import com.example.galleryandcamera.databinding.ActivityCustomDialogBinding;

public class CustomDialog extends AppCompatActivity {
ActivityCustomDialogBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_custom_dialog);
        binding=ActivityCustomDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }
}