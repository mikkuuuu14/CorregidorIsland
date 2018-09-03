package com.valdellon.corregidorisland.CGL;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.valdellon.corregidorisland.Histories.History;
import com.valdellon.corregidorisland.MapsActivity;
import com.valdellon.corregidorisland.R;

public class Gallery extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

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
                startActivity(new Intent(this,History.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this,Gallery.class));
                break;
            case R.id.button3:
                startActivity(new Intent(this,Gallery.class));
                break;

        }

    }
}
