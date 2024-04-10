package com.myspringboot.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class GamingCoach implements Coach{

    public GamingCoach(){
        System.out.println("In Consturctor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do a Barrel Roll";
    }

    //define init method
    @PostConstruct
    public void performStartup(){
        System.out.println("In performStartup() : " + getClass().getSimpleName());
    }

    //define destroy method
    @PreDestroy
    public void beginTeardDown(){
        System.out.println("In beginTearDown() : " + getClass().getSimpleName());
    }
}
