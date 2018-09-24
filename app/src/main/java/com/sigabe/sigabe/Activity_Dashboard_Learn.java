package com.sigabe.sigabe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Dashboard_Learn extends AppCompatActivity {

    Button btnBelajar;
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
    }
}
