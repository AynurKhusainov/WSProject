package com.example.myapplication;


import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.renderscript.RenderScript;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import com.example.myapplication.Banks.Banks;
import com.example.myapplication.Valutes.Valute;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView cancel, add;
    TextView date;


    //инициализация уведомления
    private NotificationManager notificationManager;
    private static final int NOTIFY_ID=1;
    private static final String CHANNEL_ID="CHANNEL_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date = findViewById(R.id.date);
        String Date = DateFormat.getDateInstance().format(new Date());
        date.setText(Date);


    }

    public void kk(View view) {

        notificationManager=(NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);



        //отложенный интент
        Intent i=new Intent(MainActivity.this, Banks.class);
        startActivity(i);

        //Создание уведомления
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
        PendingIntent pendingIntent=PendingIntent.getActivity(getApplicationContext(),
                0,i,PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder n
                =new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID)
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.museum)
                .setWhen(System.currentTimeMillis())
                .setContentIntent(pendingIntent)
                .setContentText("Какой то текст.........")
                .setContentTitle("Заголовок");
        createChannelINeeded(notificationManager);
        notificationManager.notify(NOTIFY_ID, n.build());

    }

    //метод какой то для уведомления
    private static void createChannelINeeded(NotificationManager manager){
        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
            NotificationChannel notificationChannel=new NotificationChannel(CHANNEL_ID,
                    CHANNEL_ID, NotificationManager.IMPORTANCE_DEFAULT);
            manager.createNotificationChannel(notificationChannel);
        }
    }

    public void ll(View view) {
        startActivity(new Intent(MainActivity.this, Valute.class));
    }

    public void onClick(View v) {

        androidx.appcompat.app.AlertDialog.Builder builder =
                new androidx.appcompat.app.AlertDialog.Builder(this, R.style.Theme_MyAlertDialog);
        LayoutInflater layoutInflater = getLayoutInflater();
        View viewAlert = layoutInflater.inflate(R.layout.alert_dialog_sign_in, null);
        builder.setView(viewAlert).setCancelable(true);
        AlertDialog alertDialog = builder.create();

        cancel = viewAlert.findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
        alertDialog.show();
    }

    public void ww(View view) {
        startActivity(new Intent(MainActivity.this, EmptyActivity.class));
    }
}