package com.tpeetz.kontor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    
    @GetMapping("/comics")
    public String index() {
        return "index";
    }
}