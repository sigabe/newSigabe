package com.sigabe.sigabe;

<<<<<<< HEAD
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
=======
<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> a538ad78be72185aed63f97add3ca7b15410fa1b
>>>>>>> 9f1cafc53f9917984dab4d7bd3ac5425851ac219
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
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

import static android.content.Context.NOTIFICATION_SERVICE;

public class Dashboard extends Fragment {

    RelativeLayout btnTracking;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstance) {
        return inflater.inflate(R.layout.activity_dashboard, null);
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnTracking = (RelativeLayout) view.findViewById(R.id.rela1);

        btnTracking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MapsActivity.class);
                getActivity().startActivity(intent);
                showNotif();
            }
        });

    }

    private void showNotif() {
        NotificationManager notificationManager;

        Intent mIntent = new Intent(getActivity(), MapsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("fromnotif", "notif");
        mIntent.putExtras(bundle);
        PendingIntent pendingIntent = PendingIntent.getActivity(getActivity(), 0, mIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(getActivity());
        builder.setColor(getResources().getColor(R.color.colorAccent));
        builder.setContentIntent(pendingIntent)
                .setSmallIcon(R.drawable.ic_chat_black_24dp)
                .setLargeIcon(BitmapFactory.decodeResource(this.getResources(), R.drawable.ic_chat_black_24dp))
                .setTicker("notif starting")
                .setAutoCancel(true)
                .setVibrate(new long[]{1000, 1000, 1000, 1000, 1000})
                .setLights(Color.RED, 3000, 3000)
                .setDefaults(Notification.DEFAULT_SOUND)
                .setContentTitle("Notification Android")
                .setContentText("Sigabe");

<<<<<<< HEAD
        notificationManager = (NotificationManager) getActivity().getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(115, builder.build());
    }
}
=======
        }
>>>>>>> a538ad78be72185aed63f97add3ca7b15410fa1b
}
>>>>>>> 9f1cafc53f9917984dab4d7bd3ac5425851ac219
