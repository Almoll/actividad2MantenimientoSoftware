package com.fotocasa.repository;

import com.fotocasa.model.User;

public interface UserRepository {
    User save(User user);
}