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

    //expose a new endpoint for "workout"
    @GetMapping("/Workout")
    public String getDailyWorkout() {
        return "Do full cardio regime";
    }

    //expose new endpoint again
    @GetMapping("/Fortune")
    public String getDailyFortune() {
        return "All fortune telling is a scam!";
    }

}
