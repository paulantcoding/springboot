package com.myspringboot.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class SkateboardingCoach implements Coach{

    public SkateboardingCoach(){
        System.out.println("In Consturctor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do a kickflip";
    }
}
