package com.example.form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SeekBar extends AppCompatActivity {

    TextView txtView,txtAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);


        intview();
    }

    private void intview() {

        txtView=findViewById(R.id.txtView);

        txtAge=findViewById(R.id.txtAge);

        android.widget.SeekBar sbBar=findViewById(R.id.sbBar);

        sbBar.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
                txtAge.setText("AGE "+i);
            }

            @Override
            public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(android.widget.SeekBar seekBar) {

            }
        });



    }
}