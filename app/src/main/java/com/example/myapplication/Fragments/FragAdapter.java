package com.example.myapplication.Fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragAdapter extends FragmentStateAdapter {
    public FragAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position)
        {
            case 1 :
                return new SecondCardFragment();
            case 2 :
                return new ThirdCardFragment();
        }

        return new FirstCardFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}