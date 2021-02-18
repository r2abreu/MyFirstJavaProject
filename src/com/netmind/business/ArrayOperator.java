package com.netmind.business;

public class ArrayOperator {

	public int sumEvenIndexElements(int[] arr) {
		int sumResult = 0;
		
		for (int index = 0; index < arr.length; index++) 
			sumResult += (index % 2 == 0) 
			? arr[index] 
			: 0;
		
		return sumResult;
	}

}
