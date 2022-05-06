package com.example.ScreenCheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScreenCheck extends AppCompatActivity {
private Button back;
private Button next_colour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_check);
        int i = 0;
        back = (Button)findViewById(R.id.button2);
        next_colour = (Button)findViewById(R.id.button1);

            next_colour.setOnClickListener( v ->{
                @Override
                public void onClick(View view) {
                    next_colour.setBackgroundColor(color_green);
            });

    }
}