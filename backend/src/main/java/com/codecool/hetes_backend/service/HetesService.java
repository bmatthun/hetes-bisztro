package com.codecool.hetes_backend.service;

import com.codecool.hetes_backend.model.AboutUs;
import com.codecool.hetes_backend.repository.AboutUsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HetesService {

    private final AboutUsRepository aboutUsRepository;

    public HetesService(AboutUsRepository aboutUsRepository) {
        this.aboutUsRepository = aboutUsRepository;
    }

    public List<String> getAboutUsAll() {
        List <AboutUs> aboutUs = aboutUsRepository.findAll();
        List <String> aboutUsString = aboutUs.stream()
                .map(aboutUs1 -> aboutUs.getText())
    }
}
