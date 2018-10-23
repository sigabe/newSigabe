package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContentBakar2 extends AppCompatActivity {

    Button btnSaatBakar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_bakar2);

        btnSaatBakar = findViewById(R.id.btnTerjadiBakar2);
        btnSaatBakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bakar2 = new Intent(ContentBakar2.this, ContentKebakaran.class);
                startActivity(bakar2);
            }
        });
    }
}
