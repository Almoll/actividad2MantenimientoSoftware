package com.fotocasa.repository;

import com.fotocasa.model.Property;
import java.util.List;

public interface PropertyRepository {
    List<Property> findFiltered(String city, int minPrice, int maxPrice, String type);
}