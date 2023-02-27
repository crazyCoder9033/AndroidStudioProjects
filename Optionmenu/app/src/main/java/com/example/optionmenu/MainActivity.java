package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.optionmenu.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ArrayList list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);


        ArrayList list =new ArrayList();

        list.add("Himanshu");
        list.add("Sanjay");
        list.add("Shruti");
        list.add("VenC");


       for(int i=0;i<4;i++)
       {
           Log.e("TAG", "onCreate: "+list.get(i));
       }





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.homemenu, menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();

        switch (id)
        {
            case R.id.btnhome:
                Toast.makeText(this, "HOME", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i);
                break;

            case R.id.btnsetting:
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnaboutus:
                Toast.makeText(this, "About us", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnreport:
                Toast.makeText(this, "Report", Toast.LENGTH_SHORT).show();
                break;

            default:

        }

        return true;

    }
}