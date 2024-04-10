package com.springboot.demo.demoapp.rest;

import org.springframework.beans.factory.annotation.Value;
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

    //Inject properties to fulfill team and coach name
    //Tag application property values to create callable data;
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @Value("${team.MVP}")
    private String teamMVP;

    //Expose new endpoint to use above values
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach is : " + coachName + " the team is " + teamName + " and my favourite is " + teamMVP;
    }

}
