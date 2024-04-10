package com.myspringboot.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Example of customer packages and how to have them function with your springboot setup
/*
@SpringBootApplication(
		scanBasePackages = {"com.myspringboot.springcoredemo",
				"com.myspringboot.util"}
)
*/
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
