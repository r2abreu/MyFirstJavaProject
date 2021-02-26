package com.netmind.dao;

import java.util.ArrayList;

import com.netmind.model.Student;

public class StudentDao {
	private static ArrayList<Student> studentList;

	static {
		studentList = new ArrayList<Student>();
	}

	public boolean add(Student student) {
		studentList.add(student);
		return true;
	}

	public boolean addStudentToFile(Student student) {
		studentList.add(student);
		return true;
	}
}
