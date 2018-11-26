package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContentBakar2 extends AppCompatActivity {

    TextView befBakar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_terbakar2);

        befBakar = findViewById(R.id.befKebakaran);
        befBakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kebakaran2 = new Intent(ContentBakar2.this, ContentBakar.class);
                startActivity(kebakaran2);
            }
        });
    }
}
