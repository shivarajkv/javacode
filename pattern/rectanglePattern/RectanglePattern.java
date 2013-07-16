package com.shivaraj.weeklyAssignment.pattern.rectanglePattern;

import java.util.Scanner;

public class RectanglePattern {
	
	public static void pattern(int n){
		int lValue = 97;
		int rValue = lValue+n-1;
		for(int i=lValue;i<=rValue;i++){
			for(int j=lValue;j<=rValue;j++){
				if(i==lValue||i==rValue){
					System.out.print((char)j);
				}else{
					if(j==lValue||j==rValue){
						System.out.print((char)j);
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
			
		System.out.println("Enter the number of charater to be printed");
		int n = new Scanner(System.in).nextInt();
		pattern(n);
	}

}
