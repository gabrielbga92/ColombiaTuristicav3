package gabrielgarcia.popav3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



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


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        int flag=0;
        Intent i = getIntent();
        int flag2 = i.getIntExtra("key",flag);

        switch (flag2){
            case 0:{
                LatLng inicio = new LatLng(2.433, -76.617);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(inicio));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(inicio, 15));
                mMap.addMarker(new MarkerOptions().position(inicio).title("Popayán").snippet("Cauca"));
                mMap.setMyLocationEnabled(true);
            }
            break;
            case 1:{
                LatLng dann = new LatLng(2.444505, -76.609367);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(dann));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dann, 15));
                mMap.addMarker(new MarkerOptions().position(dann).title("Dan Monasterio").snippet("Hotel"));
                mMap.setMyLocationEnabled(true);
            }
            break;
            case 2:{
                LatLng plazuela = new LatLng(2.442276, -76.608073);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(plazuela));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(plazuela, 15));
                mMap.addMarker(new MarkerOptions().position(plazuela).title("La Plazuela").snippet("Hotel"));
                mMap.setMyLocationEnabled(true);
            }
            break;
            case 3:{
                LatLng balcones = new LatLng(2.443611, -76.606190);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(balcones));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(balcones, 15));
                mMap.addMarker(new MarkerOptions().position(balcones).title("Los Balcones de Popayán").snippet("Hotel"));
                mMap.setMyLocationEnabled(true);
            }
            break;
            case 4:{
                LatLng malabar = new LatLng(2.443285, -76.604326);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(malabar));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(malabar, 15));
                mMap.addMarker(new MarkerOptions().position(malabar).title("Malabar").snippet("Bar"));
                mMap.setMyLocationEnabled(true);
            }
            break;
            case 5:{
                LatLng boggie = new LatLng(2.455027, -76.597496);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(boggie));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(boggie, 15));
                mMap.addMarker(new MarkerOptions().position(boggie).title("Boggie Boggie").snippet("Café"));
                mMap.setMyLocationEnabled(true);
            }
            break;
            case 6:{
                LatLng vinilo = new LatLng(2.443125, -76.606400);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(vinilo));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(vinilo, 15));
                mMap.addMarker(new MarkerOptions().position(vinilo).title("Vinilo").snippet("Retro Bar"));
                mMap.setMyLocationEnabled(true);
            }
            break;
            case 7:{
                LatLng puente = new LatLng(2.444531, -76.605142);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(puente));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(puente, 15));
                mMap.addMarker(new MarkerOptions().position(puente).title("Puente del Humilladero").snippet("Turismo"));
                mMap.setMyLocationEnabled(true);
            }
            break;
            case 8:{
                LatLng torre = new LatLng(2.441750, -76.606818);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(torre));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(torre, 15));
                mMap.addMarker(new MarkerOptions().position(torre).title("Torre del Reloj").snippet("Turismo"));
                mMap.setMyLocationEnabled(true);
            }
            break;
            case 9:{
                LatLng museo = new LatLng(2.442339, -76.609275);
                mMap.moveCamera(CameraUpdateFactory.newLatLng(museo));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museo, 15));
                mMap.addMarker(new MarkerOptions().position(museo).title("Casa Museo Guillermo Leon Valencia").snippet("Turismo"));
                mMap.setMyLocationEnabled(true);
            }
            break;

        }
    }
}