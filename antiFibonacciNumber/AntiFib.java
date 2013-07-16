package com.shivaraj.weeklyAssignment.antiFibonacciNumber;

import java.util.Scanner;

public class AntiFib {

	public static void fib(int n){
		
		int previousValue =1;
		int currentValue=1;
		int nextValue = 0;
		for(int i = 0;i<n-1;i++){
			for(int j=previousValue+1;j<currentValue;j++){
				System.out.print(j+" ");
			}
			nextValue=previousValue+currentValue;
			previousValue=currentValue;
			currentValue=nextValue;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of fibonacci series to be printed");
		fib(new Scanner(System.in).nextInt());	
	}

}
