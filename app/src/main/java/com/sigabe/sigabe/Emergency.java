package com.sigabe.sigabe;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD

public class Emergency extends Fragment {

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_emergency,null);
=======
import android.widget.EditText;
import android.widget.ImageButton;

public class Emergency extends Fragment {

    ImageButton btnGempa, btnBanjir,  btnCalling, btnMessage;
    EditText textSearch;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstance){
        return inflater.inflate(R.layout.activity_emergency,null );
>>>>>>> a538ad78be72185aed63f97add3ca7b15410fa1b
    }
}
