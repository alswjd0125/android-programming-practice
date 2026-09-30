package com.example.week5example1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout l = (LinearLayout) findViewById(R.id.linearLayout);


        Button b1 = new Button(this);
        b1.setText("Button1");


        l.addView(b1);


        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(
                        getApplicationContext(),
                        "New Button!",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        Button b2 = new Button(this);
        b2.setText("Button2");


        l.addView(b2);


        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(
                        getApplicationContext(),
                        "New Button!",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}