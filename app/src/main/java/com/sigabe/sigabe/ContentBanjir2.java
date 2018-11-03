package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContentBanjir2 extends AppCompatActivity {
    TextView txtGoing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_banjir2);
        txtGoing = findViewById(R.id.befBanjir);
        txtGoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent befBanjir = new Intent(ContentBanjir2.this, ContentBanjir.class);
                startActivity(befBanjir);
            }
        });
    }
}
