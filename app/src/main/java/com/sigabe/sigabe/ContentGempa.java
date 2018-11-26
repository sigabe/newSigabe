package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContentGempa extends AppCompatActivity {

    TextView afGempa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_gemp);

        afGempa = findViewById(R.id.afGempa);
        afGempa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gempa = new Intent(ContentGempa.this, ContentGempa2.class);
                startActivity(gempa);
            }
        });
    }
}
