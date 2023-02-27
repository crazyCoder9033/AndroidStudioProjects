package com.example.arraylistmodelclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.arraylistmodelclass.adapter.ChatsAdapter;
import com.example.arraylistmodelclass.databinding.ActivityWhatsappInterfaceBinding;
import com.example.arraylistmodelclass.modelclass.WhatsappChatsModel;

import java.util.ArrayList;

public class WhatsappInterfaceActivity extends AppCompatActivity {
    ActivityWhatsappInterfaceBinding binding;
    ArrayList<WhatsappChatsModel> whatsapp=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_whatsapp_interface);
         binding=ActivityWhatsappInterfaceBinding.inflate(getLayoutInflater());
         setContentView(binding.getRoot());

         chatLayout();
    }

    private void chatLayout() {

        WhatsappChatsModel w1=new WhatsappChatsModel();
        w1.setName("Himanshu");
        w1.setText("Kem cho Maja Ma? 🤙 ");
        w1.setPic(R.drawable.himanshu);
        whatsapp.add(w1);


        WhatsappChatsModel w2=new WhatsappChatsModel();
        w2.setName("Shruti");
        w2.setText("SHRUTI naam to suna hi hoga?? 💁‍♀️");
        w2.setPic(R.drawable.shruti);
        whatsapp.add(w2);

        WhatsappChatsModel w3= new WhatsappChatsModel();
        w3.setName("Sanjay");
        w3.setText("Main hu SANJAY DUTT \uD83D\uDE0E ");
        w3.setPic(R.drawable.sanjay);
        whatsapp.add(w3);

        WhatsappChatsModel w4=new WhatsappChatsModel();
        w4.setName("Dikshit");
        w4.setText("Madma papa saathe vaat kari lo 1 rs. maate 🤷‍");
        w4.setPic(R.drawable.dikshit);
        whatsapp.add(w4);

        WhatsappChatsModel w5=new WhatsappChatsModel();
        w5.setName("Purvish");
        w5.setText("Time nahi mila kaam karne ke liye ☹️");
        w5.setPic(R.drawable.purvish);
        whatsapp.add(w5);

        WhatsappChatsModel w6=new WhatsappChatsModel();
        w6.setName("Akshay");
        w6.setText("Bhai mere naam AXAY hai 🤩");
        w6.setPic(R.drawable.akshay);
        whatsapp.add(w6);

        WhatsappChatsModel w7=new WhatsappChatsModel();
        w7.setName("VEN-C");
        w7.setText("kaij nathi aavadtu 😱 ");
        w7.setPic(R.drawable.user1);
        whatsapp.add(w7);

        WhatsappChatsModel w8=new WhatsappChatsModel();
        w8.setName("Riddhi Ma'am");
        w8.setText("Aagad na topic joi ne aavjo kaale!!😡");
        w8.setPic(R.drawable.user1);
        whatsapp.add(w8);

        WhatsappChatsModel w9=new WhatsappChatsModel();
        w9.setName("Nandini Ma'am");
        w9.setText("Chokrao, 11 vagi gayi, chaloo ⏰ ");
        w9.setPic(R.drawable.user1);
        whatsapp.add(w9);

        WhatsappChatsModel w10=new WhatsappChatsModel();
        w10.setName("Papa❤️");
        w10.setText("Sent an Image");
        w10.setPic(R.drawable.user1);
        whatsapp.add(w10);

        WhatsappChatsModel w11=new WhatsappChatsModel();
        w11.setName("Mikku");
        w11.setText("Ho kidhar bhai?");
        w11.setPic(R.drawable.user1);
        whatsapp.add(w11);


        ChatsAdapter adapter=new ChatsAdapter(whatsapp,this);
        binding.listChats.setAdapter(adapter);
        
       binding.listChats.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                WhatsappChatsModel value=whatsapp.get(position);
               Log.e("TAG", "onItemClick: "+position);
               Toast.makeText(WhatsappInterfaceActivity.this, ""+value.getName()+" - "+value.getText(), Toast.LENGTH_SHORT).show();
           }
       });
    }
}