package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class ProgressBar extends AppCompatActivity {
    TextView txtView;
    Button btnDownload;
    android.widget.ProgressBar pbLoad;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        intview();

    }

    private void intview() {

        txtView = findViewById(R.id.txtView);
        btnDownload = findViewById(R.id.btnDownload);
        pbLoad = findViewById(R.id.pbLoad);

        btnDownload.setOnClickListener(this::onClick);


    }

    private void onClick(View view) {

        pbLoad.setVisibility(view.VISIBLE);

        Timer time = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                counter++;
                pbLoad.setProgress(counter);

                if (counter == 100) {
                    time.cancel();
                }

            }

        };
        time.schedule(tt, 100, 100);
    }
}

