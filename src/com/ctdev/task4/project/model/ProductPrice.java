package com.ctdev.task4.project.model;

public class ProductPrice {
    private String month;
    private String price;

    public ProductPrice(String month, String price) {
        this.month = month;
        this.price = price;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
