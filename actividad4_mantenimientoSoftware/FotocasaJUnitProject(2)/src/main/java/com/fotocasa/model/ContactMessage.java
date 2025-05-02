package com.fotocasa.model;

public class ContactMessage {
    private String email;
    private String message;

    public ContactMessage(String email, String message) {
        this.email = email;
        this.message = message;
    }

    public String getMessage() { return message; }
}