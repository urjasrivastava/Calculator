package com.calculator.Calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CalculatorApplicationTests {
	@Autowired
	private Calculator calculator;
	@Test
	public void testpow()
	{
		assertEquals(8,calculator.pow(2,3));
	}
	@Test
	public void testsqrt()
	{
		assertEquals(5.0,calculator.sqrt(25.0));
	}
	@Test
	public void testfact()
	{
		assertEquals(120,calculator.factorial(5));
	}
	@Test
	public void testlog()
	{
		assertNotEquals(8,calculator.log(10));
	}
	@Test
	void contextLoads() {
	}
}
