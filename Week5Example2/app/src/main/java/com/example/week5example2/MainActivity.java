package com.example.week5example2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);


        layout.setPadding(20, 100, 20, 20);


        Button b = new Button(this);
        b.setText("ADD TEXTVIEW");


        layout.addView(b);


        setContentView(layout);


        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView t = new TextView(MainActivity.this);

                t.setText("TextView" + count);
                t.setTextSize(20);

                layout.addView(t);

                count++;
            }
        });
    }
}