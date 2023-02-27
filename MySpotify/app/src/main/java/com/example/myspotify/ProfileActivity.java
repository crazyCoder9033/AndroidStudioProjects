package com.example.myspotify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myspotify.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {
    ActivityProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_profile);
        binding=ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.loutHomeButton.setOnClickListener( view -> {
            Intent intentHome=new Intent(ProfileActivity.this,HomePageActivity.class);
            startActivity(intentHome);

        });


        binding.loutSearch.setOnClickListener( view -> {
            Intent intentSearch=new Intent(ProfileActivity.this,SearchPageActivity.class);
            startActivity(intentSearch);

        });

        binding.loutLikedSongs.setOnClickListener( view -> {
            Intent intentLiked=new Intent(ProfileActivity.this,LikedSongsActivity.class);
            startActivity(intentLiked);

        });

        binding.loutYourLibrary.setOnClickListener( view -> {
            Intent intent=new Intent(ProfileActivity.this,YourLibraryActivity.class);
            startActivity(intent);

        });



    }
}