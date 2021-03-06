package com.example.myapplication.Valutes;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Banks.ListAdapter;
import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityValutesBinding;

import java.util.ArrayList;
import java.util.Date;

public class Valute extends AppCompatActivity {

    ActivityValutesBinding binding;

    TextView date;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityValutesBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        date=findViewById(R.id.date);
        String currentDateTimeString=java.text.DateFormat.getDateInstance().format(new Date());
        date.setText(currentDateTimeString);

        int[] imageId = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f};
        String[] name = {"Christopher", "Craig", "Sergio", "Mubariz", "Mike", "Michael"};
        String[] lastMessage = {"Heye", "Supp", "Let's Catchup", "Dinner tonight?", "Gotta go",
                "i'm in meeting"};
        String[] lastmsgTime = {"8:45 pm", "9:00 am", "7:34 pm", "6:32 am", "5:76 am",
                "5:00 am"};
        String[] phoneNo = {"7656610000", "9999043232", "7834354323", "9876543211", "5434432343",
                "9439043232"};
        String[] country = {"United States", "Russia", "India", "Canada", "France", "Switzerland"};

        ArrayList<ValuteModel> valuteModelArrayList = new ArrayList<>();

        for (int i = 0; i<imageId.length; i++){
            ValuteModel valuteModel=new ValuteModel(name[i], lastMessage[i], lastmsgTime[i], phoneNo[i], country[i], imageId[i]);
            valuteModelArrayList.add(valuteModel);
        }

        ValAdapter valAdapter=new ValAdapter(Valute.this,valuteModelArrayList);

        binding.valList.setAdapter(valAdapter);

    }
}
