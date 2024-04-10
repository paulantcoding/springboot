package com.myspringboot.jpademo;

import com.myspringboot.jpademo.dao.studentDAO;
import com.myspringboot.jpademo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(studentDAO studentDAO){
		return runner -> {
//			queryForStudents(studentDAO);
			queryForStudentsByLastName(studentDAO);
		};
	}

	private void queryForStudentsByLastName(studentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastName("Bunny");
		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(studentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findAll();
		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(studentDAO studentDAO) {
		Student tempStudent1 = new Student("Buggs", "Bunny", "BuggsBunny@gmail.com");
		studentDAO.save(tempStudent1);
		int studentId = tempStudent1.getId();
		studentDAO.findbyID(studentId);
		Student thestudent = studentDAO.findbyID(studentId);
		System.out.println(thestudent);
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
