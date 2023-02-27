package com.example.spinnerwinner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FunctionAdapter extends BaseAdapter {

String[] function;
int[] z;
MainActivity mainActivity;
     FunctionAdapter(MainActivity mainActivity, String[] function, int[] z) {
         this.function=function;
         this.z=z;
         this.mainActivity=mainActivity;
    }

    @Override
    public int getCount() {
        return z.length;

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

        View v= LayoutInflater.from(mainActivity).inflate(R.layout.spinner_function,null);

        TextView txtSpinnerFunction=v.findViewById(R.id.txtSpinnerFunction);
        ImageView imgIcon=v.findViewById(R.id.imgIcon);

        txtSpinnerFunction.setText(function[position]);
        imgIcon.setImageResource(z[position]);

         return v;
    }
}
