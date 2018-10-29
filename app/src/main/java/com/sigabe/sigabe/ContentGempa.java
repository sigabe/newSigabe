package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContentGempa extends AppCompatActivity {

    Button btnSetelahGempa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_gempa);

        btnSetelahGempa = findViewById(R.id.btnAfterGempa);
        btnSetelahGempa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gempa = new Intent(ContentGempa.this, ContentGempa2.class);
                startActivity(gempa);
            }
        });
    }
}
