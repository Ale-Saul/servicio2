package com.example.servicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {

    @GetMapping("/translate")
    public String translate(@RequestParam String text, @RequestParam String lang) {
        // Dummy translation logic for now
        if (lang.equalsIgnoreCase("es")) {
            return "Translation in Spanish: " + text;
        } else if (lang.equalsIgnoreCase("fr")) {
            return "Translation in French: " + text;
        } else {
            return "Language not supported.";
        }
    }
}