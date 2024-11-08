package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Ignore;
import org.junit.Test;

import com.junit.Calculator;

public class CalculatorTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}

	@Test
	public void testAddition() {
		System.out.println("Addition");
//		Calculator calc = new Calculator();
//		int actual = calc.addition(10, 20);
//		int expected = 30;
//		assertEquals(expected, actual);
	}

	@Test
	public void testSubtraction() {
		System.out.println("Subtraction");
//		Calculator calc = new Calculator();
//		int actual = calc.subtraction(10, 20);
//		int expected = -10;
//		assertEquals(expected, actual);
	}

}
