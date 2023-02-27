package com.example.myinstagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class VerticalAdapterClass extends RecyclerView.Adapter<VerticalAdapterClass.MyView> {
    ArrayList<VerticalModelClass> vertical;
    ContentInterfaceClass contentInterfaceClass;
    VerticalAdapterClass(ArrayList<VerticalModelClass> vertical, ContentInterfaceClass contentInterfaceClass)
    {
        this.vertical=vertical;
        this.contentInterfaceClass=contentInterfaceClass;
    }

    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_item,parent,false);

        MyView myView=new MyView(view);
        return myView;
    }

    @Override
    public void onBindViewHolder(@NonNull MyView holder, int position) {
    holder.imgSmallPic.setImageResource(vertical.get(position).getPic());
    holder.txtSmall.setText(vertical.get(position).getName());
    holder.imgBig.setImageResource(vertical.get(position).getPic2());

    holder.imgBig.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            contentInterfaceClass.setdata(vertical.get(position).getName(),vertical.get(position).getPic(),vertical.get(position).getPic2());
        }
    });

    }

    @Override
    public int getItemCount() {
        return vertical.size();
    }

    public class MyView extends RecyclerView.ViewHolder {
        CircleImageView imgSmallPic;
        TextView txtSmall;
        ImageView imgBig;
        public MyView(@NonNull View itemView) {
            super(itemView);

            imgBig=itemView.findViewById(R.id.imgBig);
            imgSmallPic=itemView.findViewById(R.id.imgSmallPic);
            txtSmall=itemView.findViewById(R.id.txtSmall);
        }
    }
}
