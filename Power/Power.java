package com.shivaraj.weeklyAssignment.Power;

import java.util.Scanner;

public class Power {
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		double number = new Scanner(System.in).nextDouble();
		System.out.println("enter the power to be raised");
		int power = new Scanner(System.in).nextInt();
		
		for(int i=1;i<=power-1;i++){
			number = number*number;
		}
		System.out.println(number);
	}

}
