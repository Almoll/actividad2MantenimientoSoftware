package com.fotocasa;

import com.fotocasa.model.Ad;
import com.fotocasa.repository.AdRepository;
import com.fotocasa.service.AdService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AdServiceTest {

    @Test
    public void testPublishAd() {
        AdRepository mockRepo = mock(AdRepository.class);
        AdService adService = new AdService(mockRepo);

        Ad ad = new Ad("Piso en alquiler", "Bonito piso en el centro", 850);
        when(mockRepo.save(ad)).thenReturn(ad);

        Ad result = adService.publishAd(ad);
        assertEquals("Piso en alquiler", result.getTitle());
    }
}