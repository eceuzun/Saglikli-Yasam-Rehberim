package com.example.healthylife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    public Button btn_signup;
    public Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_signup = findViewById(R.id.btn_signup);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kayit = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(kayit);

            }
        });

        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent giris = new Intent(LoginActivity.this, GirisActivity.class);
                startActivity(giris);

            }
        });
    }
}