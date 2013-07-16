package com.shivaraj.weeklyAssignment.factorial;

import java.util.Scanner;

public class Factorial {
	
	public static int factorialNumber;
	
	public static void fact(int factorialNumber){
		int n = factorialNumber;
		while(n>1){
		factorialNumber = factorialNumber*--n;
		}
		System.out.println("Factorial is 6"+factorialNumber);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number to find its factorial");
		factorialNumber = new Scanner(System.in).nextInt();
		fact(factorialNumber);
	}

}
