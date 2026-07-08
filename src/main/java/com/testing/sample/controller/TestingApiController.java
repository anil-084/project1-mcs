package com.testing.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestingApiController {

    @GetMapping("/info")
    public String getInfo() {
        return "Hello, Spring boot Apllication";
    }
}
