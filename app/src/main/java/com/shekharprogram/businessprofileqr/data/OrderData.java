package com.shekharprogram.businessprofileqr.data;

public class OrderData {
    private String pro_Name;
    private int ImageVIew;
    private int Number_of_order;

    public OrderData() {
    }

    public String getPro_Name() {
        return pro_Name;
    }

    public void setPro_Name(String pro_Name) {
        this.pro_Name = pro_Name;
    }

    public int getImageVIew() {
        return ImageVIew;
    }

    public void setImageVIew(int imageVIew) {
        ImageVIew = imageVIew;
    }

    public int getNumber_of_order() {
        return Number_of_order;
    }

    public void setNumber_of_order(int number_of_order) {
        Number_of_order = number_of_order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderData(String pro_Name, int imageVIew, int number_of_order, int id) {
        this.pro_Name = pro_Name;
        ImageVIew = imageVIew;
        Number_of_order = number_of_order;
        this.id = id;
    }

    private int id;


}
