package com.example.myviewandviews;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DonasiActivity extends AppCompatActivity {
    private Button cok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donasi);

        cok=findViewById(R.id.colll);
        cok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }
    private void showDialog(){
        AlertDialog.Builder alarm =new AlertDialog.Builder(this);
        alarm.setTitle("Kesuwun Lur Bantuane");
        alarm
                .setMessage("Terima Kasih Donasinya Yahh :)")
                .setIcon(R.drawable.logo)
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        DonasiActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alerm =alarm.create();
        alerm.show();
    }
}
