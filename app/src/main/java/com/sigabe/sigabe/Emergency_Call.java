package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Emergency_Call extends AppCompatActivity {

    ImageButton btnBeranda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency__call);

        btnBeranda = (ImageButton) findViewById(R.id.btnHome);
        btnBeranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beranda = new Intent(Emergency_Call.this, Activity_Dashboard_Quick.class);
                startActivity(beranda);
            }
        });
    }
}
