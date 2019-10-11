package com.example.myintenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Data1Activity extends AppCompatActivity implements View.OnClickListener {
    EditText setData;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data1);

        setData = findViewById(R.id.et_data);
        btnNext = findViewById(R.id.btn_input);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_input) {
            String preet = setData.getText().toString();
            if (TextUtils.isEmpty(preet)) {
                setData.setError("Kimprung yukss naxcal");
            } else {
                Intent pp = new Intent(this, Data2Activity.class);
                pp.putExtra(Data2Activity.EXTRA_DATA, preet);
                startActivity(pp);
            }
        }
    }
}
