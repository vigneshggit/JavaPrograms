package org.demo;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num = 15551; 
		int rem = 0;
		int rev = 0;
		int n = num;
		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		if (n == rev) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not an palindrome number");
		}
	}

}
