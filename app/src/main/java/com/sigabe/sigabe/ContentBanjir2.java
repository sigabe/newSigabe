package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContentBanjir2 extends AppCompatActivity {

    Button btnTerjadiBanjir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_banjir2);

        btnTerjadiBanjir = findViewById(R.id.btnTerjadiBanjir2);
        btnTerjadiBanjir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent terjadiBanjir = new Intent(ContentBanjir2.this, ContentBanjir.class);
                startActivity(terjadiBanjir);
            }
        });
    }
}
