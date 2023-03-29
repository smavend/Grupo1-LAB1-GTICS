package com.example.grupo1_lab1_gtics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewUserController {
    @GetMapping
    public String newUser(){
        return "newUser";
    }
}
