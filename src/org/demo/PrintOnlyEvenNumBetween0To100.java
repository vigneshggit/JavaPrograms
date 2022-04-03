package org.demo;

public class PrintOnlyEvenNumBetween0To100 {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("even : " + i);
			} else if (i % 2 == 1) {
				System.out.println("odd : " + i);
			}
		}
	}

}
