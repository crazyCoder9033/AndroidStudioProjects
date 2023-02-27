package com.example.spinnerwinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorsAdapater extends BaseAdapter {
String color[];
Context context;

    ColorsAdapater(String[] color, Context context)
    {
        this.color=color;
        this.context=context;
    }

    @Override
    public int getCount() {
        return color.length;
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


        View v= LayoutInflater.from(context).inflate(R.layout.spinner_color,null);
        TextView txtSpinnerColor=v.findViewById(R.id.txtSpinnerColor);
        txtSpinnerColor.setText(color[position]);



        return v;
    }
}
