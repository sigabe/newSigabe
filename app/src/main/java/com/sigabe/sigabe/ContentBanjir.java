package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ContentBanjir extends AppCompatActivity {

    Button btnSetelahBanjir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_banjir);

        btnSetelahBanjir = findViewById(R.id.btnAfterBanjir);
        btnSetelahBanjir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent setelahBanjir = new Intent(ContentBanjir.this, ContentBanjir2.class);
                startActivity(setelahBanjir);
            }
        });
    }
}
