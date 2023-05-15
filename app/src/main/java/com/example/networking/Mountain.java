package com.example.networking;

import com.google.gson.annotations.SerializedName;
public class Mountain {
    @SerializedName("name")
    private String name;
    @SerializedName("location")
    private String location;
    @SerializedName("size")
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

    public String info() {
        String tmp = new String();
        tmp += name + " is located in mountain range " + location + " and reaches " + height + "m above sea level.";
        return tmp;
    }
        public void setName(String n){

        name=n;
       }

       public String getName(){
        return name;
    }
}

