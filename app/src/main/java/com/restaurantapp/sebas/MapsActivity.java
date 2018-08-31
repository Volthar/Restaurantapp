package com.restaurantapp.sebas;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng medellin = new LatLng(6.1506, -75.3348);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(medellin));

        // Add a marker in Laureles
        LatLng laureles = new LatLng(6.248508, -75.594624);
        mMap.addMarker(new MarkerOptions().position(laureles).title("Marker in Laureles"));

        // Add a marker in Ciudad del Río
        LatLng poblado = new LatLng(6.223073, -75.574629);
        mMap.addMarker(new MarkerOptions().position(poblado).title("Marker in Ciudad del Río"));

        LatLng envigado = new LatLng(6.168136, -75.588732);
        mMap.addMarker(new MarkerOptions().position(envigado).title("Marker in Envigado"));



    }


}
