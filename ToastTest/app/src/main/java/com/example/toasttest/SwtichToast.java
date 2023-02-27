package com.example.toasttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class SwtichToast extends AppCompatActivity {
    AppCompatButton btnSubmit;
    EditText edtNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swtich_toast);
        intview();
    }

    private void intview() {

        btnSubmit=findViewById(R.id.btnSubmit);
        edtNumber=findViewById(R.id.edtNumber);

        btnSubmit.setOnClickListener(view -> {

            String a = edtNumber.getText().toString();
            int day = Integer.parseInt(a);
            
            switch (day)
            {
                case 1:
                    Toast.makeText(this, "SUNDAY", Toast.LENGTH_SHORT).show();
                    break;


                case 2:
                    Toast.makeText(this, "MONDAY", Toast.LENGTH_SHORT).show();
                    break;


                case 3:
                    Toast.makeText(this, "TUESDAY", Toast.LENGTH_SHORT).show();
                    break;


                case 4:
                    Toast.makeText(this, "WEDNESDAY", Toast.LENGTH_SHORT).show();
                    break;


                case 5:
                    Toast.makeText(this, "THURSDAY", Toast.LENGTH_SHORT).show();
                    break;


                case 6:
                    Toast.makeText(this, "FRIDAY", Toast.LENGTH_SHORT).show();
                    break;


                case 7:
                    Toast.makeText(this, "SATURDAY", Toast.LENGTH_SHORT).show();
                    break;
                    
                default:
                    Toast.makeText(this, "INVALID INPUT", Toast.LENGTH_SHORT).show();
            }

        });
    }
}