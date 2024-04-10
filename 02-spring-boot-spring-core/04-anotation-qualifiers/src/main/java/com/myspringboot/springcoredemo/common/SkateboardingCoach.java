package com.myspringboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class SkateboardingCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Do a kickflip";
    }
}
