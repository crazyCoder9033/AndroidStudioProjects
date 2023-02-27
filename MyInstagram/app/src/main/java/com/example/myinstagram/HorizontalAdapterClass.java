package com.example.myinstagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class HorizontalAdapterClass extends RecyclerView.Adapter<HorizontalAdapterClass.MyView> {
   ArrayList<HorizontalModelClass> horizontal;
    HorizontalAdapterClass(ArrayList<HorizontalModelClass> horizontal)
    {
        this.horizontal=horizontal;
    }
    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_item,parent,false);
       MyView myView=new MyView(view);
        return myView;
    }

    @Override
    public void onBindViewHolder(@NonNull MyView holder, int position) {
        holder.imgSet.setImageResource(horizontal.get(position).getPic());
        holder.txtSet.setText(horizontal.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return horizontal.size();
    }

    public class MyView extends RecyclerView.ViewHolder {
        TextView txtSet;
        CircleImageView imgSet;
        public MyView(@NonNull View itemView) {
            super(itemView);
            txtSet=itemView.findViewById(R.id.txtSet);
            imgSet=itemView.findViewById(R.id.imgSet);
        }
    }
}
