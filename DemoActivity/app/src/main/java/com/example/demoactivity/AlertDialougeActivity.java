package com.example.demoactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialougeActivity extends AppCompatActivity {
 Button btn1,btn2,btn3,btn4,btn5;
 String[] foodarray={"Pizza","Burger","Sandwich","Chinese"};
 String[] hobbyarray={"Cricekt","GYM","singing","dancing"};
 boolean[] hobbyboolean={false,false,false,false};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialouge);
        idbind();
        onclickButton1();
        onclickButton2();
        onclickButton3();
        onclickButton4();
        onclickButton5();


    }

    private void onclickButton5() {
        btn5.setOnClickListener( a-> {
            AlertDialog.Builder builder= new AlertDialog.Builder(AlertDialougeActivity.this);
            builder.setTitle("Application Message");
            builder.setMessage("Username or Passowrd is incorrect");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertDialougeActivity.this, "please check username and password", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setCancelable(false);
            builder.show();
        });
    }

    private void onclickButton4() {
        btn4.setOnClickListener( m -> {
            AlertDialog.Builder builder=new AlertDialog.Builder(AlertDialougeActivity.this);
            builder.setTitle("ALERT");
            builder.setMessage("Are you sure you want to delete");
            builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertDialougeActivity.this, "Deleting", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertDialougeActivity.this, "Cancelling", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setCancelable(false);
            builder.show();
        });

    }

    private void onclickButton3() {
        btn3.setOnClickListener( z-> {
            AlertDialog.Builder builder=new AlertDialog.Builder(AlertDialougeActivity.this);
            builder.setTitle("Reset Setting");
            builder.setMessage("this will reset your device to its default setting");
            builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertDialougeActivity.this, "Reset starts now", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertDialougeActivity.this, "Exiting ", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setCancelable(false);
            builder.show();
        });
    }

    private void onclickButton2() {
        btn2.setOnClickListener( m -> {
            AlertDialog.Builder builder=new AlertDialog.Builder(AlertDialougeActivity.this);
            builder.setTitle("Please select your hobbies");
//            builder.setMessage("Are you sure, you want to continue?");

            builder.setMultiChoiceItems(hobbyarray, hobbyboolean, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    String selectitem=hobbyarray[which];
                }
            });
            builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertDialougeActivity.this, "Good choice", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertDialougeActivity.this, "Stopped", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setCancelable(false);
            builder.show();


        });

    }

    private void idbind() {
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
    }

    private void onclickButton1() {
        btn1.setOnClickListener(n ->{
            AlertDialog.Builder builder=new AlertDialog.Builder(AlertDialougeActivity.this);

            builder.setTitle("Favourite Food ");
//            builder.setMessage("select your favourite food item");
            builder.setSingleChoiceItems(foodarray, 2, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    String arrayy=foodarray[which];
                }
            });
            builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertDialougeActivity.this, "nice choice", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertDialougeActivity.this, "opps sorry", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNeutralButton("DISMISS", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertDialougeActivity.this, "Nothing will happen", Toast.LENGTH_SHORT).show();
                }
            });

            builder.setCancelable(false);
            builder.show();
        });



    }
}