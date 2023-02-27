package com.example.spinnerwinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class WeatherAdapter extends BaseAdapter {
   String weather[];
   Context context;

    WeatherAdapter(String[] weather, Context context)
    {
        this.weather=weather;
        this.context=context;
    }

    @Override
    public int getCount() {
        return weather.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v= LayoutInflater.from(context).inflate(R.layout.spinner_weather,null);
        TextView txtSpinnerWeather=v.findViewById(R.id.txtSpinnerWeather);
        txtSpinnerWeather.setText(weather[position]);

        return v;
    }
}
