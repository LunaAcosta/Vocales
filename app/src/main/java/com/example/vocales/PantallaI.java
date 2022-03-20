package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PantallaI extends AppCompatActivity {

    private ImageView panI;
    private Button conI;
    private MediaPlayer aduI;
    private MediaPlayer aduI2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_i);

        panI=findViewById(R.id.imagi);
        conI=findViewById(R.id.btni);
        aduI=MediaPlayer.create(this,R.raw.vocal_i);
        aduI2=MediaPlayer.create(this, R.raw.clic_02);

        panI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aduI.start();
            }
        });
        conI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nuevaPantalla = new Intent(getApplicationContext(),PantallaO.class);
                startActivity(nuevaPantalla);
                aduI2.start();
            }
        });


    }
}