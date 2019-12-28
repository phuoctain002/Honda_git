package com.example.myapplication.Model;

public class MyBikeModel {
    private int ImageId;
    private String TenXe;
    private String MaKhung;
    private String NgayMua;


    public MyBikeModel(int imageId, String tenXe, String maKhung, String ngayMua) {
        ImageId = imageId;
        TenXe = tenXe;
        MaKhung = maKhung;
        NgayMua = ngayMua;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getTenXe() {
        return TenXe;
    }

    public void setTenXe(String tenXe) {
        TenXe = tenXe;
    }

    public String getMaKhung() {
        return MaKhung;
    }

    public void setMaKhung(String maKhung) {
        MaKhung = maKhung;
    }

    public String getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(String ngayMua) {
        NgayMua = ngayMua;
    }
}
