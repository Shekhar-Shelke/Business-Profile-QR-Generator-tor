package com.shekharprogram.businessprofileqr.data;

public class ReviewCommentData {
    private int ImageView;
    double number_of_rateing;
    private String name,time,Description;

    public int getImageView() {
        return ImageView;
    }

    public void setImageView(int imageView) {
        ImageView = imageView;
    }

    public double getNumber_of_rateing() {
        return number_of_rateing;
    }

    public void setNumber_of_rateing(double number_of_rateing) {
        this.number_of_rateing = number_of_rateing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ReviewCommentData() {
    }

    public ReviewCommentData(int imageView, double number_of_rateing, String name, String time, String description) {
        ImageView = imageView;
        this.number_of_rateing = number_of_rateing;
        this.name = name;
        this.time = time;
        Description = description;
    }
}
