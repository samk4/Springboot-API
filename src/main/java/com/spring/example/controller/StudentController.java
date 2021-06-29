package com.spring.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.example.model.Student;
import com.spring.example.repository.StudentRepo;
 
@RestController
public class StudentController {

	@Autowired
	public StudentRepo studentRepo;
	
	//@RequestMapping (value="/all")
	@GetMapping (value="/all")
	public List<Student> getAllStudent(){ 
		
		return studentRepo.findAll();
	}
	
	
	@PostMapping (value="/create")
	public String insertStudent(@RequestBody Student student) {
		
		Student insertedStudent = studentRepo.insert(student);
		return "Student created!"+insertedStudent.getName();
	}
}
