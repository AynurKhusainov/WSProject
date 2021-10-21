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

public class ListAdapterValutes extends ArrayAdapter<Person> {

    public ListAdapterValutes(Context context, ArrayList<Person> personArrayList){

        super(context, R.layout.bank_items,personArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Person person = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.bank_items,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.profile_pic);
        TextView userName = convertView.findViewById(R.id.personName);
        TextView lastMsg = convertView.findViewById(R.id.lastMessage);
        TextView time = convertView.findViewById(R.id.msgtime);

        imageView.setImageResource(person.imageId);
        userName.setText(person.name);
        lastMsg.setText(person.lastMessage);
        time.setText(person.lastMsgTime);


        return convertView;
    }
}
