package com.arcisAI.service;

import com.arcisAI.model.Student;

public interface StudentService{

	public Student getStudentById(int id);
	
	public void saveOrUpdate(Student students);
	
	public void delete(int id);
	
	public void update(Student students, int studentid);  
	
	
}
