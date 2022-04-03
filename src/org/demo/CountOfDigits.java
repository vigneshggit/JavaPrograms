package org.demo;

import java.util.Scanner;

public class CountOfDigits {
	public static void main(String[] args) {
		// remove a number, increasing the count
		Scanner scan = new Scanner(System.in);
		System.out.println("enter ur digits : ");
		int nextInt = scan.nextInt();
		int count = 0;
		while (nextInt > 0) {
			nextInt = nextInt / 10;
			count++;
		}
		System.out.println("count of digt is : " + count);
	}

}
