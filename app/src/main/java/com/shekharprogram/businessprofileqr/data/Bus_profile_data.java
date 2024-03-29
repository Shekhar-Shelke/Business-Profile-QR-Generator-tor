package com.shekharprogram.businessprofileqr.data;

public class Bus_profile_data {
    int image;
    String name;

    public Bus_profile_data() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bus_profile_data( String name,int image) {
        this.image = image;
        this.name = name;
    }
}
