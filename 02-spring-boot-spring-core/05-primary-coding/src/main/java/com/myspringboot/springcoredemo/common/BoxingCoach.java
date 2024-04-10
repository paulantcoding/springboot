package com.myspringboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Do 15 burpees after each lap, run 10 laps, Now!";
    }
}
