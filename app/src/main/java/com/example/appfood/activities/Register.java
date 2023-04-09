package com.example.appfood.activities;

import static com.example.appfood.R.layout.activity_register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_register);
    }

    public void login(View view) {
        startActivity(new Intent(Register.this, Login.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent(Register.this, Login.MainActivity.class));
    }
}