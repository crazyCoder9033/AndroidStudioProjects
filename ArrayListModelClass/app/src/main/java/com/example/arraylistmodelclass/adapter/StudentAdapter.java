package com.example.arraylistmodelclass.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.arraylistmodelclass.R;
import com.example.arraylistmodelclass.activity.MainActivity;
import com.example.arraylistmodelclass.modelclass.StudentDetailsModelClass;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class StudentAdapter extends BaseAdapter {

    ArrayList<StudentDetailsModelClass> details;
    Context context;
   public StudentAdapter(ArrayList<StudentDetailsModelClass> details, Context context)
   {
        this.details=details;
        this.context=context;
   }

    @Override
    public int getCount() {
        return details.size();
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
        View v= LayoutInflater.from(context).inflate(R.layout.student_details_display,null);
        TextView txtname=v.findViewById(R.id.txtname);
        TextView txtfname=v.findViewById(R.id.txtfname);
        TextView txtStudentId=v.findViewById(R.id.txtStudentId);
        TextView txtFees=v.findViewById(R.id.txtFees);
        TextView txtCity=v.findViewById(R.id.txtCity);


        txtname.setText("NAME:- "+details.get(position).getName());
        txtfname.setText("FATHER'S NAME:- "+details.get(position).getFname());
        txtStudentId.setText("ID:- "+Integer.toString(details.get(position).getId()));
        txtFees.setText("FEES:- "+Integer.toString(details.get(position).getFees()));
        txtCity.setText("CITY:- "+details.get(position).getCity());


        return v;
    }
}
