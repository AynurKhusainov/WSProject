package com.example.myapplication.Banks;

public class Users {

    String name, lastMessage, lastMsgTime, phoneNo, country;
    int imageId;

    public Users(String name, String lastMessage, String lastMsgTime, String phoneNo, String country, int imageId) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.lastMsgTime = lastMsgTime;
        this.phoneNo = phoneNo;
        this.country = country;
        this.imageId = imageId;
    }
}
