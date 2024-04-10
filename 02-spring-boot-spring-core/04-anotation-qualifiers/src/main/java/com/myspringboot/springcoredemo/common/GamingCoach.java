package com.myspringboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class GamingCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Do a Barrel Roll";
    }
}
