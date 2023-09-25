package com.example.hellowordapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView color_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        color_text = findViewById(R.id.textView);
    }

    public void btn_click(View view){
        color_text.setTextColor(Color.RED);
    }

    public void btn_click_blue(View view){
        color_text.setTextColor(Color.BLUE);
    }

    public void btn_click_yellow(View view){
        color_text.setTextColor(Color.parseColor("#ffff00"));
    }
}