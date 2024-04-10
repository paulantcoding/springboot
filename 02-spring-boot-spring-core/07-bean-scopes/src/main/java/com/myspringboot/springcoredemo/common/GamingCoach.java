package com.myspringboot.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GamingCoach implements Coach{

    public GamingCoach(){
        System.out.println("In Consturctor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do a Barrel Roll";
    }
}
