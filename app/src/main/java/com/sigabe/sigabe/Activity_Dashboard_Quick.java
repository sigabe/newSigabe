package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Activity_Dashboard_Quick extends AppCompatActivity {

    Button btnQuick;
    ImageButton btnGempa, btnCalling, btnMessage;
    EditText textSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__dashboard__quick);

        btnQuick = (Button)findViewById(R.id.btnHelp);
        btnQuick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learn = new Intent(Activity_Dashboard_Quick.this, Activity_Dashboard_Learn.class);
                startActivity(learn);
            }
        });
        btnGempa = (ImageButton) findViewById(R.id.btnGempa);
        btnGempa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gempa = new Intent(Activity_Dashboard_Quick.this, QuickLearnGempa.class);
                startActivity(gempa);
            }
        });
        btnCalling = (ImageButton) findViewById(R.id.btnCall);
        btnCalling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calling = new Intent(Activity_Dashboard_Quick.this, Emergency_Call.class);
                startActivity(calling);
            }
        });
        btnMessage = (ImageButton) findViewById(R.id.btnPesan);
        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pesan = new Intent(Activity_Dashboard_Quick.this, TanyaJawab.class);
                startActivity(pesan);
            }
        });

        textSearch = (EditText) findViewById(R.id.input);
    }
}
