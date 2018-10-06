package com.sigabe.sigabe;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Emergency_Call extends Fragment{

    ImageButton btnBeranda, btnMessage;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstance){
        return inflater.inflate(R.layout.activity_emergency__call,null );
    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_emergency__call);
//
//        btnBeranda = (ImageButton) findViewById(R.id.btnHome);
//        btnBeranda.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent home = new Intent(Emergency_Call.this, Activity_Dashboard_Quick.class);
//                startActivity(home);
//            }
//        });
//        btnMessage = (ImageButton) findViewById(R.id.btnPesan);
//        btnMessage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent pesan = new Intent(Emergency_Call.this, TanyaJawab.class);
//                startActivity(pesan);
//            }
//        });
//    }
}
