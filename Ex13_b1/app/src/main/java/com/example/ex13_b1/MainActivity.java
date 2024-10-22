package com.example.ex13_b1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ex13_b1.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<country> countries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        countries = new ArrayList<country>();
        countries.add(new country(R.drawable.vn   ,"vietnam","Ha Noi"));
        countries.add(new country(R.drawable.my  ,"my","New York"));
        countries.add(new country(R.drawable.ca,"canada","Ottawa"));
    }
}