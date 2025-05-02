package com.fotocasa;

import com.fotocasa.model.Property;
import com.fotocasa.repository.PropertyRepository;
import com.fotocasa.service.PropertyService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PropertyServiceTest {

    @Test
    public void testFilterProperties() {
        PropertyRepository mockRepo = mock(PropertyRepository.class);
        PropertyService propertyService = new PropertyService(mockRepo);

        Property p1 = new Property("Madrid", 120000, "Piso");
        List<Property> mockList = Arrays.asList(p1);

        when(mockRepo.findFiltered("Madrid", 100000, 150000, "Piso")).thenReturn(mockList);

        List<Property> result = propertyService.filterProperties("Madrid", 100000, 150000, "Piso");
        assertEquals(1, result.size());
        assertEquals("Madrid", result.get(0).getCity());
    }
}