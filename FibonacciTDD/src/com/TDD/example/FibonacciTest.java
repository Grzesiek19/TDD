package com.TDD.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testForResultFiboTermFor_0() {
		Fibonacci fibo = new Fibonacci();
		int fiboValueFor_0 = fibo.getFiboValue(0);
		assertEquals(0, fiboValueFor_0);
	}

	@Test
	public void testForResultFiboTermFor_1() {
		Fibonacci fibo = new Fibonacci();
		int fiboValueFor_1 = fibo.getFiboValue(1);
		assertEquals(1, fiboValueFor_1);
	}
}
