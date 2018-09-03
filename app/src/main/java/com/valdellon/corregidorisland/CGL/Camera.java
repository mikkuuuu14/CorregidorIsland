package com.valdellon.corregidorisland.CGL;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.valdellon.corregidorisland.R;

public class Camera extends AppCompatActivity {

    android.hardware.Camera camera;
    FrameLayout frameLayout;
    ShowCamera showCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        frameLayout = (FrameLayout)findViewById(R.id.frameLayout);

    //Open Camera

        camera = android.hardware.Camera.open();
        showCamera = new ShowCamera(this, camera);
    }
}
