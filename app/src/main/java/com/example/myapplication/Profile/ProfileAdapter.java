package com.example.myapplication.Profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Banks.BankModel;
import com.example.myapplication.R;

import java.util.ArrayList;

public class ProfileAdapter extends ArrayAdapter<ProfileModel>  {


    public ProfileAdapter(Context context, ArrayList<ProfileModel> profileModelArrayList) {
        super(context, R.layout.profile_items,profileModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ProfileModel profileModel = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.profile_items,parent,false);

        }
        TextView userName = convertView.findViewById(R.id.name);

        userName.setText(profileModel.name);

        return convertView;

    }
}
