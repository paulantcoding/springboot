package com.myspringboot.jpademo.dao;

import com.myspringboot.jpademo.entity.Student;

import java.util.List;

public interface studentDAO {

    void save (Student theStudent);

    Student findbyID (Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String name);
}
