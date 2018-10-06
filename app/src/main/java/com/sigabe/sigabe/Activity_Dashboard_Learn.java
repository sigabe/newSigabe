package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_Dashboard_Learn extends AppCompatActivity {

    Button btnBelajar;
    ImageButton btnGempa2, btnCalling, btnMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__dashboard__learn);

        btnBelajar = (Button)findViewById(R.id.btnLearn);
        btnBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quick = new Intent(Activity_Dashboard_Learn.this, Activity_Dashboard_Quick.class);
                startActivity(quick);
            }
        });
//        btnCalling = (ImageButton) findViewById(R.id.btnCall);
//        btnCalling.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent calling = new Intent(Activity_Dashboard_Learn.this, Emergency_Call.class);
//                startActivity(calling);
//            }
//        });
//        btnMessage = (ImageButton) findViewById(R.id.btnPesan);
//        btnMessage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent pesan = new Intent(Activity_Dashboard_Learn.this, TanyaJawab.class);
//                startActivity(pesan);
//            }
//        });
    }
}
