package com.example.ex04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText edtdoC, edtdoF;
    Button btncf, btnfc, btntobmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtdoC = (EditText) findViewById(R.id.edtCel);
        edtdoF = (EditText) findViewById(R.id.edtFah);
        btncf = (Button) findViewById(R.id.btncf);
        btnfc = (Button) findViewById(R.id.btnfc);
        btntobmi = (Button) findViewById(R.id.btnToBMI);
        btncf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("#.00");
                String doC = edtdoC.getText() + "";
                int C = Integer.parseInt(doC);
                edtdoF.setText("" + dcf.format(C * 1.8 + 32));
            }
        });
        btnfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("#.00");
                String doF = edtdoF.getText() + "";
                int F = Integer.parseInt(doF);
                edtdoC.setText("" + dcf.format((F - 32) / 1.8));
            }
        });
        btntobmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, BMI.class);
                startActivity(myIntent);
            }
        });
    }
}