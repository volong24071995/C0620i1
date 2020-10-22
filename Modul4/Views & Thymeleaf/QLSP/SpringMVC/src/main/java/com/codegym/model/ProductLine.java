package com.codegym.model;

public class ProductLine {
    private int idProductLine;
    private String name;

    public ProductLine(int idProductLine, String name) {
        this.idProductLine = idProductLine;
        this.name = name;
    }

    public ProductLine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdProductLine() {
        return idProductLine;
    }

    public void setIdProductLine(int idProductLine) {
        this.idProductLine = idProductLine;
    }
}
