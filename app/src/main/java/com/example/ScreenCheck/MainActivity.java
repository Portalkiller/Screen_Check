package com.example.ScreenCheck;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {
 private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(v -> {
            Intent i = new Intent(this, ScreenCheck.class);
            startActivity(i);
        });

    }
}