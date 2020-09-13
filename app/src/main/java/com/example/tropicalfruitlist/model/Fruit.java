package com.example.tropicalfruitlist.model;

import com.google.gson.annotations.SerializedName;

public class Fruit {
    @SerializedName("tfvname")
    private String name;

    @SerializedName("botname")
    private String botanicalName;

    @SerializedName("othname")
    private String otherNames;

    @SerializedName("imageurl")
    private String imageUrl;

    public Fruit(String name, String botanicalName, String otherNames, String imageUrl) {
        this.name = name;
        this.botanicalName = botanicalName;
        this.otherNames = otherNames;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getBotanicalName() {
        return botanicalName;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBotanicalName(String botanicalName) {
        this.botanicalName = botanicalName;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
