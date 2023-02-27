package com.example.arraylistgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
   ArrayList<Integer> pics;
   Context context;

   GridAdapter(ArrayList<Integer> pics, Context context)
   {
       this.pics=pics;
       this.context=context;
   }

    @Override
    public int getCount() {
        return pics.size();
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
       View v= LayoutInflater.from(context).inflate(R.layout.grid_view,null);
        ImageView imggrid=v.findViewById(R.id.imggrid);

        imggrid.setImageResource(pics.get(position));
        return v;
    }
}
