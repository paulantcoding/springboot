package com.springboot.demo.demoapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
    //expose a / endpoint to return HelloWorld
    @GetMapping("/")
    public String sayHello () {
        return "Hello World!";
    }

}