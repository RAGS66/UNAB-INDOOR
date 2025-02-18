package com.indooratlas.android.sdk.examples;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.indooratlas.android.sdk.examples.foregroundservice.MainActivity;
import com.indooratlas.android.sdk.examples.wayfinding.WayfindingOverlayActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent= new Intent(SplashScreen.this, WayfindingOverlayActivity.class);
                startActivity(intent);
            }
        },4000);
    }
}
