package com.example.ex04;

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

public class BMI extends AppCompatActivity {

    Button btnChandoan;
    EditText editTen,editChieucao,editCannang,editBMI,editChandoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        btnChandoan= (Button) findViewById(R.id.btnBMI);
        editTen= (EditText) findViewById(R.id.edtten);
        editChieucao= (EditText) findViewById(R.id.edtchieucao);
        editCannang= (EditText) findViewById(R.id.edtcannang);
        editBMI= (EditText) findViewById(R.id.edtBMI);
        editChandoan= (EditText) findViewById(R.id.edtChuanDoan);
        btnChandoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                double H=Double.parseDouble(editChieucao.getText()+"");
                double W=Double.parseDouble(editCannang.getText()+"");
                double BMI=(double) W/Math.pow(H,2);
                String chandoan="";
                if(BMI<18)
                {
                    chandoan="Bạn gầy";
                }
                else if(BMI<=24.9)
                {
                    chandoan="Bạn bình thường";
                }
                else if(BMI<=29.9)
                {
                    chandoan="Bạn béo phì độ 1";
                }
                else if(BMI<=34.9)
                {
                    chandoan="Bạn béo phì độ 2";
                }
                else
                {
                    chandoan="Bạn béo phì độ 3";
                }
                DecimalFormat dcf=new DecimalFormat("#.0");
                editBMI.setText(dcf.format(BMI));
                editChandoan.setText(chandoan);
            }
        });
    }
}