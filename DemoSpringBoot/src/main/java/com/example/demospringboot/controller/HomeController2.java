package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController2 {

    @RequestMapping("/home2")
    public String index() {
        return "index";
    }

    @GetMapping("/home2")
    public String index2() {
        return "index";
    }
}
