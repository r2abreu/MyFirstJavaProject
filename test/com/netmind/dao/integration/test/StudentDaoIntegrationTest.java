package com.netmind.dao.integration.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.UUID;

import org.junit.Test;

import com.netmind.dao.FileManagerDao;
import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

public class StudentDaoIntegrationTest {

	@Test
	public void testAddStudentToFile() throws Exception {
		Student student = new Student();
		StudentDao studentDao = new StudentDao();
		FileManagerDao.createFile("StudentTest.txt");

		Student findedStudent = findStudent(student.getUUId());
		assertEquals(student, findedStudent);
		fail("Not yet implemented");
	}

	private Student findStudent(UUID uuid) throws Exception {
		throw new Exception("The method is not yet implemented");
	}

}