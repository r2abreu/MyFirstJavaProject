package com.netmind.business;

import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

public class StudentBl {
	public boolean add(Student student) {

		StudentDao studentDao = new StudentDao();
		// Aqui realizaremos el calculo de la edad;
		studentDao.add(student);

		throw new UnsupportedOperationException(
				"The file is not yet implemented");

	}
}
