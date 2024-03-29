package com.shekharprogram.businessprofileqr.data;

public class ProductData {
private String Pro_name,Pro_Desc, Pro_Price ;
private int id,image_Name;

    public String getPro_name() {
        return Pro_name;
    }

    public void setPro_name(String pro_name) {
        Pro_name = pro_name;
    }

    public String getPro_Desc() {
        return Pro_Desc;
    }

    public void setPro_Desc(String pro_Desc) {
        Pro_Desc = pro_Desc;
    }

    public String getPro_Price() {
        return Pro_Price;
    }

    public void setPro_Price(String pro_Price) {
        Pro_Price = pro_Price;
    }

    public int getImage_Name() {
        return image_Name;
    }

    public void setImage_Name(int image_Name) {
        this.image_Name = image_Name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductData() {
    }

    public ProductData(String proName, String proDesc, String proPrice, int imageName, int id) {
        Pro_name = proName;
        Pro_Desc = proDesc;
        Pro_Price = proPrice;
        image_Name = imageName;
    }
}
