package com.example.recyclerview;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerview.Adapter.CarAdapter;
import com.example.recyclerview.Entidades.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerViewNames = findViewById(R.id.carId);
        recyclerViewNames.setHasFixedSize(true);

        LinearLayoutManager linearManager = new  LinearLayoutManager(getApplicationContext());
        recyclerViewNames.setLayoutManager(linearManager);

        List<Pelicula> data = ListaPeliculas();

        CarAdapter carAdapter = new CarAdapter(data);

        recyclerViewNames.setAdapter(carAdapter);
    }
    private List<Pelicula> ListaPeliculas(){

        List<Pelicula> peliculas = new ArrayList<>();

        Pelicula pelicula1 = new Pelicula("Avengers","La tetralogía de Los Vengadores es una franquicia de cuatro películas que se inició en el año 2012 con la película The Avengers y finalizó con Avengers");

        Pelicula pelicula2 = new Pelicula("Transformers","Transformers es una película de acción y ciencia ficción estadounidense de 2007 basada en la línea de juguetes de Transformers.");

        peliculas.add(pelicula1);
        peliculas.add(pelicula2);

        return  peliculas;
    }
}
