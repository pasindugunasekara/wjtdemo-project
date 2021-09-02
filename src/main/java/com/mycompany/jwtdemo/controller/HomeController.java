package com.mycompany.jwtdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hellow")
    public String sayHellow() {
        return "Hellow From HomeController";
    }
}
