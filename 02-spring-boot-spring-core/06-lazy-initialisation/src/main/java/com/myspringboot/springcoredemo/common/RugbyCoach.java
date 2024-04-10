package com.myspringboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach{

    public RugbyCoach(){
        System.out.println("In Consturctor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Pracitce scrum and ruck";
    }
}
