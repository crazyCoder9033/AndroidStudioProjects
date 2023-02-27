package com.example.myspotify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myspotify.databinding.ActivitySearchPageBinding;

public class SearchPageActivity extends AppCompatActivity {
    ActivitySearchPageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_search_page);
        binding=ActivitySearchPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.loutHomeButton.setOnClickListener(view -> {
            Intent intentHome=new Intent(SearchPageActivity.this,HomePageActivity.class);
            startActivity(intentHome);

        });

        binding.loutLikedSongs.setOnClickListener( view -> {
            Intent intentLikedSongs=new Intent(SearchPageActivity.this,LikedSongsActivity.class);
            startActivity(intentLikedSongs);
        });

        binding.loutYourLibrary.setOnClickListener( n -> {
            Intent intentLibrary=new Intent(SearchPageActivity.this,YourLibraryActivity.class);
            startActivity(intentLibrary);

        });

        binding.loutProfile.setOnClickListener( a -> {
            Intent i=new Intent(SearchPageActivity.this,ProfileActivity.class);
            startActivity(i);

        });

    }
}