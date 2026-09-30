package com.example.practice4;

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

        Button sizePlus =
                (Button) findViewById(R.id.button1);

        Button sizeMinus =
                (Button) findViewById(R.id.button2);

        Button rotationPlus =
                (Button) findViewById(R.id.button3);

        Button rotationMinus =
                (Button) findViewById(R.id.button4);

        TextView textView =
                (TextView) findViewById(R.id.textview);


        // Size +
        sizePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float size = textView.getTextSize();

                textView.setTextSize(size + 5);
            }
        });


        // Size -
        sizeMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float size = textView.getTextSize();

                textView.setTextSize(size - 5);
            }
        });


        // Rotation +
        rotationPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float rotation = textView.getRotation();

                textView.setRotation(rotation + 10);
            }
        });


        // Rotation -
        rotationMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float rotation = textView.getRotation();

                textView.setRotation(rotation - 10);
            }
        });
    }
}