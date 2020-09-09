package com.example.tropicalfruitlist.model;

public class Fruit {
    private String name;
    private String botanicalName;
    private String otherNames;
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
}
