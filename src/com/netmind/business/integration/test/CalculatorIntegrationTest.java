package com.netmind.business.integration.test;

import static org.junit.Assert.*;

import com.netmind.business.Calculator;

import org.junit.Test;

public class CalculatorIntegrationTest {
	
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.add(4, 2), 6);
	}

	@Test
	public void testSubstract() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.substract(4, 2), 2);
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

}
