package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstValue, secondValue;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstValue = findViewById(R.id.first_value);
        secondValue = findViewById(R.id.second_value);
        answer =findViewById(R.id.answer_box);

    }
    public void doCalculation(View nameOfTheValue) {

        String firstValueString = firstValue.getText().toString();
        String secondValueString = secondValue.getText().toString();

        if(firstValueString.isEmpty() || secondValueString.isEmpty()) {

            Toast.makeText(MainActivity.this, "Invalid Inputs", Toast.LENGTH_LONG).show();

        } else {

            try {

                int firstValueInt = Integer.parseInt(firstValueString);
                int secondValueInt = Integer.parseInt(secondValueString);

                int answerInt = 0;

                switch (nameOfTheValue.getId()) {
                    case R.id.addition_button :
                        answerInt = firstValueInt + secondValueInt;
                        break;
                    case R.id.substraction_button:
                        answerInt = firstValueInt - secondValueInt;
                        break;
                    case R.id.multiply_button:
                        answerInt = firstValueInt * secondValueInt;
                        break;
                    default:
                        answerInt = firstValueInt / secondValueInt;
                        break;

                }

                String answerString = String.valueOf(answerInt);

                answer.setText("Answer is: " + answerString);

            } catch (NumberFormatException e) {
                Log.e("Calculation error",e.toString());
                Toast.makeText(MainActivity.this, "Use your brain", Toast.LENGTH_LONG).show();
            }
        }

    }
}