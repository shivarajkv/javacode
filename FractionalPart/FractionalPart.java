package com.shivaraj.weeklyAssignment.FractionalPart;

import java.util.Scanner;

public class FractionalPart {
	
	public static double value = 0;
	
	public static void FracPartPrinter(double value){
		String stringValue = Double.toString(value);
		String[] tempArray = stringValue.split("\\.");
		System.out.println("Fractional part of "+value+" is "+tempArray[1]);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("enter a value to know the fractional part of it");
		value = new Scanner(System.in).nextDouble();
		FracPartPrinter(value);
	}

}
