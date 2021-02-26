/**
 * Class name: Student Console.
 * 
 * Shows terminal console and handles user selected options.
 * 
 * @author Arturo Abreu.
 * @version 1.0
 */

package com.netmind.presentation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.netmind.business.StudentBl;
import com.netmind.model.OptionEnum;
import com.netmind.model.Student;

public class StudentConsole {

	@SuppressWarnings("static-access")
	public static void selectOperation() {
		Scanner scanner = new Scanner(System.in);
		StudentBl studentBl = new StudentBl();
		OptionEnum option;

		int input;

		do {

			showPrincipalMenu();
			input = scanner.nextInt();
			option = OptionEnum.getEnumFromValue(input);

			switch (option) {
			case ADD_STUDENT:
				Student student = new Student();
				fillStudentProperties(student, scanner);
				studentBl.add(student);
				break;
			default:
				break;
			}
		} while (input != option.EXIT.getValue());

		scanner.close();
	}

	private static void showPrincipalMenu() {

		System.out.println("Hola, en que te puedo ayudar?");
		System.out.println("1. Agregar un nuevo estudiante.");
		System.out.println("2. Calcular el estudiante con mayor edad.");
		System.out.println(
				"3. Calcular la media de edad de todos los estudiantes");
	}

	public static void fillStudentProperties(Student student, Scanner scanner) {

		System.out.println("Interfaz de creacion de estudiante");
		System.out.println("Introduce los siguientes datos");

		System.out.println("Nombre:");
		student.setName(scanner.next());

		System.out.println("Apellido:");
		student.setSurname(scanner.next());

		System.out.println("Fecha de Nacimiento: [dd-mm-yyyy]");

		try {
			student.setDateOfBirth(
					new SimpleDateFormat("dd-MM-yyyy").parse(scanner.next()));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
