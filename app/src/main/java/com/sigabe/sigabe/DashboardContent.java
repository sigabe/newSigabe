package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DashboardContent extends AppCompatActivity {
    TextView textSos;
    LinearLayout btnBanjir;
    LinearLayout btnGempa;
    LinearLayout btnKebakaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_content);
        textSos = findViewById(R.id.tx2);
        textSos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sosial = new Intent(DashboardContent.this, DashboardSosial.class);
                startActivity(sosial);
            }
        });
        btnBanjir = findViewById(R.id.btnBanjir);
        btnBanjir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent banjir = new Intent(DashboardContent.this, ContentBanjir.class);
                startActivity(banjir);
            }
        });
        btnGempa = findViewById(R.id.btnGempa);
        btnGempa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gempa = new Intent(DashboardContent.this, ContentGempa.class);
                startActivity(gempa);
            }
        });
        btnKebakaran = findViewById(R.id.btnKebakaran);
        btnKebakaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kebakaran = new Intent(DashboardContent.this, ContentBakar.class);
                startActivity(kebakaran);
            }
        });
    }
}
