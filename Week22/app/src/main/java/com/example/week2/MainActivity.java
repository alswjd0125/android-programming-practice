package com.example.week2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button1);

        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                TextView textView = (TextView) findViewById(R.id.myText);

                textView.setText("Change!");
            }
        });
    }
}