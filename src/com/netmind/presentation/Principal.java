package com.netmind.presentation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.netmind.model.Student;

public class Principal {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hola, en que te puedo ayudar?");
		System.out.println("1. Agregar un nuevo estudiante.");
		System.out.println("2. Calcular el estudiante con mayor edad.");
		System.out.println(
				"3. Calcular la media de edad de todos los estudiantes");
		System.out.println("4. Salir");

		String input = scanner.nextLine();

		switch (input) {
		case "1":
			try {
				addNewStudent(scanner);
			} catch (Exception e) {
				System.out.printf("An exception ocurred: %s", e);
			}
			break;
		case "2":
			calculateOldestStudent();
			break;
		case "3":
			calculateAverageAge();
			break;
		case "4":
			System.out.println("Goodbye!");

		}
		scanner.close();
	}

	public static void addNewStudent(Scanner scanner) throws Exception {
		System.out.println("Interfaz de creacion de estudiante");
		System.out.println("Introduce los siguientes datos");

		System.out.println("Nombre:");
		String name = scanner.next();

		System.out.println("Apellido:");
		String surname = scanner.next();

		System.out.println("ID:");
		Integer idStudent = scanner.nextInt();

		System.out.println("Edad:");
		Integer age = scanner.nextInt();

		System.out.println("Fecha de Nacimiento: [dd-mm-yyyy]");
		String dateInput = scanner.next();
		Date dateOfBirth = new SimpleDateFormat("dd-MM-yyyy").parse(dateInput);

		Student student = new Student(idStudent, name, surname, age,
				dateOfBirth);

		System.out.println("Enhorabuena, has creado la siguiente entrada:");
		System.out.println(student.toString());
	}

	public static void calculateOldestStudent() {
		System.out.println("Case 2");
	}

	public static void calculateAverageAge() {
		System.out.println("Case 3");
	}
}
