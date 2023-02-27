package com.example.spinnerwinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class WeekAdapter extends BaseAdapter {

String week[];
Context context;

        WeekAdapter(String[] week, Context context)
        {
            this.week=week;
            this.context=context;
        }


    @Override
    public int getCount() {
        return week.length;
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


        View v=LayoutInflater.from(context).inflate(R.layout.spinner_file,null);
        TextView txtSpinner=v.findViewById(R.id.txtSpinner);
        txtSpinner.setText(week[position]);
        return v;
    }
}
