package com.TDD.example;

public class Fibonacci {

	private int term;

	public Fibonacci() {
		this.term = term;
		// TODO Auto-generated constructor stub
	}

	public int getFiboValue(int term) {
		int fibonacci = 1;
		if (term == 0) {
			return 0;
		} else if (term == 1) {
			return 1;
		} else {
			int fibo1 = 1;
			int fibo2 = 1;

			for (int i = 3; i <= term; i++) {

				fibonacci = fibo1 + fibo2;
				fibo1 = fibo2;
				fibo2 = fibonacci;
			}
			return fibonacci;
		}

	}
}
