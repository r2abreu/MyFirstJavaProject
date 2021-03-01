package com.netmind.business;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

import com.netmind.dao.FileManagerDao;
import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

public class StudentBl {

	public boolean add(Student student) throws IOException {
		StudentDao studentDao = new StudentDao();

		student.setAge(calculateAge(student.getDateOfBirth()));

		FileManagerDao.createFile("student.txt");

		return studentDao.add(student);
	}

	private int calculateAge(LocalDate dateOfBirth) {

		Period age = Period.between(dateOfBirth, LocalDate.now());
		return age.getYears();
	}
}
