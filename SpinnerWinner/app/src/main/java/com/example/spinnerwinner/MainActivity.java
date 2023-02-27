package com.example.spinnerwinner;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.spinnerwinner.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;

String week[]={"Week Spinner","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
String month[]={"Month Spinner","January","February","March","April","May","June","July","August","September","October","November","December"};
String color[]={"Color Spinner","Red","Blue","Black","Grey","Yellow","Purple"};
String name[]={"Name Spinner","Himanshu","Sanjay","Purvish","Shruti","Dikshit"};
String weather[]={"Weather Spinner","Summer","Winter","Monsoon","Autumn"};

String function[]={"Home","Search","Favourite","Quit"};
int z[]={R.drawable.home,R.drawable.search,R.drawable.heart,R.drawable.quit};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

            WeekSpinner();
            MonthSpinner();
            ColorSpinner();
            NameSpinner();
            WeatherSpinner();
            FunctionSpinner();
    }

    private void FunctionSpinner() {
        FunctionAdapter functionAdapter=new FunctionAdapter(MainActivity.this,function,z);
        binding.spinnerFunction.setAdapter(functionAdapter);

    }

    private void WeatherSpinner() {
        WeatherAdapter weatherAdapter=new WeatherAdapter(weather,MainActivity.this);
        binding.spinnerWeather.setAdapter(weatherAdapter);
    }

    private void NameSpinner() {
        NameAdapter nameAdapter=new NameAdapter(name,MainActivity.this);
        binding.spinnerName.setAdapter(nameAdapter);
    }

    private void ColorSpinner() {

        ColorsAdapater colorsAdapater=new ColorsAdapater(color,MainActivity.this);
        binding.spinnerColor.setAdapter(colorsAdapater);
    }

    private void MonthSpinner() {
        MonthAdapter monthAdapter=new MonthAdapter(month,MainActivity.this);
        binding.spinnerMonth.setAdapter(monthAdapter);

    }

    private void WeekSpinner() {

        WeekAdapter adapter=new WeekAdapter(week,MainActivity.this);
        binding.spinnerWeek.setAdapter(adapter);

    }
}