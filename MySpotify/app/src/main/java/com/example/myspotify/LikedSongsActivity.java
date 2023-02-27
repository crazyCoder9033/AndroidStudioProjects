package com.example.myspotify;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myspotify.databinding.ActivityLikedSongsBinding;

public class LikedSongsActivity extends AppCompatActivity {

    ActivityLikedSongsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_liked_songs);
        binding=ActivityLikedSongsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        intents();
        song1();
        song2();
        song3();
        song4();
        song5();
        song6();
        song7();
        song8();
        song9();
        song10();
    }

    private void song10() {
        MediaPlayer mp= MediaPlayer.create(this,R.raw.blinding);
        binding.btnBlindingSong.setOnClickListener(view -> {

            if(mp.isPlaying()) {
                mp.stop();
                recreate();
            }
            else
            {
                binding.btnBlindingSong.setImageResource(R.drawable.pause);
                mp.start();
            }
        });
    }

    private void song9() {
        MediaPlayer mp= MediaPlayer.create(this,R.raw.rightnow);
        binding.btnRightNowSong.setOnClickListener(view -> {

            if(mp.isPlaying()) {
                mp.stop();
                recreate();
            }
            else
            {
                binding.btnRightNowSong.setImageResource(R.drawable.pause);
                mp.start();
            }
        });
    }

    private void song8() {
        MediaPlayer mp= MediaPlayer.create(this,R.raw.summerhigh);
        binding.btnSummerSong.setOnClickListener(view -> {

            if(mp.isPlaying()) {
                mp.stop();
                recreate();
            }
            else
            {
                binding.btnSummerSong.setImageResource(R.drawable.pause);
                mp.start();
            }
        });

    }

    private void song7() {
        MediaPlayer mp= MediaPlayer.create(this,R.raw.wonoor);
        binding.btnNoorSong.setOnClickListener(view -> {

            if(mp.isPlaying()) {
                mp.stop();
                recreate();
            }
            else
            {
                binding.btnNoorSong.setImageResource(R.drawable.pause);
                mp.start();
            }
        });
    }

    private void song6() {
        MediaPlayer mp= MediaPlayer.create(this,R.raw.congrats);
        binding.btnCongratulationSong.setOnClickListener(view -> {

            if(mp.isPlaying()) {
                mp.stop();
                recreate();
            }
            else
            {
                binding.btnCongratulationSong.setImageResource(R.drawable.pause);
                mp.start();
            }
        });
    }

    private void song5() {
        MediaPlayer mp= MediaPlayer.create(this,R.raw.daru);
        binding.btnDaruSong.setOnClickListener(view -> {

            if(mp.isPlaying()) {
                mp.stop();
                recreate();
            }
            else
            {
                binding.btnDaruSong.setImageResource(R.drawable.pause);
                mp.start();
            }
        });
    }

    private void song4() {
        MediaPlayer mp= MediaPlayer.create(this,R.raw.bazigar);
        binding.btnBaazigarSong.setOnClickListener(view -> {

            if(mp.isPlaying()) {
                mp.stop();
                recreate();
            }
            else
            {
                binding.btnBaazigarSong.setImageResource(R.drawable.pause);
                mp.start();
            }
        });
    }

    private void song3() {
        MediaPlayer mp= MediaPlayer.create(this,R.raw.discorap);
        binding.btnDiscoSong.setOnClickListener(view -> {

            if(mp.isPlaying()) {
                mp.stop();
                recreate();
            }
            else
            {
                binding.btnDiscoSong.setImageResource(R.drawable.pause);
                mp.start();
            }
        });
    }

    private void song2() {
        MediaPlayer mp= MediaPlayer.create(this,R.raw.besharamrang);
        binding.btnBesharamSong.setOnClickListener(view -> {

            if(mp.isPlaying()) {
                mp.stop();
                recreate();
            }
            else
            {
                binding.btnBesharamSong.setImageResource(R.drawable.pause);
                mp.start();
            }

        });
    }

    private void intents() {
        binding.loutHomeButton.setOnClickListener( view -> {
            Intent intentHome=new Intent(LikedSongsActivity.this,HomePageActivity.class);
            startActivity(intentHome);


        });

        binding.loutSearch.setOnClickListener( view -> {
            Intent intentSearch=new Intent(LikedSongsActivity.this,SearchPageActivity.class);
            startActivity(intentSearch);

        });

        binding.loutYourLibrary.setOnClickListener( n -> {
            Intent intentLibrary=new Intent(LikedSongsActivity.this,YourLibraryActivity.class);
            startActivity(intentLibrary);

        });



    }

    private void song1() {
        MediaPlayer mp= MediaPlayer.create(this,R.raw.playe);
        binding.btnPlayersSong.setOnClickListener(view -> {

            if(mp.isPlaying()) {
                mp.stop();
                recreate();

            }
            else
            {
                binding.btnPlayersSong.setImageResource(R.drawable.pause);
                mp.start();
            }

        });


    }


}