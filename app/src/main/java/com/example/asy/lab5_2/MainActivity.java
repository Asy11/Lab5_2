package com.example.asy.lab5_2;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {
// AIzaSyDBwzLXZQSlB5KqKW86Vb3mBGUBijYZ6gY

    static final LatLng SEOUL = new LatLng( 37.56, 126.97);
    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        Marker seoul = map.addMarker(new MarkerOptions().position(SEOUL).title("Seoul"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(SEOUL, 15));
        map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
    }
}