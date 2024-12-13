package com.arthur.traveller.activity

import android.Manifest
import android.content.pm.PackageManager

import android.os.Bundle


import androidx.appcompat.app.AppCompatActivity

import androidx.core.content.ContextCompat
import com.arthur.traveller.R

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        // Inicializa o mapa
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        enableUserLocation()  // Agora é seguro chamar isso após a inicialização do mMap

        val location = LatLng(-9.5682684755266, -35.7508179)
        mMap.addMarker(MarkerOptions().position(location).title("Marker in Maceió"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(location))
    }

    private fun enableUserLocation() {
        if (ContextCompat.checkSelfPermission(
                this, Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED) {
            mMap.isMyLocationEnabled = true
        }
    }
}

