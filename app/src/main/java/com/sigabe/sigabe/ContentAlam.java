package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ContentAlam extends AppCompatActivity {

    ImageButton btnKebanjiran,btnGempaBumi,btnKebakaran,btnPBeliung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_alam);

        btnKebanjiran = findViewById(R.id.btnKebanjiran);
        btnKebanjiran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent banjir = new Intent(ContentAlam.this, ContentBanjir.class);
                startActivity(banjir);
            }
        });

        btnGempaBumi = findViewById(R.id.btnGempaBumi);
        btnGempaBumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gempa = new Intent(ContentAlam.this, ContentGempa.class);
                startActivity(gempa);
            }
        });

        btnKebakaran = findViewById(R.id.btnKebakaran);
        btnKebakaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bakar = new Intent(ContentAlam.this, ContentKebakaran.class);
                startActivity(bakar);
            }
        });

        btnPBeliung = findViewById(R.id.btnPBeliung);
        btnPBeliung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beliung = new Intent(ContentAlam.this, ContentBeliung.class);
                startActivity(beliung);
            }
        });
    }
}
