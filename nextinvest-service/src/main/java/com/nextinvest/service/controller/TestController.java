package com.nextinvest.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("myTest")
    public String myTestMethod(){
        return "Amit";
    }
}
