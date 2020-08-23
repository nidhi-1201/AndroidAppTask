package com.example.randominteger;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView answer, display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        answer = findViewById(R.id.button);
    }
    @SuppressLint("SetTextI18n")
    public void buttonClick(View v){
        final int random = new Random().nextInt(101) ;
        display.setText(Integer.toString(random));
    }
}