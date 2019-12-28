package com.example.myapplication.Model;


import java.io.Serializable;

public class DailyModel implements Serializable {
    private int ImageId;
    private String Tendaily;
    private String Diachi;
    private String SDT;

    public DailyModel(int imageId, String diachi, String SDT) {
        ImageId = imageId;
        // Tendaily = tendaily;
        Diachi = diachi;
        this.SDT = SDT;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getTendaily() {
        return Tendaily;
    }

    public void setTendaily(String tendaily) {
        Tendaily = tendaily;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}

