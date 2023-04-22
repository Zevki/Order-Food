package com.example.appfood.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.appfood.MainActivity;
import com.example.appfood.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void register(View view) {
        startActivity(new Intent(Login.this, Register.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent(Login.this, MainActivity.class));
    }
}