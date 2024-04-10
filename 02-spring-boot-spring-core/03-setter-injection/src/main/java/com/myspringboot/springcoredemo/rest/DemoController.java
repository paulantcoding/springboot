package com.myspringboot.springcoredemo.rest;

import com.myspringboot.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependancy
    private Coach myCoach;

    //define a constructor for the injection
    //Commented out to focus on setter injection
//    @Autowired
//    public DemoController (Coach theCoach) {
//        myCoach = theCoach;
//    }


    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    //Create setter for injections
    @Autowired
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }


}
