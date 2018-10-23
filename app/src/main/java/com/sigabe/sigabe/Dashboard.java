package com.sigabe.sigabe;

<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> a538ad78be72185aed63f97add3ca7b15410fa1b
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
import android.widget.ImageView;

public class Dashboard extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_dashboard, null);
    }
=======
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Dashboard extends Fragment {

        RelativeLayout btnTracking;
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstance){
            return inflater.inflate(R.layout.activity_dashboard,null );
        }

        public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            btnTracking = (RelativeLayout) view.findViewById(R.id.rela1);

            btnTracking.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), MapsActivity.class);
                    getActivity().startActivity(intent);
                }
            });

        }
>>>>>>> a538ad78be72185aed63f97add3ca7b15410fa1b
}
