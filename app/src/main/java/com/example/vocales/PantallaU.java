package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.time.Instant;

public class PantallaU extends AppCompatActivity {

    private ImageView imagU;
    private Button conU;
    private MediaPlayer audiU;
    private MediaPlayer audiU2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_u);

        imagU=findViewById(R.id.imagu);
        conU=findViewById(R.id.btnu);

        audiU= MediaPlayer.create(this,R.raw.vocal_u);
        audiU2=MediaPlayer.create(this,R.raw.clic_02);

        imagU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                audiU.start();
            }
        });
        conU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nuevaPantalla = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(nuevaPantalla);
                audiU2.start();
            }
        });
    }
}