package com.example.loginlod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void login(View view){
        EditText login,pswd;
        login = findViewById(R.id.login);
        pswd = findViewById(R.id.pswd);
        Log.i("Login", login.getText().toString());
        Log.i("Password", pswd.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}