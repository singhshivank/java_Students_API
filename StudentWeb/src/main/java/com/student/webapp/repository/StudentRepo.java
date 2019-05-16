package com.student.webapp.repository;

import org.springframework.stereotype.Repository;

import com.student.webapp.model.StudentModel;
import com.student.webapp.model.StudentsModel;

@Repository
public class StudentRepo {

	private static StudentsModel studentsList = new StudentsModel();
    
    static
    {
    	studentsList.getStudentsList().add(new StudentModel(1, "Shivank", "singh", "java@gmail.com"));
    	studentsList.getStudentsList().add(new StudentModel(2, "mahima", "chopra", "abc@gmail.com"));
    	studentsList.getStudentsList().add(new StudentModel(3, "shivani", "singh", "def@gmail.com"));
    }
     
    public StudentsModel getAllStudents()
    {
        return studentsList;
    }
     
    public void addStudent(StudentModel student) {
    	studentsList.getStudentsList().add(student);
    }
}
