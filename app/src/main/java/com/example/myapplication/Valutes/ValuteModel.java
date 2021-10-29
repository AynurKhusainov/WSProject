package com.example.myapplication.Valutes;

import com.example.myapplication.Fragments.FirstCardFragment;

public class ValuteModel {

    String name, lastMessage, lastMsgTime, phoneNo, country;
    int imageId;

    public ValuteModel(String name, String lastMessage, String lastMsgTime, String phoneNo, String country, int imageId) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.lastMsgTime = lastMsgTime;
        this.phoneNo = phoneNo;
        this.country = country;
        this.imageId = imageId;
    }

}
