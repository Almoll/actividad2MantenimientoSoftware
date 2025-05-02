package com.fotocasa;

import com.fotocasa.service.ImageService;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class ImageServiceTest {

    @Test
    public void testUploadImageWithValidFile() {
        ImageService imageService = new ImageService();
        File file = new File("foto.jpg");
        assertTrue(imageService.uploadImage(file));
    }

    @Test
    public void testUploadImageWithInvalidFile() {
        ImageService imageService = new ImageService();
        File file = new File("documento.pdf");
        assertFalse(imageService.uploadImage(file));
    }
}