package com.example.week4example3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button b1 = (Button) findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                EditText e1 = (EditText) findViewById(R.id.editText1);
                EditText e2 = (EditText) findViewById(R.id.editText2);

                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);

                int result = num1 + num2;

                TextView t = (TextView) findViewById(R.id.textView);
                t.setText("Result: " + result);
            }
        });



        Button b2 = (Button) findViewById(R.id.button2);

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                EditText e1 = (EditText) findViewById(R.id.editText1);
                EditText e2 = (EditText) findViewById(R.id.editText2);

                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);

                int result = num1 - num2;

                TextView t = (TextView) findViewById(R.id.textView);
                t.setText("Result: " + result);
            }
        });



        Button b3 = (Button) findViewById(R.id.button3);

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                EditText e1 = (EditText) findViewById(R.id.editText1);
                EditText e2 = (EditText) findViewById(R.id.editText2);

                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);

                int result = num1 / num2;

                TextView t = (TextView) findViewById(R.id.textView);
                t.setText("Result: " + result);
            }
        });



        Button b4 = (Button) findViewById(R.id.button4);

        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                EditText e1 = (EditText) findViewById(R.id.editText1);
                EditText e2 = (EditText) findViewById(R.id.editText2);

                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);

                int result = num1 * num2;

                TextView t = (TextView) findViewById(R.id.textView);
                t.setText("Result: " + result);
            }
        });

    }
}