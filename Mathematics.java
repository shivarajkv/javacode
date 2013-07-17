package com.shivaraj.training;

import java.util.Scanner;

public class Mathematics {

	/**
	 * to print the square root of a function
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter the square root to be found out");
		double squareRoot = new Scanner(System.in).nextDouble();
		System.out.println(Math.sqrt(squareRoot));
		System.out.println("\n\nEnter the exponent  to be found out");
		double power = new Scanner(System.in).nextDouble();
		System.out.println(Math.exp(power));
		
		System.out.println("Enter the number for which log to be found out");
		double exp=new Scanner(System.in).nextDouble();
		System.out.println(Math.log(exp));
		
		System.out.println("Enter the radian for which sine value to be known");
		double radian = new Scanner(System.in).nextDouble();
		System.out.println(Math.sin(radian));
	}

}
