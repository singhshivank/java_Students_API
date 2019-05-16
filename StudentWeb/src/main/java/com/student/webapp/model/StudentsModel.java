package com.student.webapp.model;

import java.util.ArrayList;
import java.util.List;

public class StudentsModel {

	private List<StudentModel> StudentList;

	public List<StudentModel> getStudentsList() {
		if(StudentList == null) {
			StudentList = new ArrayList<>();
		}
		return StudentList;
	}

//	public void setStudentsList(List<StudentModel> StudentList) {
//		this.StudentList = StudentList;
//	}


}
