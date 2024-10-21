package com.example.ex05;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editNamDuongLich;
    private TextView textNamAmLich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khai báo các view
        editNamDuongLich = (EditText) findViewById(R.id.editnamduonglich);
        textNamAmLich = (TextView) findViewById(R.id.textView5);
        Button btnDoi = (Button) findViewById(R.id.button1);

        // Set onClickListener cho button
        btnDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Bước 1: Lấy giá trị nhập từ EditText
                String namDuongLichStr = editNamDuongLich.getText().toString();

                // Bước 2: Ép giá trị nhập vào về số nguyên
                int namDuongLich = Integer.parseInt(namDuongLichStr);

                // Bước 3: Tính toán Can và Chi
                String can = tinhCan(namDuongLich);
                String chi = tinhChi(namDuongLich);

                // Hiển thị năm âm lịch
                textNamAmLich.setText(can + " " + chi);
            }
        });
    }

    // Phương thức tính Can
    private String tinhCan(int nam) {
        String[] can = {"Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ"};
        return can[nam % 10];
    }

    // Phương thức tính Chi
    private String tinhChi(int nam) {
        String[] chi = {"Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi"};
        return chi[nam % 12];
    }
}