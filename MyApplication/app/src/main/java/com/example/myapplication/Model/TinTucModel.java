package com.example.myapplication.Model;

import java.io.Serializable;

public class TinTucModel implements Serializable {
    private String ImageId;
    private String Title;
    private String Description;
    private String detail;
    public String base64;

    public TinTucModel()
    {

    }

    public TinTucModel(String title, String description,String imageId) {
        ImageId = imageId;
        Title = title;
        Description = description;
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }
}
