package com.example.toasttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class IfElseMarks extends AppCompatActivity {
    AppCompatButton btnSubmit;
    EditText edtNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if_else_marks);
        
        intview();
    }

    private void intview() {
        btnSubmit=findViewById(R.id.btnSubmit);
        edtNumber=findViewById(R.id.edtNumber);

        btnSubmit.setOnClickListener(view -> {

            String a=edtNumber.getText().toString();
            int marks= Integer.parseInt(a);
            
            if(marks<35)
            {
                Toast.makeText(this, "Fail", Toast.LENGTH_SHORT).show();
            }
            else if (marks >35 && marks <=50)
            {
                Toast.makeText(this, "Grade C", Toast.LENGTH_SHORT).show();
            }
            else if( marks>50 && marks<=75)
            {
                Toast.makeText(this, "Grade B", Toast.LENGTH_SHORT).show();
            }
            else if(marks >75 && marks <=90)
            {
                Toast.makeText(this, "Grade A", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "Grade A+", Toast.LENGTH_SHORT).show();
            }

            
        });
    }
}