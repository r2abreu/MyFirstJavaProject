package com.netmind.presentation;

import java.util.Scanner;

import com.netmind.business.ArrayOperator;
import com.netmind.excercises.ArrayGenerator;

public class Prompter {
	public static void main(String[] args) {
		ArrayOperator operator = new ArrayOperator();
		ArrayGenerator generator = new ArrayGenerator();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("De cuantos elementos quieres la lista?");
		int requestedArraySize = scan.nextInt();
		
		int[] generatedArray = generator.generateNaturalSequenceArray(
				requestedArraySize);
		
		int sumResult = operator.sumEvenIndexElements(generatedArray);
		
		System.out.printf("Genial, la suma de los elementos en las posiciones "
				+ "pares es %d", 
				sumResult);
		
		scan.close();
	}
}
