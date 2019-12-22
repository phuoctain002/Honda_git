package com.example.myapplication.Model;

public class TinTucModel {
    private int ImageId;
    private String Title;
    private String Description;


    public TinTucModel(int imageId, String title, String description) {
        ImageId = imageId;
        Title = title;
        Description = description;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
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
}
