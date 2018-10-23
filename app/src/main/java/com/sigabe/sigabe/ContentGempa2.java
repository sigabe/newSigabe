package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContentGempa2 extends AppCompatActivity {

    Button btnSaatGempa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_gempa2);

        btnSaatGempa = findViewById(R.id.btnTerjadiGempa2);
        btnSaatGempa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gempa2 = new Intent(ContentGempa2.this, ContentGempa.class);
                startActivity(gempa2);
            }
        });
    }
}
