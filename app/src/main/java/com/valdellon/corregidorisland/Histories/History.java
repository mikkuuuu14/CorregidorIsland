package com.valdellon.corregidorisland.Histories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.valdellon.corregidorisland.CGL.Camera;
import com.valdellon.corregidorisland.CGL.Gallery;
import com.valdellon.corregidorisland.MapsActivity;
import com.valdellon.corregidorisland.R;

public class History extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button1:
                startActivity(new Intent(this,About.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this,War.class));
                break;
            case R.id.button3:
                startActivity(new Intent(this,Ruins.class));
                break;

        }

    }
}
