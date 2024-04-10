package com.myspringboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach{

    public BoxingCoach(){
        System.out.println("In Consturctor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do 15 burpees after each lap, run 10 laps, Now!";
    }
}
