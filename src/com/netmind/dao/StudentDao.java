package com.netmind.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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

	public boolean addStudentToFile(Student student) throws IOException {
		try (FileWriter fileWriter = new FileWriter(
				FileManagerDao.getFileName(), true);
				BufferedWriter bufferWriter = new BufferedWriter(fileWriter)) {
			bufferWriter.write(student.toTxtFile());
			bufferWriter.write(System.lineSeparator());
		} catch (IOException e) {
			throw e;
		}
		return true;
	}

}