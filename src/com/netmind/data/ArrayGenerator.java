package com.netmind.data;

public class ArrayGenerator {
	public int[] generateNaturalSequenceArray(int size) {
		int[] arr = new int[size];
		for (int index = 0; index < size; index++) {
			arr[index] = index; 
		}
		
		return arr;
	}
}