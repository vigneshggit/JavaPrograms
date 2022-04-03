package org.demo;

public class CountOfOddNumAndEvenNum {
	public static void main(String[] args) {
		int oddCount = 0;
		int evenCount = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("evencount is : " + evenCount);
		System.out.println("oddcount is : " + oddCount);
	}

}
