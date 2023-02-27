package com.example.arraylistgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ConnectionTypeAdapter extends BaseAdapter {
ArrayList<String> types;
ArrayList<Integer> icons;
Context context;

ConnectionTypeAdapter(ArrayList<String> types, ArrayList<Integer> icons, Context context)
{
    this.types=types;
    this.icons=icons;
    this.context=context;

}
    @Override
    public int getCount() {
        return types.size();
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
        View v= LayoutInflater.from(context).inflate(R.layout.connection,null);
        ImageView imgView=v.findViewById(R.id.imgView);
        TextView txtView=v.findViewById(R.id.txtView);

        imgView.setImageResource(icons.get(position));
        txtView.setText(types.get(position));
        return v;
    }
}
