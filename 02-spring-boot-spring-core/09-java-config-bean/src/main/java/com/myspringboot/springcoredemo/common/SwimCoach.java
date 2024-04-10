package com.myspringboot.springcoredemo.common;



public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In Consturctor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Just keep swimming, just keep swimming";
    }
}
