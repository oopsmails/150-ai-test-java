package com.example.aigen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/${spring.application.name}")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, AI Gen World!";
    }

}
