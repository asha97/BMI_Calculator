package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText weightEntry, heightEntry;
    TextView result;
    Button calculatorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEntry = findViewById(R.id.weight);
        heightEntry = findViewById(R.id.height);
        result = findViewById(R.id.resultText);
        calculatorButton = findViewById(R.id.calculate);

        calculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(weightEntry.getText().toString());
                double height = Double.parseDouble(heightEntry.getText().toString());

                //BMI formula = weight / (height * height);
                double bmiNumber = weight / (height * height);
                String bmiStringConvert = String.valueOf(bmiNumber);

                String bmiString = "Your BMI is: " + bmiStringConvert + "";
                result.setText(bmiString);
            }

        });
    }
}
