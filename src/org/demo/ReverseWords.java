package org.demo;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your words: ");
		
		String userInput = scan.nextLine();
	
		String rev = " ";
		String[] split = userInput.split(" ");
		// split[0] = come, split[1]= to, split[2]= school  
		
		for (int i= split.length-1; i>=0;i--) {
			
			rev = rev + " "+ split[i];
			
			
		}
		
		System.out.println("Reversed Words:"+rev);
		
	}

}
