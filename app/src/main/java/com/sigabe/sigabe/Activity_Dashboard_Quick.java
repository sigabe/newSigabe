package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Dashboard_Quick extends AppCompatActivity {

    Button btnQuick;
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
    }
}
