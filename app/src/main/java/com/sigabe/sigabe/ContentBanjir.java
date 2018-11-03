package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ContentBanjir extends AppCompatActivity {

    TextView txtAfter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_banjir);

        txtAfter = findViewById(R.id.afBanjir);
        txtAfter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent afBanjir = new Intent(ContentBanjir.this, ContentBanjir2.class);
                startActivity(afBanjir);
            }
        });
    }
}
