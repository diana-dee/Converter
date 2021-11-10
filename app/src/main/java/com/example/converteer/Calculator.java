package com.example.converteer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Button btnConvert,btnExit;
        EditText edMiles;
        TextView txtView;
        btnConvert=findViewById(R.id.btnConvert);
        btnExit=findViewById(R.id.btnExit);
        edMiles=findViewById(R.id.edMiles);
        txtView=findViewById(R.id.txtkilometres);



        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strMiles=edMiles.getText().toString();
                if (strMiles.equals("")){
                    edMiles.setError("Please Enter Miles");
                    edMiles.requestFocus();
                    return;
                }

                float mile=Float.parseFloat(strMiles);

                float kilometres= (float) (mile*1.609344);
                txtView.setText(kilometres +"kilometres");
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Calculator.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}