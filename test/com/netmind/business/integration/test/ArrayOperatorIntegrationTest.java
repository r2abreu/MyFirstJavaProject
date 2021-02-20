package com.netmind.business.integration.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.netmind.business.ArrayOperator;
import com.netmind.excercises.ArrayGenerator;

public class ArrayOperatorIntegrationTest {

	@Test
	public void testSumEvenIndexElements() {
		ArrayGenerator generator = new ArrayGenerator();
		ArrayOperator operator = new ArrayOperator();

		int[] arr = generator.generateNaturalSequenceArray(100);

		assertEquals(operator.sumEvenIndexElements(arr), 2450);
	}

}
