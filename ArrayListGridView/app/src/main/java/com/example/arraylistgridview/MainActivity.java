package com.example.arraylistgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.arraylistgridview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
ArrayList<String> types=new ArrayList<>();
ArrayList<Integer> icons=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        workingclass();
    }

    private void workingclass() {
        types.add("Google Drive");
        types.add("Dropbox");
        types.add("One Drive");
        types.add("LAN / SMB");
        types.add("FTP");
        types.add("WebDav");
        types.add("Yandex");
        types.add("Owncloud");
        types.add("Box");

        icons.add(R.drawable.drive);
        icons.add(R.drawable.dropbox);
        icons.add(R.drawable.onedrive);
        icons.add(R.drawable.monitor);
        icons.add(R.drawable.ftp);
        icons.add(R.drawable.sftp);
        icons.add(R.drawable.webdav);
        icons.add(R.drawable.yandex);
        icons.add(R.drawable.owncloud);
        icons.add(R.drawable.storage);

        ConnectionTypeAdapter adapter=new ConnectionTypeAdapter(types,icons,this);
            binding.listView.setAdapter(adapter);
    }
}