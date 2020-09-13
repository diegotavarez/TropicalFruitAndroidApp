package com.example.tropicalfruitlist.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pojo {
    @SerializedName("results")
    private List<Fruit> fruitList;

    @SerializedName("tfvcount")
    private int itemCount;

    public Pojo(List<Fruit> fruitList, int itemCount) {
        this.fruitList = fruitList;
        this.itemCount = itemCount;
    }

    public List<Fruit> getFruitList() {
        return fruitList;
    }

    public void setFruitList(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
