package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.myapplication.Profile.Profile;
import com.example.myapplication.Fragments.FirstFragment;
import com.example.myapplication.Fragments.FourthFragment;
import com.example.myapplication.Fragments.SecondFragment;
import com.example.myapplication.Fragments.ThirdFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class EmptyActivity extends AppCompatActivity {
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        profile();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new FirstFragment()).commit();
        }
    }

    private void profile() {
        ImageButton f=findViewById(R.id.profile);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Profile()).commit();
            }
        });
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.home:
                            selectedFragment = new FirstFragment();
                            break;
                        case R.id.pay:
                            selectedFragment = new SecondFragment();
                            break;
                        case R.id.history:
                            selectedFragment = new ThirdFragment();
                            break;
                        case R.id.dialogs:
                            selectedFragment = new FourthFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };

}