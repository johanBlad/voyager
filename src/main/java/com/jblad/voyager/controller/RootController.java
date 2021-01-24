package com.jblad.voyager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String webRoot() {
        return "Hello from root!";
    }
}
