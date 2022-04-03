package org.demo;

public class FibonacciSeries {
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <= 10; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

}
