package com.codecool.hetes_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MainController {

    private final hetesService hetesService;

    public MainController(hetesService hetesService) {
        this.hetesService = hetesService;
    }

    @GetMapping("/aboutus")
    public String aboutus() {
        return "aboutus";
    }
}
