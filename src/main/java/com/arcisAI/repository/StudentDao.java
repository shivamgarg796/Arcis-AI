package com.arcisAI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arcisAI.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
