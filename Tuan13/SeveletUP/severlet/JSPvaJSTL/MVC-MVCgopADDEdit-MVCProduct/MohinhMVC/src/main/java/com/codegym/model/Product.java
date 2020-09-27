package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private float price;
    private String mota;
    private String nhasx;

    public Product() {
    }

    public Product(int id, String name, float price, String mota,String nhasx) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.mota = mota;
        this.nhasx=nhasx;
    }
    public Product(String name, float price, String mota,String nhasx) {
        this.name = name;
        this.price = price;
        this.mota = mota;
        this.nhasx=nhasx;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getNhasx() {
        return nhasx;
    }

    public void setNhasx(String nhasx) {
        this.nhasx = nhasx;
    }
}
