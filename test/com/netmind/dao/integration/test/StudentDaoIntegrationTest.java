package com.netmind.dao.integration.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

import org.junit.Test;

import com.netmind.dao.FileManagerDao;
import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

public class StudentDaoIntegrationTest {

	@Test
	public void testAddStudentToFile() throws Exception {
		Student student = new Student();
		student.setIdStudent(1);
		student.setName("Pepe");
		student.setSurname("Soto");
		student.setAge(45);
		student.setDateOfBirth(LocalDate.parse("1975-04-10"));
		StudentDao studentDao = new StudentDao();
		FileManagerDao.createFile("StudentTest.txt");
		studentDao.addStudentToFile(student);

		Student foundStudent = findStudent(student.getUUId());
		assertEquals(student, foundStudent);
	}

	private Student findStudent(UUID uuid) throws Exception {

		boolean encontrado = false;
		File fichero = new File("StudentTest.txt");
		String[] alumnostring = null;

		try (Scanner s = new Scanner(fichero)) {
			while (s.hasNextLine() && encontrado == false) {
				String linea = s.nextLine();
				alumnostring = linea.split(",");

				if (alumnostring[0].equals(uuid.toString())) {
					encontrado = true;
				}
			}
		} catch (IOException e) {
			throw e;
		}

		Student student = new Student(uuid);
		if (encontrado == true) {
			student.setIdStudent(Integer.parseInt(alumnostring[1].trim()));
			student.setName(alumnostring[2].trim());
			student.setSurname(alumnostring[3].trim());
			student.setAge(Integer.parseInt(alumnostring[4].trim()));
			student.setDateOfBirth(LocalDate.parse((alumnostring[5].trim())));
		}

		return student;
	}

}