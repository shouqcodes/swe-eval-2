package com.example.eval2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b;
EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= findViewById(R.id.sendBTN);
        e= findViewById(R.id.PersonName);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = e.getText().toString();

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                intent.putExtra("PersonName", s);

                startActivity(intent);
            }
        });
    }
}