package com.sigabe.sigabe;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Activity_Dashboard_Quick extends Fragment{

    Button btnQuick;
    ImageButton btnGempa, btnCalling, btnMessage;
    EditText textSearch;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstance){
        return inflater.inflate(R.layout.activity__dashboard__quick,null );
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnGempa = (ImageButton)view.findViewById(R.id.btnGempa);
        btnQuick = (Button)view.findViewById(R.id.btnHelp);

        btnGempa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), QuickLearnGempa.class);
                getActivity().startActivity(intent);
            }
        });
        btnQuick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Activity_Dashboard_Learn.class);
                getActivity().startActivity(intent);
            }
        });


    }

}
