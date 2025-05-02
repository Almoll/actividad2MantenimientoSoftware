package com.fotocasa.service;

import com.fotocasa.model.Property;
import com.fotocasa.repository.PropertyRepository;
import java.util.List;

public class PropertyService {
    private final PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public List<Property> filterProperties(String city, int minPrice, int maxPrice, String type) {
        return propertyRepository.findFiltered(city, minPrice, maxPrice, type);
    }
}