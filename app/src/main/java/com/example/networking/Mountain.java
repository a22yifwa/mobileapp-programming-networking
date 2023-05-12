package com.example.networking;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain(){
        name="Saknar namn";
        location="Saknar plats";
        height=-1;
    }

    public Mountain(String n, String l, int h) {
        name = n;
        location = l;
        height = h;
    }
}

