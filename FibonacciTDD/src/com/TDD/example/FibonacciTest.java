package com.TDD.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testForResultFiboTermFor_0() {
		Fibonacci fibo = new Fibonacci(0);
		int fiboValueFor_1 = fibo.getFiboValue();
	    assertEquals(0,fiboValueFor_1);
	}

}
