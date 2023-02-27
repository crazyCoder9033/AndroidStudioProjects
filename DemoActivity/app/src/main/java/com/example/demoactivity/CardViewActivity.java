package com.example.demoactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

public class CardViewActivity extends AppCompatActivity {

    CardView loutApple;
    ProgressBar pgb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
//
        intview();
        onclick();
    }

    private void onclick() {


        loutApple.setOnClickListener(view -> {
            pgb.setVisibility(View.VISIBLE);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent i =new Intent(CardViewActivity.this,MainActivity.class);
                    startActivity(i);
                }
            },2000);





        });

    }

    private void intview() {
        loutApple=findViewById(R.id.loutApple);
        pgb=findViewById(R.id.pgb);


    }
}