package com.arcisAI.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arcisAI.model.Student;
import com.arcisAI.repository.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;

	public Student getStudentById(int id)   
	{  
	return studentDao.findById(id).get();  
	} 
	
	public void saveOrUpdate(Student students)   
	{  
	studentDao.save(students);  
	}
	
	public void delete(int id)   
	{  
	studentDao.deleteById(id);  
	}
	
	public void update(Student students, int studentid)   
	{  
	studentDao.save(students);  
	}  

}
