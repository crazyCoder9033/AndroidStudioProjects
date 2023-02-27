package com.example.arraylistmodelclass.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.arraylistmodelclass.R;
import com.example.arraylistmodelclass.WhatsappInterfaceActivity;
import com.example.arraylistmodelclass.modelclass.WhatsappChatsModel;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatsAdapter extends BaseAdapter {
   ArrayList<WhatsappChatsModel> chats;
   Context context;

    public ChatsAdapter(ArrayList<WhatsappChatsModel> chats, Context context)
    {
        this.chats=chats;
        this.context=context;
    }

    @Override
    public int getCount() {
        return chats.size();
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

        View v= LayoutInflater.from(context).inflate(R.layout.whatsapp_list,null);
        TextView txtname=v.findViewById(R.id.txtname);
        TextView txtchats=v.findViewById(R.id.txtchat);
        CircleImageView imgUser=v.findViewById(R.id.imgUser);

        txtname.setText(chats.get(position).getName());
        txtchats.setText(chats.get(position).getText());
        imgUser.setImageResource(chats.get(position).getPic());

        return v;
    }
}
