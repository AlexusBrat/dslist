package com.example.dslist.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloSpring {
    @GetMapping("/")
    public String getMethodName() {
        return "Olá Mundo!!!";
    }
    
}
