package com.example.noemiweswing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaInici extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_inici);

        Button registroButton = findViewById(R.id.botonregistro);

        registroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaInici.this, PantallaRegistro.class);
                startActivity(intent);
            }
        });

        Button inicioButton = findViewById(R.id.botoninicio);
        inicioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaInici.this, PantallaNewsFeed.class);
                startActivity(intent);
            }
        });

    }
}