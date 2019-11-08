package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/recipe")
    public String recipe() {
        return "recipe";
    }

    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }
}
