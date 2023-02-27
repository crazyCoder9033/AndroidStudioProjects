package com.example.spinnerwinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class NameAdapter extends BaseAdapter {
String name[];
Context context;
   NameAdapter(String[] name, Context context)
   {
        this.name=name;
        this.context=context;
   }

    @Override
    public int getCount() {
        return name.length;
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

       View v= LayoutInflater.from(context).inflate(R.layout.spinner_name,null);
        TextView txtSpinnerName=v.findViewById(R.id.txtSpinnerName);
        txtSpinnerName.setText(name[position]);
        return v;
    }
}
