package com.example.noemiweswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Professors extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<MyData> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professors);

        // Obtener la referencia al RecyclerView desde el layout
        recyclerView = findViewById(R.id.recyclerProfessors);

        // Configurar el administrador de diseño (LayoutManager)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Crear la lista de datos
        dataList = new ArrayList<>();
        // Agregar los objetos de datos a la lista
        dataList.add(new MyData(R.drawable.bailando, "Martynas Balciunas", ""));
        dataList.add(new MyData(R.drawable.usuario, "Marina Feliu", ""));
        dataList.add(new MyData(R.drawable.bailando, "Jordi Mundet", ""));
        dataList.add(new MyData(R.drawable.usuario, "Lorena Medina Pulido", ""));
        dataList.add(new MyData(R.drawable.bailando, "Jaume De Francisco Guiu", ""));
        dataList.add(new MyData(R.drawable.usuario, "Jana Grulichova", ""));
        dataList.add(new MyData(R.drawable.bailando, "Joan-Marc Comalada", ""));


        // Crear el adaptador personalizado y pasar la lista de datos
        adapter = new MyAdapter(dataList);

        // Establecer el adaptador en el RecyclerView
        recyclerView.setAdapter(adapter);
    }
}