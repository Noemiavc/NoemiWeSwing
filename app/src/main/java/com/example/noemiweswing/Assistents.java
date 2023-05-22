package com.example.noemiweswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Assistents extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<MyData> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistents);

        // Obtener la referencia al RecyclerView desde el layout
        recyclerView = findViewById(R.id.recyclerProfessors);

        // Configurar el administrador de diseño (LayoutManager)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Crear la lista de datos
        dataList = new ArrayList<>();
        // Agregar los objetos de datos a la lista
        dataList.add(new MyData(R.drawable.usuario, "Alba Cas Lemonhop", "Dancer"));
        dataList.add(new MyData(R.drawable.usuario, "Angela Mena Also", "Dancer"));
        dataList.add(new MyData(R.drawable.usuario, "Jana Grulichova", "Professor"));
        dataList.add(new MyData(R.drawable.usuario, "Jazmin Olave", "Dancer"));
        dataList.add(new MyData(R.drawable.usuario, "Neus Castells Marcé", "Professor"));


        // Crear el adaptador personalizado y pasar la lista de datos
        adapter = new MyAdapter(dataList);

        // Establecer el adaptador en el RecyclerView
        recyclerView.setAdapter(adapter);
    }
}

