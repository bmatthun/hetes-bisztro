package com.codecool.hetes_backend.service;

import org.springframework.stereotype.Service;

@Service
public class HetesService {

    private final AboutUsRepository aboutUsRepository;

    public HetesService(AboutUsRepository aboutUsRepository) {
        this.aboutUsRepository = aboutUsRepository;
    }

    public String getAboutUs() {
        return aboutUsRepository.getAboutUsFromDb();
    }
}
