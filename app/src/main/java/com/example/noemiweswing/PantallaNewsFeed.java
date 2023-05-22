package com.example.noemiweswing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PantallaNewsFeed extends AppCompatActivity {

    TextView txtview1,txtview2,txtview3,txtview4,txtview5;
    ImageView flecha1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_news_feed);

        ImageButton botonPerfil = findViewById(R.id.myButton);
        botonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaNewsFeed.this, Perfil.class);
                startActivity(intent);
            }
        });

        TextView botonCalendario = findViewById(R.id.txtview1);
        botonCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaNewsFeed.this, Calendar.class);
                startActivity(intent);
            }
        });

        txtview1 = findViewById(R.id.txtview1);
        txtview2= findViewById(R.id.txtview2);
        txtview3=findViewById(R.id.txtview3);
        txtview4=findViewById(R.id.txtview4);
        txtview5=findViewById(R.id.txtview5);

        SpannableString spannableString = new SpannableString("I'm beginning to see the light (0 assistents) avui a las 22:10.");
        applyColorSpan(spannableString, "I'm beginning to see the light", R.color.red);

        SpannableString spannableString1 = new SpannableString("Angela Mena Also asistirà a Festa d'Inici de Trimestre i presentació dels professors! (5 assistents).");
        applyColorSpan(spannableString1, "Angela Mena Also", R.color.red);
        applyColorSpan(spannableString1, "Festa d'Inici de Trimestre i presentació dels professors!", R.color.red);

        SpannableString spannableString2 = new SpannableString("Cristina Sánchez assistirà a Classe oberta d'Afrobeat amb el Jordi Maho! (1 assistents).");
        applyColorSpan(spannableString2, "Cristina Sánchez", R.color.red);
        applyColorSpan(spannableString2, "Classe oberta d'Afrobeat amb el Jordi Maho!", R.color.red);

        SpannableString spannableString3 = new SpannableString("Cristina Sánchez assistirà a Classe oberta de Pilates amb la Lara Fontana! (1 assistents).");
        applyColorSpan(spannableString3, "Cristina Sánchez", R.color.red);
        applyColorSpan(spannableString3, "Classe oberta de Pilates amb la Lara Fontana!", R.color.red);

        SpannableString spannableString4 = new SpannableString("Cristina Sánchez assistirà a Classe oberta de Pilates amb la Lara Fontana! (1 assistents).");
        applyColorSpan(spannableString4, "Cristina Sánchez", R.color.red);
        applyColorSpan(spannableString4, "Classe oberta de Pilates amb la Lara Fontana!", R.color.red);

        txtview1.setText(spannableString);
        txtview2.setText(spannableString1);
        txtview3.setText(spannableString2);
        txtview4.setText(spannableString3);
        txtview5.setText(spannableString4);

    }
    //Metodo para cambiar el color de los textos
    private void applyColorSpan(SpannableString spannableString, String textToHighlight, int color) {
        int startIndex = spannableString.toString().indexOf(textToHighlight);
        int endIndex = startIndex + textToHighlight.length();
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(getResources().getColor(color));
        spannableString.setSpan(colorSpan, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
    }

}