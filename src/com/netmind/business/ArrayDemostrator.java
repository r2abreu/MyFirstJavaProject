package com.netmind.business;

public class ArrayDemostrator {

	public static void main(String[] args) {
		int[] arr = new int[101];
		
		for (int index = 0; index <= 100; index++) {
			arr[index] = index; 
		}
		
		int reducedArray = 0;
		
		for (int element : arr) {
			if(element % 2 == 0) {
				reducedArray += element;
			}
		}
		
		System.out.println(reducedArray);

	}

}
