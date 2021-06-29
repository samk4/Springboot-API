package com.spring.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.example.model.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, Long> {

}
