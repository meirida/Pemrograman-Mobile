package com.example.myintenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMove, btnMoveData, btncall,btnweb,cuyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.btnMove);
        btnMove.setOnClickListener(this);

        btnMoveData = findViewById(R.id.btnMoveData);
        btnMoveData.setOnClickListener(this);

        btncall = findViewById(R.id.btnCall);
        btncall.setOnClickListener(this);

        btnweb =findViewById(R.id.btnWeb);
        btnweb.setOnClickListener(this);
        cuyy=findViewById(R.id.Intent);
        cuyy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMove:
                Intent moveActivity = new Intent(this,MoveActivity.class);
                startActivity(moveActivity);
                break;

            case R.id.btnMoveData:
                Intent moveDataActivity = new Intent(this, MoveDataActivity.class);
                moveDataActivity.putExtra(MoveDataActivity.EXTRA_NAME, "Khikma Mei Rida");
                moveDataActivity.putExtra(MoveDataActivity.EXTRA_AGE, 20);
                startActivity(moveDataActivity);
                break;
            case R.id.btnCall:
                String phone = "089512791321";
                Intent callIntent =new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+phone));
                startActivity(callIntent);
                break;
            case R.id.btnWeb:
                String url ="http://ittelkom-pwt.ac.id/";
                Intent browser =new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(browser);
                break;
            case R.id.Intent:
                Intent cokkk=new Intent(this,Data1Activity.class);
                startActivity(cokkk);
                break;
        }

    }
}
