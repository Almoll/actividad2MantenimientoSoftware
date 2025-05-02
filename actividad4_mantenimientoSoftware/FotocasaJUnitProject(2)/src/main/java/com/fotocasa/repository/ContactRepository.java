package com.fotocasa.repository;

import com.fotocasa.model.ContactMessage;

public interface ContactRepository {
    ContactMessage save(ContactMessage message);
}