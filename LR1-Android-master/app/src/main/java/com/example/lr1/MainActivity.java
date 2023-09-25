package com.example.lr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text_fi;
    private TextView text_group;
    private ImageView myimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_fi = findViewById(R.id.textView);
        text_group = findViewById(R.id.textView4);
        myimg = findViewById(R.id.imageView);
    }

    public void onclick_hide_text(View view){
        if(text_fi.getVisibility() == View.VISIBLE)
        {
            text_fi.setVisibility(View.INVISIBLE);
            text_group.setVisibility(View.INVISIBLE);
        }
        else
        {
            text_fi.setVisibility(View.VISIBLE);
            text_group.setVisibility(View.VISIBLE);
        }
    }

    public void onclick_hide_img(View view){
        if(myimg.getVisibility() == View.VISIBLE)
        {
            myimg.setVisibility(View.INVISIBLE);
        }
        else
        {
            myimg.setVisibility(View.VISIBLE);
        }

    }
}