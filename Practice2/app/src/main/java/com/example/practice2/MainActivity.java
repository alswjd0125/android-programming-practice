package com.example.practice2;

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

        Button a = (Button) findViewById(R.id.buttonA);
        Button b = (Button) findViewById(R.id.buttonB);
        Button reset = (Button) findViewById(R.id.ResetButton);

        TextView textView =
                (TextView) findViewById(R.id.textView);


        a.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                textView.setText(
                        textView.getText().toString() + "A"
                );

            }
        });



        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                textView.setText(
                        textView.getText().toString() + "B"
                );

            }
        });



        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                textView.setText("");

            }
        });
    }
}