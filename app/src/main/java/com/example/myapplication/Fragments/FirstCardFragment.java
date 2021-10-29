package com.example.myapplication.Fragments;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.transition.Visibility;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.example.myapplication.Banks.Banks;
import com.example.myapplication.R;

public class FirstCardFragment extends Fragment {

    static View v;
    View  viewAlert;
    Button buttonSave;
    ProgressBar progressBarDataUser;
    AlertDialog alertDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if(v == null)
            v= inflater.inflate(R.layout.fragment_first_card, container, false);

        ImageButton history=v.findViewById(R.id.historyOperation);

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Banks.class));
            }
        });
        ImageButton block=v.findViewById(R.id.Block);

        block.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), R.style.Theme_MyAlertDialog);
                LayoutInflater inflater = getLayoutInflater();
                viewAlert = inflater.inflate(R.layout.profile_alert_dialog, null);
                buttonSave = viewAlert.findViewById(R.id.butSaveChangeDate);
                progressBarDataUser = viewAlert.findViewById(R.id.progressBar);
                builder.setView(viewAlert).setCancelable(true);
                alertDialog = builder.create();
                alertDialog.show();

                buttonSave.setOnClickListener(vSave -> {

                    RelativeLayout s = FirstCardFragment.v.findViewById(R.id.cardbank);
                    s.setVisibility(View.GONE);

                    alertDialog.dismiss();
                });
            }
        });


        ImageButton rename=v.findViewById(R.id.Rename);

        rename.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), R.style.Theme_MyAlertDialog);
                LayoutInflater inflater = getLayoutInflater();
                viewAlert = inflater.inflate(R.layout.profile_alert_dialog, null);
                buttonSave = viewAlert.findViewById(R.id.butSaveChangeDate);
                progressBarDataUser = viewAlert.findViewById(R.id.progressBar);
                builder.setView(viewAlert).setCancelable(true);
                alertDialog = builder.create();
                alertDialog.show();

                buttonSave.setOnClickListener(vSave -> {
                    alertDialog.dismiss();
                });
            }
        });


        return v;
    }
}