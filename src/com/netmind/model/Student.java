package com.netmind.model;

import java.util.Date;

public class Student {

	private Integer idStudent;
	private String name;
	private String surname;
	private Integer age;
	private Date dateOfBirth;

	public Integer getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Student(Integer idStudent, String name, String surname, Integer age,
			Date dateOfBirth) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
	}

}
