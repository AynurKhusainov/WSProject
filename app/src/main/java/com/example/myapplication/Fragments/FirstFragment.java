package com.example.myapplication.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.Profile.Profile;
import com.example.myapplication.R;

public class FirstFragment extends Fragment {
    View v;
    ImageButton f;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_first, container, false);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new Profile()).commit();
            }
        });
        ImageButton CardBut= v.findViewById(R.id.thirdButton);
        ImageButton CardButSec= v.findViewById(R.id.thirdButtonSecondCard);
        ImageButton CardButThird= v.findViewById(R.id.thirdButtonThirdCard);

        CardBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new ThirdFragment()).commit();
            }
        });

        CardButSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new ThirdFragment()).commit();
            }
        });

        CardButThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new ThirdFragment()).commit();
            }
        });

        return v;
    }



}
