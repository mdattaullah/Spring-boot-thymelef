package com.attaullah.java.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.attaullah.java.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> { 
    List<Student> findByName(String name); 
}