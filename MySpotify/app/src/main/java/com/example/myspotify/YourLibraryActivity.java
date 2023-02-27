package com.example.myspotify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myspotify.databinding.ActivityYourLibraryBinding;

public class YourLibraryActivity extends AppCompatActivity {

    ActivityYourLibraryBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_your_library);
        binding=ActivityYourLibraryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.loutHomeButton.setOnClickListener( view -> {
            Intent intentHome=new Intent(YourLibraryActivity.this,HomePageActivity.class);
            startActivity(intentHome);
            finish();
        });

        binding.loutSearch.setOnClickListener( view -> {
            Intent intentSearch=new Intent(YourLibraryActivity.this,SearchPageActivity.class);
            startActivity(intentSearch);
            finish();
        });

        binding.loutLikedSongs.setOnClickListener( view -> {
            Intent intentliked=new Intent( YourLibraryActivity.this,LikedSongsActivity.class);
            startActivity(intentliked);
            finish();
        });

        binding.loutProfile.setOnClickListener(q ->{
            Intent a=new Intent(YourLibraryActivity.this,ProfileActivity.class);
            startActivity(a);
            finish();
        });
    }
}