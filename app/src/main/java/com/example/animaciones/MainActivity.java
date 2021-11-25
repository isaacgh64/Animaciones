package com.example.animaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button buttonRotar, buttonBotar, buttonZoom, buttonTransladar, buttonFade;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonRotar=findViewById(R.id.buttonRotar);
        buttonBotar=findViewById(R.id.buttonBotar);
        buttonZoom=findViewById(R.id.buttonZoom);
        buttonTransladar=findViewById(R.id.buttonTransladar);
        buttonFade=findViewById(R.id.buttonFade);
        imageView=findViewById(R.id.imageView);

        buttonRotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotarderecha);
                imageView.startAnimation(animation);
                imageView.startAnimation(animation);
            }
        });
        buttonBotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animacionbotar);
                imageView.startAnimation(animation);
                imageView.startAnimation(animation);
            }
        });
        buttonZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animacionzoom);
                imageView.startAnimation(animation);
                imageView.startAnimation(animation);
            }
        });
        buttonFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animacionfade);
                imageView.startAnimation(animation);
                imageView.startAnimation(animation);
            }
        });
        buttonTransladar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animaciontransladar);
                imageView.startAnimation(animation);
                imageView.startAnimation(animation);
            }
        });
    }
}