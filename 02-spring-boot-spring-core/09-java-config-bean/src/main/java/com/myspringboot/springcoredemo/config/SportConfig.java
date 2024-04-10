package com.myspringboot.springcoredemo.config;

import com.myspringboot.springcoredemo.common.Coach;
import com.myspringboot.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("water")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
