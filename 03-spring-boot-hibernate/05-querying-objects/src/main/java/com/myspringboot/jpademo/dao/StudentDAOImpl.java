package com.myspringboot.jpademo.dao;

import com.myspringboot.jpademo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements studentDAO{
    //define field for entityManager
    private EntityManager entityManager;


    //Inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    //implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findbyID(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        //create JPA query
        TypedQuery<Student> theQuery= entityManager.createQuery("From Student ", Student.class);

        //return results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String name) {
        TypedQuery<Student> thisQuery = entityManager.createQuery(
                                    "From Student WHERE lastName = :theData", Student.class);

        thisQuery.setParameter("theData", name);
        return thisQuery.getResultList();
    }

}






