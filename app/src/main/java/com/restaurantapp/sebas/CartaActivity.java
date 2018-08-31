package com.restaurantapp.sebas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class CartaActivity extends Activity {

    ListView lista;


    String [] productos = new String[] {"Entradas", "Platos Fuertes", "Bebidas", "Postres"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta);

        lista = (ListView) findViewById(android.R.id.list);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, productos);

        lista.setAdapter(adaptador);
        //ListAdapter la = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, productos);

    }
}
