package com.myspringboot.springcoredemo.rest;

import com.myspringboot.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependancy
    private Coach myCoach;
    private Coach anotherCoach;

    //define a constructor for the injection
     @Autowired
    public DemoController (
            @Qualifier("gamingCoach") Coach theCoach,
            @Qualifier("gamingCoach") Coach theAnotherCoach) {
         System.out.println("In Consturctor : " + getClass().getSimpleName());
         myCoach = theCoach;
         anotherCoach = theAnotherCoach;
    }


    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String getCheck() {
         return "Comparing beans : myCoach == AnotherCoach,  " + (myCoach == anotherCoach);
    }

}
