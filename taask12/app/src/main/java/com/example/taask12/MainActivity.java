package com.example.taask12;

import androidx.annotation.RequiresPermission;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.contentcapture.ContentCaptureSessionId;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    TextView login;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
    }

    @SuppressLint("NewApi")
    public void loginClicked(View view) {

        String usernameText = username.getText().toString();
        String passwordText = password.getText().toString();

        if(usernameText.isEmpty() || passwordText.isEmpty()) {

            Toast.makeText(MainActivity.this, "Invalid inputs",Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(MainActivity.this, "Good job",Toast.LENGTH_LONG).show();

        }

    }

}