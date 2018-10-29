package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SurvivalDashboard2 extends AppCompatActivity {

    ImageButton btnDashAlam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survival_dashboard2);

        btnDashAlam = findViewById(R.id.btnDashAlam);
        btnDashAlam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alami = new Intent(SurvivalDashboard2.this, ContentAlam.class);
                startActivity(alami);
            }
        });
    }
}
