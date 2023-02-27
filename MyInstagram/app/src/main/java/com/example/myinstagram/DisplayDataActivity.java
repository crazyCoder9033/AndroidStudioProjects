package com.example.myinstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myinstagram.databinding.ActivityDisplayDataBinding;

public class DisplayDataActivity extends AppCompatActivity {
ActivityDisplayDataBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_data);
        binding=ActivityDisplayDataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        intview();
    }

    private void intview() {

            String name= getIntent().getStringExtra("name");

            Bundle bundle=getIntent().getExtras();
            if(bundle!=null)
            {
                int pic=bundle.getInt("pic");
                binding.imgSmallShow.setImageResource(pic);
            }

            Bundle bundle1=getIntent().getExtras();
            if(bundle1!=null)
            {
                int pic2=bundle1.getInt("pic2");
                binding.imgBig.setImageResource(pic2);
            }

            binding.txtNameShow.setText(name);
    }
}