package com.example.lr2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView char_operation;
    EditText number1;
    EditText number2;



    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        char_operation = findViewById(R.id.textView2_operation);
        number1 = findViewById(R.id.editTextNumber1);
        number2 = findViewById(R.id.editTextNumber2);
        result = findViewById(R.id.textView_result);


    }

    public void Onclick_button_sum(View view) {
        double result_number;
        double n1;
        double n2;

        n1 = Double.parseDouble(number1.getText().toString());
        n2 = Double.parseDouble(number2.getText().toString());

        char_operation.setText("+");

        result_number = n1 + n2;

        result.setText(Double.toString(result_number));

    }
    public void Onclick_button_minus(View view) {
        double result_number;
        double n1;
        double n2;

        n1 = Double.parseDouble(number1.getText().toString());
        n2 = Double.parseDouble(number2.getText().toString());

        char_operation.setText("-");
        result_number = n1 - n2;

        result.setText(Double.toString(result_number));
    }
    public void Onclick_button_del(View view) {
        double result_number;
        double n1;
        double n2;

        n1 = Double.parseDouble(number1.getText().toString());
        n2 = Double.parseDouble(number2.getText().toString());

        char_operation.setText("/");

        if(n2 == 0)
        {
            result.setText("Ошибка: Деление на ноль");
        }
        else {
            result_number = n1 / n2;

            result.setText(Double.toString(result_number));
        }


    }
    public void Onclick_button_multi(View view) {
        double result_number;
        double n1;
        double n2;

        n1 = Double.parseDouble(number1.getText().toString());
        n2 = Double.parseDouble(number2.getText().toString());

        result_number = n1 * n2;

        result.setText(Double.toString(result_number));


        char_operation.setText("*");
    }

    public void Onclick_button_clear(View view) {
        number1.setText(" ");
        number2.setText(" ");
        result.setText(" ");
    }

}