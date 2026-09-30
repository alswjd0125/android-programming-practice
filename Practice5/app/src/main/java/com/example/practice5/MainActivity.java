package com.example.practice5;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);

        CheckBox checkEnable = findViewById(R.id.checkEnable);

        RadioButton radioWhite = findViewById(R.id.radioWhite);
        RadioButton radioRed = findViewById(R.id.radioRed);
        RadioButton radioBlue = findViewById(R.id.radioBlue);

        Button btnConfirm = findViewById(R.id.btnConfirm);
        Button btnTarget = findViewById(R.id.btnTarget);



        btnConfirm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String text = editText.getText().toString();
                btnTarget.setText(text);



                if (checkEnable.isChecked()) {
                    btnTarget.setEnabled(true);
                } else {
                    btnTarget.setEnabled(false);
                }



                if (radioWhite.isChecked()) {

                    btnTarget.setBackgroundColor(Color.WHITE);

                } else if (radioRed.isChecked()) {

                    btnTarget.setBackgroundColor(Color.RED);

                } else if (radioBlue.isChecked()) {

                    btnTarget.setBackgroundColor(Color.BLUE);

                }

            }
        });
    }
}