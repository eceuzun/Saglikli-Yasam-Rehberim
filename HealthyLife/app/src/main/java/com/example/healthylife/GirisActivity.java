package com.example.healthylife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GirisActivity extends AppCompatActivity {

    public Button btn_diyet;
    public Button btn_egzersiz;
    public Button btn_gunluk;
    public Button btn_saglik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        btn_diyet.findViewById(R.id.btn_beslenme);

        btn_diyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent diyet = new Intent(GirisActivity.this, DiyetAnaActivity.class);
                startActivity(diyet);

            }
        });
    }
}