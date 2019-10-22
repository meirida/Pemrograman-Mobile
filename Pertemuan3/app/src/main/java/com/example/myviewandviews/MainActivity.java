package com.example.myviewandviews;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button rida;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    rida = findViewById(R.id.Donasi);
    rida.setOnClickListener(this);
    }
    @Override
    public void onClick (View v){
        if (v.getId() == R.id.Donasi) {
            Intent Ridaxxxzz = new Intent(this, DonasiActivity.class);
            startActivity(Ridaxxxzz);
        }
    }
}