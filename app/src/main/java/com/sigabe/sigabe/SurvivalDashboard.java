package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SurvivalDashboard extends AppCompatActivity {

    ImageButton btnNonAlam,btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survival_dashboard);

        btnNext = findViewById(R.id.btnNext);
        btnNonAlam = findViewById(R.id.btnNonAlam);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(SurvivalDashboard.this, SurvivalDashboard2.class);
                startActivity(next);
            }
        });

        btnNonAlam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent content = new Intent(SurvivalDashboard.this, ContentBukanAlam.class);
                startActivity(content);
            }
        });
    }
}
