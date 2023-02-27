package com.example.myworkoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myworkoutapp.databinding.ActivityHomePageBinding;

public class HomePageActivity extends AppCompatActivity {
    ActivityHomePageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home_page);
        binding = ActivityHomePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        workout1();
        workoutabs();
        workoutTogether();
        workoutRewind();
        workoutExtremeHiit();
        workoutDilyBoost();

    }

    private void workoutDilyBoost() {
        binding.imgDailyBoost.setOnClickListener(view -> {
            Intent i =new Intent(HomePageActivity.this,DailyBoostActivity.class);
            startActivity(i);
        });
    }

    private void workoutExtremeHiit() {
        binding.imgExtremeHiit.setOnClickListener(view -> {
            Intent i=new Intent(HomePageActivity.this,ExtremeHiitActivity.class);
            startActivity(i);
        });
    }

    private void workoutRewind() {
        binding.imgRewind.setOnClickListener(view -> {
            Intent i=new Intent(HomePageActivity.this,RewindWorkoutActivity.class);
            startActivity(i);
        });
    }

    private void workoutTogether() {
        binding.imgTogether.setOnClickListener(view -> {
            Intent i =new Intent(HomePageActivity.this,TogetherActivity.class);
            startActivity(i);
        });

    }

    private void workoutabs() {
        binding.btnWarriorAbs.setOnClickListener(n -> {

            Intent abs = new Intent(HomePageActivity.this, WarriorAbsActivity.class);
            startActivity(abs);
        });
    }

    private void workout1() {
        binding.imgGripTraining.setOnClickListener(view -> {

            Intent i = new Intent(HomePageActivity.this, GripTrainingActivity.class);
            startActivity(i);

        });

    }
}
