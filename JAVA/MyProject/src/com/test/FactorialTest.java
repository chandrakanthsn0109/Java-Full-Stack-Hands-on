package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.junit.Factorial;

public class FactorialTest {

	@Test
	public void test() {
		Factorial fac = new Factorial();
		int actual = fac.factorial(5);
		int expected = 120;
		assertEquals(expected, actual);
	}

}
