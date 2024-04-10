package com.myspringboot.jpademo;

import com.myspringboot.jpademo.dao.studentDAO;
import com.myspringboot.jpademo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(studentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudents(studentDAO);
		};
	}

	private void createMultipleStudents(studentDAO studentDAO) {
		Student tempStudent1 = new Student("Joe", "Bloggs", "joeBloggs@gmail.com");
		Student tempStudent2 = new Student("Mary", "Hairy", "Mary@gmail.com");
		Student tempStudent3 = new Student("Mambo", "NumberFive", "rickrolls@gmail.com");
		//save the student object
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		int x=5;
		for (int i = 0; i <= x; i++) {
			Random rand = new Random();
			String name = randomString(rand,"abcdefghijklmnopqrstuvwxyz",6);
			Student tempStudent = new Student(name, "Bloggs", name+"@gmail.com");
			studentDAO.save(tempStudent);
		}
	}

	//implement random string generator for name as hardcoding is poor practice even for a demo
	public static String randomString(Random rand, String charlist, int length){
		char[] text = new char[length];
		for(int j=0; j<length; j++){
			text[j] =charlist.charAt(rand.nextInt(charlist.length()));
		}
		return text.toString();
	}


	private void createStudent(studentDAO studentDAO) {

		//create the student object
		System.out.println("creating student object");
		Student tempStudent = new Student("Paul", "Ross", "paulanthonyross02@gmail.com");

		//save the student object
		System.out.println("saving off the new student");
		studentDAO.save(tempStudent);

		//display the id of the aved student
		System.out.println("New student ID : "+ tempStudent.getId());

	}


}
