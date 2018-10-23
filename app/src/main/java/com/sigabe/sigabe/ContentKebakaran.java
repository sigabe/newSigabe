package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContentKebakaran extends AppCompatActivity {

    Button btnSetelahBakar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_kebakaran);

        btnSetelahBakar = findViewById(R.id.btnAfterBakar);
        btnSetelahBakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bakar = new Intent(ContentKebakaran.this, ContentBakar2.class);
                startActivity(bakar);
            }
        });
    }
}
