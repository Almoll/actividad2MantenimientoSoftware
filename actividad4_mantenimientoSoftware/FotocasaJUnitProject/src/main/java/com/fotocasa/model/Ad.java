package com.fotocasa.model;

public class Ad {
    private String title;
    private String description;
    private int price;

    public Ad(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getTitle() { return title; }
}