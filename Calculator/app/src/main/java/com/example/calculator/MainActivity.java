package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumberEditText, secondNumberEditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumberEditText = findViewById(R.id.firstNumberEditText);
        secondNumberEditText = findViewById(R.id.secondNumberEditText);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void addNumbers(View view) {
        String num1Str = firstNumberEditText.getText().toString();
        String num2Str = secondNumberEditText.getText().toString();
        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            double sum = num1 + num2;
            resultTextView.setText("Result: " + sum);
        } else {
            resultTextView.setText("Please enter valid numbers.");
        }
    }
    public void subNumbers(View view) {
        String num1Str = firstNumberEditText.getText().toString();
        String num2Str = secondNumberEditText.getText().toString();
        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            double diff = num1 - num2;
            resultTextView.setText("Result: " + diff);
        } else {
            resultTextView.setText("Please enter valid numbers.");
        }
    }
    public void mulNumbers(View view) {
        String num1Str = firstNumberEditText.getText().toString();
        String num2Str = secondNumberEditText.getText().toString();
        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            double pro = num1 * num2;
            resultTextView.setText("Result: " + pro);
        } else {
            resultTextView.setText("Please enter valid numbers.");
        }
    }

    public void divNumbers(View view) {
        String num1Str = firstNumberEditText.getText().toString();
        String num2Str = secondNumberEditText.getText().toString();
        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            double div = num1 / num2;
            resultTextView.setText("Result: " + div);
        } else {
            resultTextView.setText("Please enter valid numbers.");
        }
    }
}