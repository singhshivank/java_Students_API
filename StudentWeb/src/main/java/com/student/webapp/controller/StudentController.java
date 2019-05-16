package com.student.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.webapp.model.StudentsModel;
import com.student.webapp.service.StudentService;


@RestController
public class StudentController {

	
	@Autowired
	private StudentService studentService;

	@GetMapping("/")
	public StudentsModel getStudents()
	{
		return studentService.getStudents();
	}

	
	/*
	 * @PostMapping(path= "/") public String addStudents(@RequestBody StudentModel
	 * student) { Integer id = studentRepo.getAllStudents().getStudentsList().size()
	 * + 1; student.setId(id);
	 * 
	 * studentRepo.addStudent(student);
	 * 
	 * return student.getFirstName(); }
	 */

}
