package com.example.arraylistgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.arraylistgridview.databinding.ActivityGridViewAcitivityBinding;

import java.util.ArrayList;

public class GridViewAcitivity extends AppCompatActivity {
ActivityGridViewAcitivityBinding binding;
ArrayList<Integer> pics =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_grid_view_acitivity);
        binding=ActivityGridViewAcitivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        workingclass();
    }

    private void workingclass() {

        pics.add(R.drawable.e);
        pics.add(R.drawable.one);
        pics.add(R.drawable.one0);
        pics.add(R.drawable.one2);
        pics.add(R.drawable.one3);
        pics.add(R.drawable.q);
        pics.add(R.drawable.w);
        pics.add(R.drawable.r);
        pics.add(R.drawable.t);
        pics.add(R.drawable.y);
        pics.add(R.drawable.two);

        GridAdapter gridAdapter=new GridAdapter(pics,this);

        binding.gridView.setAdapter(gridAdapter);

    }
}