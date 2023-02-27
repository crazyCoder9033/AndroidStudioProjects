package com.example.myinstagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.myinstagram.databinding.ActivityHomePageBinding;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {
ActivityHomePageBinding binding;
ArrayList<HorizontalModelClass> horizontal=new ArrayList<>();
ArrayList<String> name= new ArrayList<>();
ArrayList<Integer> pic =new ArrayList<>();


ArrayList<VerticalModelClass> vertical = new ArrayList<>();
ArrayList<String> name2 =new ArrayList<>();
ArrayList<Integer> pic2=new ArrayList<>();
ArrayList<Integer> pic3=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home_page);
        binding=ActivityHomePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        storiesclass();
        contentclass();
    }

    private void contentclass() {
        contentset();

        ContentInterfaceClass contentInterfaceClass=new ContentInterfaceClass() {
            @Override
            public void setdata(String name, int pic,int pic2) {
                Intent i =new Intent(HomePageActivity.this,DisplayDataActivity.class);

                i.putExtra("name",name);
                i.putExtra("pic",pic);
                i.putExtra("pic2",pic2);

                startActivity(i);

            }
        };


        for(int i=0;i<name2.size();i++)
        {
            VerticalModelClass verticalModelClass=new VerticalModelClass();
            verticalModelClass.setName(name2.get(i));
            verticalModelClass.setPic(pic2.get(i));
            verticalModelClass.setPic2(pic3.get(i));
            vertical.add(verticalModelClass);


            VerticalAdapterClass verticalAdapterClass=new VerticalAdapterClass(vertical,contentInterfaceClass);

            LinearLayoutManager manager2=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);

            binding.rcvContent.setLayoutManager(manager2);
            binding.rcvContent.setAdapter(verticalAdapterClass);

        }

    }

    private void contentset() {
        name2.add("julia_smiles");
        name2.add("robert_jr");
        name2.add("tom_latham");
        name2.add("jack_dan");

        pic2.add(R.drawable.one);
        pic2.add(R.drawable.two);
        pic2.add(R.drawable.three);
        pic2.add(R.drawable.four);

        pic3.add(R.drawable.a);
        pic3.add(R.drawable.a);
        pic3.add(R.drawable.a);
        pic3.add(R.drawable.a);
    }

    private void storiesclass() {
        settingdata();

        for(int i=0;i<name.size();i++)
        {
            HorizontalModelClass horizontalModelClass=new HorizontalModelClass();
            horizontalModelClass.setName(name.get(i));
            horizontalModelClass.setPic(pic.get(i));
            horizontal.add(horizontalModelClass);



            HorizontalAdapterClass horizontalAdapterClass=new HorizontalAdapterClass(horizontal);

            LinearLayoutManager manager=new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
            binding.rcvStories.setLayoutManager(manager);
            binding.rcvStories.setAdapter(horizontalAdapterClass);

        }


    }

    private void settingdata() {
        name.add("Your Story");
        name.add("julia_smiles");
        name.add("robert_jr");
        name.add("tom_latham");
        name.add("jack_dan");
        name.add("julia_smiles");
        name.add("robert_jr");
        name.add("tom_latham");
        name.add("jack_dan");

        pic.add(R.drawable.three);
        pic.add(R.drawable.one);
        pic.add(R.drawable.two);
        pic.add(R.drawable.three);
        pic.add(R.drawable.four);
        pic.add(R.drawable.one);
        pic.add(R.drawable.two);
        pic.add(R.drawable.three);
        pic.add(R.drawable.four);
    }
}