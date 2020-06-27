package com.example.cw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView hh = findViewById(R.id.textView);
        Bundle mm = getIntent().getExtras();


        String username = mm.getString("d1");
        hh.setText(username);
    }
}