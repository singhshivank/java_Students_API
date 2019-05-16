package com.student.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.webapp.model.StudentsModel;
import com.student.webapp.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public StudentsModel getStudents(){
		return studentRepo.getAllStudents();
	}
	


}
