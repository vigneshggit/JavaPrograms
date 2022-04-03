package org.demo;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 13;
		int rem = 0;
		if (num == 0 || num == 1) {
			System.out.println("o and 1 is not considered an prime number");
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				rem = 1;
			}
		}
		if (rem == 0) {
			System.out.println("prime number");
		} else {
			System.out.println("not an prime number");
		}
	}

}
