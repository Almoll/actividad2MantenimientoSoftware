package com.fotocasa.service;

import com.fotocasa.model.ContactMessage;
import com.fotocasa.repository.ContactRepository;

public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public ContactMessage sendContactMessage(ContactMessage msg) {
        return contactRepository.save(msg);
    }
}