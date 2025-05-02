package com.fotocasa.service;

import com.fotocasa.model.Ad;
import com.fotocasa.repository.AdRepository;

public class AdService {
    private final AdRepository adRepository;

    public AdService(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

    public Ad publishAd(Ad ad) {
        return adRepository.save(ad);
    }
}