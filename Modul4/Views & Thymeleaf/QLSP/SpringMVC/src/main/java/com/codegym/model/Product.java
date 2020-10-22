package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private ProductLine productLine;
    private int maProductLine;
    public Product() {
    }

    public Product(int id, String name, double price, ProductLine productLine) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productLine = productLine;
    }
    public Product(int id, String name, double price,int maProductLine) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.maProductLine=maProductLine;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductLine getProductLine() {
        return productLine;
    }

    public void setProductLine(ProductLine productLine) {
        this.productLine = productLine;
    }

    public int getMaProductLine() {
        return maProductLine;
    }

    public void setMaProductLine(int maProductLine) {
        this.maProductLine = maProductLine;
    }
}
