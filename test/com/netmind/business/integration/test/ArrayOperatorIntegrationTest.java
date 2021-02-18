package com.netmind.business.integration.test;

import static org.junit.Assert.*;

import com.netmind.business.ArrayOperator;

import com.netmind.data.ArrayGenerator;

import org.junit.Test;

public class ArrayOperatorIntegrationTest {
	
	@Test
	public void testReducer() {
		ArrayGenerator generator = new ArrayGenerator();
		ArrayOperator operator = new ArrayOperator();
		int[] arr = generator.generateNaturalSequenceArray(100);
		assertEquals(operator.sumEvenIndexElements(arr), 2450);
	}

}
