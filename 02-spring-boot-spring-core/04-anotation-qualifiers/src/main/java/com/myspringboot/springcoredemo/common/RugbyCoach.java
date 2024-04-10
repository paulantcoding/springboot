package com.myspringboot.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Pracitce scrum and ruck";
    }
}
