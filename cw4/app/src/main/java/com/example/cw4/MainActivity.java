package com.example.cw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
final EditText username = findViewById(R.id.editTextTextPersonName);
final Button one = findViewById(R.id.button);
        final Button two = findViewById(R.id.button2);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(MainActivity.this,MainActivity2.class);
               h.putExtra("d1",username.getText().toString());
                startActivity(h);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(a); }
        });
    }
}