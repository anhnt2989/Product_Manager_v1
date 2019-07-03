package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private int price;
    private int inventory;
    private int categoryId;
    private String categoryName;

    public Product() {

    }

    public Product(int id, String name, int price,int inventory, int categoryId, String categoryName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
