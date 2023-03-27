package com.example.eval2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView rmsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rmsg = (TextView) findViewById(R.id.msg);

        Intent intent = getIntent();

        String str = intent.getStringExtra("PersonName");

        rmsg.setText("Hello, "+str+"!");
    }
}