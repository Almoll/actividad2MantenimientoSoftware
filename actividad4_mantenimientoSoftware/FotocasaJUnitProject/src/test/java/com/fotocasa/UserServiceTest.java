package com.fotocasa;

import com.fotocasa.model.User;
import com.fotocasa.repository.UserRepository;
import com.fotocasa.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testRegisterUser() {
        UserRepository mockRepo = mock(UserRepository.class);
        UserService userService = new UserService(mockRepo);

        User user = new User("test@example.com", "password123", "Test User");
        when(mockRepo.save(user)).thenReturn(user);

        User result = userService.registerUser(user);
        assertEquals("test@example.com", result.getEmail());
        verify(mockRepo, times(1)).save(user);
    }
}