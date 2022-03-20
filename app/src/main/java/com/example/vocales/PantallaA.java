package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PantallaA extends AppCompatActivity {

    private Button seguirE;
    private MediaPlayer vocalA;
    private MediaPlayer mp;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla);

        seguirE=findViewById(R.id.btnseguirE);
        img=findViewById(R.id.imagen);
        mp=MediaPlayer.create(this, R.raw.clic_02);
        vocalA=MediaPlayer.create(this,R.raw.vocal_a);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vocalA.start();
            }
        });

        seguirE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nuevaPantalla = new Intent(getApplicationContext(),PantallaE.class);
                startActivity(nuevaPantalla);
                mp.start();
            }
        });
    }
}