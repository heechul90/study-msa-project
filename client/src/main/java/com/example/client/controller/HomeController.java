package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RefreshScope
public class HomeController {

    @Value("${msa.test}")
    private String str;

    @GetMapping("/test")
    public String test() {
        return "str";
    }
}
