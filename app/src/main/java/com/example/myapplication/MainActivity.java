package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Banks.Banks;
import com.example.myapplication.Valutes.Valute;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView cancel, add;
    TextView date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date = findViewById(R.id.date);
        String currentDateTimeString = java.text.DateFormat.getDateInstance().format(new Date());
        date.setText(currentDateTimeString);


    }

    public void kk(View view) {
        startActivity(new Intent(MainActivity.this, Banks.class));
    }

    public void ll(View view) {
        startActivity(new Intent(MainActivity.this, Valute.class));
    }

    public void onClick(View v) {

        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(this, R.style.Theme_MyAlertDialog);
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