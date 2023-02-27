package com.example.listkarade;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SettingListViewAdapter extends BaseAdapter {
   String setting[];
   int icon[];
   Context context;
   SettingListViewAdapter(String[] setting, int[] icon, Context context)
   {
       this.setting=setting;
       this.icon=icon;
       this.context=context;
   }

    @Override
    public int getCount() {
        return setting.length;
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

       View v= LayoutInflater.from(context).inflate(R.layout.setting_list_display,null);
        ImageView imgIcon=v.findViewById(R.id.imgIcon);
        TextView txtDisplay=v.findViewById(R.id.txtDisplay);

        imgIcon.setImageResource(icon[position]);
        txtDisplay.setText(setting[position]);

        return v;
    }
}
