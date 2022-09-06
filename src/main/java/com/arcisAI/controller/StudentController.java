package com.arcisAI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arcisAI.model.Student;
import com.arcisAI.service.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	StudentServiceImpl studentserviceimpl;

	@GetMapping("/student/{studentid}")  
	private Student getStudent(@PathVariable("studentid") int studentid)   
	{  
	return studentserviceimpl.getStudentById(studentid);  
	}  
	
	
	@DeleteMapping("/student/{studentid}")  
	private void deletetudent(@PathVariable("studentid") int studentid)   
	{  
		studentserviceimpl.delete(studentid);  
	}  

	@PostMapping("/students")  
	private int saveStudent(@RequestBody Student student)   
	{  
	studentserviceimpl.saveOrUpdate(student);  
	return student.getId();  
	}  

	@PutMapping("/students")  
	private Student update(@RequestBody Student student)   
	{  
	studentserviceimpl.saveOrUpdate(student);  
	return student;  
	}  	
	
}
