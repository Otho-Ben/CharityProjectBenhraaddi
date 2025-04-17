package org.example.charityproject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccueilController {

    @GetMapping({"/", "/accueil"})
    public String showAccueil() {
        return "accueil";
    }
}