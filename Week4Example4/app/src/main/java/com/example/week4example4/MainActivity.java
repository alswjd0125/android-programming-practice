package com.example.week4example4;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton r1 = (RadioButton) findViewById(R.id.radioButton1);

        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    Toast.makeText(
                            getApplicationContext(),
                            "RadioButton 1 is selected",
                            Toast.LENGTH_SHORT
                    ).show();
                }

            }
        });
        RadioButton r2 = (RadioButton) findViewById(R.id.radioButton2);

        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    Toast.makeText(
                            getApplicationContext(),
                            "RadioButton 2 is selected",
                            Toast.LENGTH_SHORT
                    ).show();
                }

            }
        });

        RadioButton r3 = (RadioButton) findViewById(R.id.radioButton3);

        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    Toast.makeText(
                            getApplicationContext(),
                            "RadioButton 3 is selected",
                            Toast.LENGTH_SHORT
                    ).show();
                }

            }
        });
    }
}