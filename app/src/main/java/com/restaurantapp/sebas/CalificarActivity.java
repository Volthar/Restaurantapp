package com.restaurantapp.sebas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CalificarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificar);
    }
        void calificarServicio(View v) {

            Intent intencion = new Intent(this, CalificarServicioActivity.class);
            startActivity(intencion);

        }
        void calificarPlato(View v) {

            Intent intencion = new Intent(this, CalificarPlatoActivity.class);
            startActivity(intencion);

        }

    }

