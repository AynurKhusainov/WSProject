package com.example.myapplication.Valutes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityBanksBinding;
import com.example.myapplication.databinding.ActivityValutesBinding;

import java.util.ArrayList;

public class Valutes extends AppCompatActivity {

    ActivityValutesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityValutesBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e, R.drawable.f};
        String[] name = {"Christopher","Craig","Sergio","Mubariz","Mike","Michael"};
        String[] lastMessage = {"Heye","Supp","Let's Catchup","Dinner tonight?","Gotta go","Gotta gogo",
                "i'm in meeting"};
        String[] lastmsgTime = {"8:45 pm","9:00 am","7:34 pm","6:32 am","5:76 am",
                "5:00 am"};
        String[] phoneNo = {"7656610000","9999043232","7834354323","9876543211","5434432343",
                "9439043232"};
        String[] country = {"United States","Russia","India","Canada","France","Switzerland"};

        ArrayList<Person> personArrayList=new ArrayList<>();
        for(int i = 0;i< imageId.length;i++){

            Person person = new Person(name[i],lastMessage[i],lastmsgTime[i],phoneNo[i],country[i],imageId[i]);
            personArrayList.add(person);

        }


        ListAdapterValutes listAdapter = new ListAdapterValutes(Valutes.this,personArrayList);

        binding.listview.setAdapter(listAdapter);



    }
}