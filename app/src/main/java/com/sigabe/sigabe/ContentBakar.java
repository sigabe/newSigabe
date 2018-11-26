package com.sigabe.sigabe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ContentBakar extends AppCompatActivity {

    TextView afBakar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_terbakar);

        afBakar = findViewById(R.id.afKebakaran);
        afBakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kebakaran = new Intent(ContentBakar.this, ContentBakar2.class);
                startActivity(kebakaran);
            }
        });
    }
}
