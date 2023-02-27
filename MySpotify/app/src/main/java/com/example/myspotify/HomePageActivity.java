package com.example.myspotify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myspotify.databinding.ActivityHomePageBinding;

public class HomePageActivity extends AppCompatActivity {

    ActivityHomePageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//

        binding=ActivityHomePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.loutSearch.setOnClickListener( view -> {
            Intent intentSearch=new Intent(HomePageActivity.this,SearchPageActivity.class);
            startActivity(intentSearch);

        });

        binding.loutLikedSongs.setOnClickListener( view -> {
            Intent intentliked=new Intent( HomePageActivity.this,LikedSongsActivity.class);
            startActivity(intentliked);

        });

        binding.loutYourLibrary.setOnClickListener( n -> {
            Intent intentLibrary=new Intent(HomePageActivity.this,YourLibraryActivity.class);
            startActivity(intentLibrary);

        });


    }
}