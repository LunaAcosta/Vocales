package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PantallaE extends AppCompatActivity {
    private ImageView E;
    private Button seguire;
    private MediaPlayer mp3;
    private MediaPlayer volE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_e);

        E=findViewById(R.id.imag2);
        seguire=findViewById(R.id.btnE);
        mp3=MediaPlayer.create(this, R.raw.clic_02);
        volE=MediaPlayer.create(this, R.raw.vocal_e);


        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                volE.start();
            }
        });
        seguire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nuevaPantalla = new Intent(getApplicationContext(),PantallaI.class);
                startActivity(nuevaPantalla);
                mp3.start();
            }
        });






    }
}