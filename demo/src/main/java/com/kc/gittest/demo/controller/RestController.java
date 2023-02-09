package com.kc.gittest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1")
public class RestController {


    @GetMapping("/greet")
    public String greet(){

        return "Hello KC";
    }

    @GetMapping("/greet1")
    public String greet1(){

        return "Hello KC";
    }
}
