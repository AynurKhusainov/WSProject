package com.example.myapplication.Profile;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.myapplication.Banks.Banks;
import com.example.myapplication.EmptyActivity;
import com.example.myapplication.Fragments.InformationFragment;
import com.example.myapplication.Fragments.ThirdFragment;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentFIveBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Profile extends Fragment {
    FragmentFIveBinding binding;
    View v;
    View  viewAlert;
    Button buttonSave;
    ProgressBar progressBarDataUser;
    AlertDialog alertDialog;


    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentFIveBinding.inflate(getLayoutInflater());
        v = inflater.inflate(R.layout.fragment_f_ive, container, false);
        View v = binding.getRoot();
        String[] name = {"Изменение пароля", "Изменение логина", "История посещений", "Информация о приложении", "Выход"};

        Button password=v.findViewById(R.id.password);

        password.setOnClickListener(new View.OnClickListener() {
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
        Button login=v.findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
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

        Button history=v.findViewById(R.id.history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Banks.class));
            }
        });

        Button f=v.findViewById(R.id.information);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new InformationFragment()).commit();
            }
        });

        Button exit=v.findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MainActivity.class));
            }
        });

        return v;
    }
}