package com.example.myapplication.Model;

public class XedamuaModel {
    private int ImageId;
    private String Tenxe;
    private String Sokhung;
    private  String Tinhtrang;


    public XedamuaModel(int imageId, String tenxe, String sokhung, String tinhtrang) {
        ImageId = imageId;
        Tenxe = tenxe;
        Sokhung = sokhung;
        Tinhtrang = tinhtrang;

    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getTenxe() {
        return Tenxe;
    }

    public void setTenxe(String tenxe) {
        Tenxe = tenxe;
    }

    public String getSokhung() {
        return Sokhung;
    }

    public void setSokhung(String sokhung) {
        Sokhung = sokhung;
    }

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        Tinhtrang = tinhtrang;
    }
}
