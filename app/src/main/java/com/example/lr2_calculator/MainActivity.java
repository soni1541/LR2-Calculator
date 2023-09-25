package com.example.lr2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView char_operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        char_operation = findViewById(R.id.textView2_operation);
    }

    public void Onclick_button_sum(View view) {
        char_operation.setText("+");
    }
    public void Onclick_button_minus(View view) {
        char_operation.setText("-");
    }
    public void Onclick_button_del(View view) {
        char_operation.setText("/");
    }
    public void Onclick_button_multi(View view) {
        char_operation.setText("*");
    }

}