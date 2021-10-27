package com.example.myapplication.Valutes;

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

public class ValAdapter extends ArrayAdapter<ValuteModel> {
    public ValAdapter(Context context, ArrayList<ValuteModel> valuteModelArrayList) {
        super(context, R.layout.valutes_item,valuteModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ValuteModel valuteModel=getItem(position);

        if (convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.valutes_item,parent,false);
        }
        ImageView imageView = convertView.findViewById(R.id.profile_pic);
        TextView userName = convertView.findViewById(R.id.personName);
        TextView lastMsg = convertView.findViewById(R.id.lastMessage);
        TextView time = convertView.findViewById(R.id.msgtime);

        imageView.setImageResource(valuteModel.imageId);
        userName.setText(valuteModel.name);
        lastMsg.setText(valuteModel.lastMessage);
        time.setText(valuteModel.lastMsgTime);

        return convertView;
    }
}
