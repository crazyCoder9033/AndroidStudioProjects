package com.example.listkarade;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter {

    String country[];
    int pic[];
    Context context;

    CustomListAdapter(String[] country, int[] pic, Context context)
   {
        this.country=country;
        this.pic=pic;
        this.context=context;
   }

    @Override
    public int getCount() {
        return pic.length;
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

        View v= LayoutInflater.from(context).inflate(R.layout.list_view,null);
        TextView txtView=v.findViewById(R.id.txtView);
        ImageView imgView=v.findViewById(R.id.imgView);

        txtView.setText(country[position]);
        imgView.setImageResource(pic[position]);
        return v;
    }
}
