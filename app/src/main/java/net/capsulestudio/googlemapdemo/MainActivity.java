package net.capsulestudio.googlemapdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void simpleMap(View view) {
        startActivity(new Intent(getApplicationContext(), SimpleGoogleMapActivity.class));
    }

    public void markerAndPoi(View view) {
        startActivity(new Intent(getApplicationContext(), SecondMapActivity.class));
    }

    public void mapStyleAndOverlay(View view) {
        startActivity(new Intent(getApplicationContext(), ThirdMapActivity.class));
    }

    public void currentLocationTracking(View view) {
        startActivity(new Intent(getApplicationContext(), FourthMapActivity.class));
    }

    public void currentLocationLatLong(View view) {
        startActivity(new Intent(getApplicationContext(), FifthMapActivity.class));
    }


}
