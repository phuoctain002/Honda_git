package com.example.myapplication.Model;

public class XedamuaModel {
    private String ImageId;
    private String Tenxe;
    private String Sokhung;
    private String Tinhtrang;
    private String Ngaymua;
    public String base64;

    public XedamuaModel() {

    }
    public XedamuaModel( String tenxe, String sokhung, String tinhtrang, String ngaymua,String imageId) {
        ImageId = imageId;
        Tenxe = tenxe;
        Sokhung = sokhung;
        Tinhtrang = tinhtrang;
        Ngaymua = ngaymua;
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
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

    public String getNgaymua() {return Ngaymua;}

    public void setNgaymua(String ngaymua) {Ngaymua = ngaymua;}
}
