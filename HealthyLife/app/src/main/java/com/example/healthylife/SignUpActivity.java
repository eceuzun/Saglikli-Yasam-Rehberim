package com.example.healthylife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {

    public Button btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btn_signup = findViewById(R.id.btn_signup);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kayit = new Intent(SignUpActivity.this, GirisActivity.class);
                startActivity(kayit);

            }
        });
    }
}