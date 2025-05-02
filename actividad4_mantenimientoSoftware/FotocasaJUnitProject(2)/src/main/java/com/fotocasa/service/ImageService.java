package com.fotocasa.service;

import java.io.File;

public class ImageService {
    public boolean uploadImage(File file) {
        return file.getName().endsWith(".jpg") || file.getName().endsWith(".png");
    }
}