package com.codecool.hetes_backend.controller;

import com.codecool.hetes_backend.repository.AboutUsRepository;
import com.codecool.hetes_backend.service.HetesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MainController {

    private final HetesService hetesService;

    public MainController(HetesService hetesService) {
        this.hetesService = hetesService;
    }

    @GetMapping("/aboutus")
    public String aboutus() {
        return hetesService.getAboutUsAll();
    }
}
