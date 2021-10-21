package com.example.myapplication.HomeList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.R;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Models> {
    public ListAdapter(Context context, ArrayList<Models> modelsArrayList) {
        super(context, R.layout.activity_home_items,modelsArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Models models=getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_home_items,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.profile_pic);
        TextView userName = convertView.findViewById(R.id.personName);
        TextView lastMsg = convertView.findViewById(R.id.lastMessage);
        TextView time = convertView.findViewById(R.id.msgtime);

        imageView.setImageResource(models.imageId);
        userName.setText(models.name);
        lastMsg.setText(models.lastMessage);
        time.setText(models.lastMsgTime);

        return convertView;
    }
}
