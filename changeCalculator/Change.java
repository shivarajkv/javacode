package com.shivaraj.weeklyAssignment.changeCalculator;

import java.util.Scanner;

public class Change {
	public static int change=0;
	public static int quaters=0;
	public static int dimes=0;
	public static int nickels=0;
	public static int remaining=0;
	
	public static void changeCalculator(int change){
		
			quaters=change/25;
			change=change%25;
			dimes=change/10;
			change=change%10;
			nickels=change/5;
			change=change%5;
			System.out.println("Quaters--> "+quaters);
			System.out.println("Dimes--> "+dimes);
			System.out.println("Nickles--> "+nickels);
			System.out.println("Pennis--> "+change);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the change u have");
		change=new Scanner(System.in).nextInt();
		changeCalculator(change);
		
	}

}
