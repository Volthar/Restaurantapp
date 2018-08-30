package com.restaurantapp.sebas;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    private static final String whatsApp = "com.whatsapp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void consultarUbicacion(View v) {

        Intent intencion = new Intent(this , MapsActivity.class);

        startActivity(intencion);

    }
    void consultarMenu(View v) {

        Intent intencion = new Intent(this , CartaActivity.class);

        startActivity(intencion);

    }
    void reservarMesa(View v) {

        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage(whatsApp);
        startActivity(intent);

    }
    void calificarServicio(View v) {

        Intent intencion = new Intent(this , CalificarActivity.class);

        startActivity(intencion);

    }
}
