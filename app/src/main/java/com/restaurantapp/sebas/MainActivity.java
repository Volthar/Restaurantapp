package com.restaurantapp.sebas;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {



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

        try {
            String text = "Buen día, quisiera reservar una mesa con ustedes.";// Replace with your message.

            String toNumber = "3216549870"; // Replace with mobile phone number without +Sign or leading zeros.


            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text));
            startActivity(intent);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



    void calificarServicio(View v) {

        Intent intencion = new Intent(this , CalificarActivity.class);

        startActivity(intencion);

    }
}
