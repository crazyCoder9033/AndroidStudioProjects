package com.example.listkarade;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ContactAdapter extends BaseAdapter {
String name[],number[];
Context context;
    ContactAdapter(String[] name, String[] number, Context context)
    {
        this.name=name;
        this.number=number;
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

        View v= LayoutInflater.from(context).inflate(R.layout.contact_list,null);
        TextView contactTxt=v.findViewById(R.id.contactTxt);
        TextView numberTxt=v.findViewById(R.id.numberTxt);

        contactTxt.setText(name[position]);
        numberTxt.setText(number[position]);
        return v;
    }
}
