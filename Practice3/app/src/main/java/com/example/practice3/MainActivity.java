package com.example.practice3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    Button btnSizePlus;
    Button btnSizeMinus;
    Button btnRotationPlus;
    Button btnRotationMinus;

    float textSize = 24;
    float rotation = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        btnSizePlus = findViewById(R.id.btnSizePlus);
        btnSizeMinus = findViewById(R.id.btnSizeMinus);

        btnRotationPlus = findViewById(R.id.btnRotationPlus);
        btnRotationMinus = findViewById(R.id.btnRotationMinus);



        btnSizePlus.setOnClickListener(v -> {

            textSize += 2;

            textView.setTextSize(textSize);

        });



        btnSizeMinus.setOnClickListener(v -> {

            if (textSize > 2) {

                textSize -= 2;

                textView.setTextSize(textSize);

            }

        });



        btnRotationPlus.setOnClickListener(v -> {

            rotation += 10;

            textView.setRotation(rotation);

        });



        btnRotationMinus.setOnClickListener(v -> {

            rotation -= 10;

            textView.setRotation(rotation);

        });

    }
}