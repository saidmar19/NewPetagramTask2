package com.saidmar.newpetagram;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.saidmar.newpetagram.adapter.MascotasAdapter;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;
    public MascotasAdapter adaptador;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);
        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listaMascotas = (RecyclerView) findViewById(R.id.rv_mascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);


        iniciarListaMascotas();


        inicializarAdapter();

    }

    public void inicializarAdapter(){
        //creo un objeto del tipo contacto adaptador y tiene que recibir mi lista de contactos
        adaptador = new MascotasAdapter(mascotas,this);
        listaMascotas.setAdapter(adaptador); //el recycler view contiene el adaptador
    }

    public void agregarFAB(){
        FloatingActionButton miFAB = (FloatingActionButton)findViewById(R.id.fab_MiFAB);
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //los toats ya no se usan
                Toast.makeText(getBaseContext(), getResources().getString(R.string.mensaje), Toast.LENGTH_SHORT).show();


            }
        });
    }

    public void iniciarListaMascotas(){

        //instancear mi arraylist para pdoer llenar la lista (ES NECESARIO)
        mascotas = new ArrayList<Mascotas>();



        //agrgamos las mascotas a la lista
        mascotas.add(new Mascotas(R.drawable.pikachu,"Max","5"));
        mascotas.add(new Mascotas(R.drawable.ratoncito,"Mickey","4"));
        mascotas.add(new Mascotas(R.drawable.gatito,"Flufy","6"));
        mascotas.add(new Mascotas(R.drawable.sombrerogatito,"Suzy","10"));
        mascotas.add(new Mascotas(R.drawable.perrito,"Spike","3"));

        /*
         //agrgamos las mascotas a la lista
        mascotas.add(new Mascotas(R.drawable.gatito,"Flufy","6"));
        mascotas.add(new Mascotas(R.drawable.perrito,"Spike","3"));
        mascotas.add(new Mascotas(R.drawable.pikachu,"Max","5"));
        mascotas.add(new Mascotas(R.drawable.sombrerogatito,"Suzy","10"));
        mascotas.add(new Mascotas(R.drawable.ratoncito,"Mickey","4"));
         */
    }

}
