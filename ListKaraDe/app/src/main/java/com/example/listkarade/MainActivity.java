package com.example.listkarade;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.listkarade.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
        ListView list;
    String[] country={"India","Australia","England","New Zealand","South Africa","China","Canada","Japan","Netherlands","France","Hungary","Ireland","Germany","Qatar","Switzerland","Yemen","Kazakhstan","Finland"};
    int pic[]={R.drawable.india,R.drawable.australia,R.drawable.unitedkingdom,R.drawable.newzealand,R.drawable.southafrica,R.drawable.china,R.drawable.canada,R.drawable.japan,R.drawable.netherlands,R.drawable.france,R.drawable.hungary,R.drawable.ireland,R.drawable.germany,R.drawable.qatar,R.drawable.switzerland,R.drawable.yemen,R.drawable.kazakhstan,R.drawable.finland};
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        DEfault LIst view

//        ArrayAdapter array = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,months);
//            binding.list.setAdapter(array);
        list=findViewById(R.id.list);
        intview();
    }

    private void intview() {

        CustomListAdapter customListAdapter=new CustomListAdapter(country,pic,MainActivity.this);

        binding.list.setAdapter(customListAdapter);

           list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                   if(position==0)
                   {
                       Toast.makeText(MainActivity.this, "India", Toast.LENGTH_SHORT).show();
                   }

                   else if(position==1)
                   {
                       Toast.makeText(MainActivity.this, "Australia", Toast.LENGTH_SHORT).show();
                   }
               }
           });

    }
}