package com.example.customdilogactivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.customdilogactivity.databinding.ActivityMainBinding;
import com.example.customdilogactivity.databinding.CustomDialog2Binding;
import com.example.customdilogactivity.databinding.CustomDialog3Binding;
import com.example.customdilogactivity.databinding.CustomDialog4Binding;
import com.example.customdilogactivity.databinding.CustomDialog5Binding;
import com.example.customdilogactivity.databinding.Customdialog1Binding;

public class MainActivity extends AppCompatActivity {

 ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
         customButton1();
         customButton2();
         customButton3();
         customButton4();
         customButton5();

    }

    private void customButton5() {
        binding.btn5.setOnClickListener(view ->{

            Dialog dialog=new Dialog(MainActivity.this);
            CustomDialog5Binding binding= CustomDialog5Binding.inflate(getLayoutInflater());
            dialog.setContentView(binding.getRoot());

            binding.btnSubmit.setOnClickListener( n -> {
                Toast.makeText(this, "PAID SUCCESSFUL", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });

            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            dialog.show();
        });

    }

    private void customButton4() {
        binding.btn4.setOnClickListener( view ->{

            Dialog dialog=new Dialog(MainActivity.this);
            CustomDialog4Binding binding=CustomDialog4Binding.inflate(getLayoutInflater());
            dialog.setContentView(binding.getRoot());

            binding.btnPay.setOnClickListener( m -> {
                Toast.makeText(this, "PAID", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });

            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            dialog.show();
        });

    }

    private void customButton3() {
        binding.btn3.setOnClickListener(view -> {


        Dialog dialog=new Dialog(MainActivity.this);

        CustomDialog3Binding binding=CustomDialog3Binding.inflate(getLayoutInflater());
        dialog.setContentView(binding.getRoot());

        binding.btnYes.setOnClickListener( m -> {
            Toast.makeText(this, "you have choose YES", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });

        binding.btnNo.setOnClickListener( n -> {
            Toast.makeText(this, "You have choose NO", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            dialog.show();
        });
    }

    private void customButton2() {
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.wrong);
        binding.btn2.setOnClickListener( view -> {
            Dialog dialog=new Dialog(MainActivity.this);
            mp.start();

            CustomDialog2Binding binding=CustomDialog2Binding.inflate(getLayoutInflater());
            dialog.setContentView(binding.getRoot());

            binding.btnCorrect.setOnClickListener( a -> {
                Toast.makeText(this, "CORRECT", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });
            binding.btnWrong.setOnClickListener(b -> {
                Toast.makeText(this, "WRONG", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });

            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            dialog.show();
        });

    }

    private void customButton1() {
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.yay);
        binding.btn1.setOnClickListener(view -> {
            mp.start();
            Dialog dialog=new Dialog(MainActivity.this);
//ATTACHING XML FILE HERE JUST LIKE DID ABOVE"NEW METHOD BIND ID"

            Customdialog1Binding binding=Customdialog1Binding.inflate(getLayoutInflater());
            dialog.setContentView(binding.getRoot());

            binding.btnYAY.setOnClickListener( h -> {
                Toast.makeText(this, "YAYYYYYYY", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });

            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            dialog.show();
        });
    }
}