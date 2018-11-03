package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DashboardSosial extends AppCompatActivity {
    TextView textAlam;
    LinearLayout btnJatuh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_sosial);
        textAlam = findViewById(R.id.tx1);
        textAlam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sosial = new Intent(DashboardSosial.this, DashboardContent.class);
                startActivity(sosial);
            }
        });
        btnJatuh = findViewById(R.id.btnJatuh);
        btnJatuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jatuh = new Intent(DashboardSosial.this, ContentJatuh.class);
                startActivity(jatuh);
            }
        });
    }
}
