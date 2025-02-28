package com.example.ejemplo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class holaController {

    @GetMapping("/")
    public String hola(Model model) {
        model.addAttribute("mensaje", "Hola mundo desde SpringBoot");
        return "holamundo";
    }
    
    
}
