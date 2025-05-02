package com.fotocasa.model;

public class Property {
    private String city;
    private int price;
    private String type;

    public Property(String city, int price, String type) {
        this.city = city;
        this.price = price;
        this.type = type;
    }

    public String getCity() { return city; }
    public int getPrice() { return price; }
    public String getType() { return type; }
}