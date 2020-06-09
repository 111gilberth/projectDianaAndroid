package com.example.firebasedianapp;

import android.os.Bundle;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;


public class splashActivity extends AppCompatActivity{
    /*aqui creamos el metodo para setear el splashscreen*/
    @Override
    protected void onCreate(Bundle savedInstanceState){
        /*inicializamos la actividad*/
        super.onCreate(savedInstanceState);
        /*seteamos el contenido dentro de nuestra actividad(XML) que hemos creado que cargue el splash*/
        setContentView(R.layout.activity_splash);
        /*Creamos un nuevo objeto de tipo Timer y tambien otro de tipo TimerTask*/
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                /*inciamos la actividad con un intento dentro de nuestra clase splashActivity que contiene nuestra actividad creada
                * que tiene el splash
                * posterior a eso cuando termine el splash se va inicializar la clase principal que tenemos*/
                startActivity(new Intent(splashActivity.this, MainActivity.class));
                /*finaliza el timer*/
                finish();
            }
            /*tiempo de espera*/
        }, 3000);
    }
}
