package com.myspringboot.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GamingCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Do a Barrel Roll";
    }
}
