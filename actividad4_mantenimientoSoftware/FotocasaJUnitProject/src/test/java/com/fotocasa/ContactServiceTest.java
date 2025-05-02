package com.fotocasa;

import com.fotocasa.model.ContactMessage;
import com.fotocasa.repository.ContactRepository;
import com.fotocasa.service.ContactService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ContactServiceTest {

    @Test
    public void testSendContactMessage() {
        ContactRepository mockRepo = mock(ContactRepository.class);
        ContactService contactService = new ContactService(mockRepo);

        ContactMessage message = new ContactMessage("usuario@email.com", "Estoy interesado en la propiedad");
        when(mockRepo.save(message)).thenReturn(message);

        ContactMessage result = contactService.sendContactMessage(message);
        assertEquals("Estoy interesado en la propiedad", result.getMessage());
    }
}