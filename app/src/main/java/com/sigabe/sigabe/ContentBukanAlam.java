package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ContentBukanAlam extends AppCompatActivity {

    ImageButton btnJatuh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_bukan_alam);

        btnJatuh = findViewById(R.id.btnJatuh);
        btnJatuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jatuh = new Intent(ContentBukanAlam.this, ContentJatuh.class);
                startActivity(jatuh);
            }
        });
    }
}
