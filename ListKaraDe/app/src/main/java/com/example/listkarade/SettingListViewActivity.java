package com.example.listkarade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.listkarade.databinding.ActivitySettingListViewBinding;


public class SettingListViewActivity extends AppCompatActivity {
        ActivitySettingListViewBinding binding;
    String setting[]={"Airplane Mode","WI-FI","Bluetooth","Mobile Data","Personal Hotspot","VPN","Notifications","Sounds & Haptics","Focus","Screen Time","General","Control Centre","Display & Brightness","Home Screen","Accessibility","Wallpaper","Security","About Phone","Privacy","Services & Feedback"};
    int icon[]={R.drawable.flightmode,R.drawable.wifi,R.drawable.bluetooth,R.drawable.mobiledata,R.drawable.hotspot,R.drawable.vpn,R.drawable.notification,R.drawable.sounds,R.drawable.dnd,R.drawable.screentime,R.drawable.gear,R.drawable.controlcentre,R.drawable.display,R.drawable.phone,R.drawable.accessability,R.drawable.images,R.drawable.secure,R.drawable.about,R.drawable.privacy,R.drawable.feedback};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_setting_list_view);

        binding=ActivitySettingListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

            settingList();
    }

    private void settingList() {

        SettingListViewAdapter adapter=new SettingListViewAdapter(setting,icon,this);

        binding.settingList.setAdapter(adapter);

    }
}