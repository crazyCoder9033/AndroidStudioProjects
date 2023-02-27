package com.example.spinnerwinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MonthAdapter extends BaseAdapter {
String month[];
Context context;
   MonthAdapter(String[] month, Context context)
   {
       this.month=month;
       this.context=context;
   }

    @Override
    public int getCount() {
        return month.length;
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

       View v= LayoutInflater.from(context).inflate(R.layout.spinner_month,null);
        TextView txtSpinnerMonth=v.findViewById(R.id.txtSpinnerMonth);
        txtSpinnerMonth.setText(month[position]);

        return v;
    }
}
