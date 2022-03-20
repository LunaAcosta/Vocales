package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PantallaO extends AppCompatActivity {
    private ImageView imagenO;
    private Button conO;
    private MediaPlayer audiO;
    private MediaPlayer audiO2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_o);

        imagenO=findViewById(R.id.imago);
        conO=findViewById(R.id.btno);
        audiO=MediaPlayer.create(this,R.raw.vocal_o);
        audiO2=MediaPlayer.create(this,R.raw.clic_02);

        imagenO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                audiO.start();
            }
        });

        conO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nuevaPantalla = new Intent(getApplicationContext(),PantallaU.class);
                startActivity(nuevaPantalla);
                audiO2.start();
            }
        });

    }
}