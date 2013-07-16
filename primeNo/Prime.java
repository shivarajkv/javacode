package com.shivaraj.weeklyAssignment.primeNo;

import java.util.Scanner;

public class Prime {
	
	public static int prime;
	
	public static void primeNumber(int value){
		int threshold = value/2;
		boolean flag = false;
		
		for(int i =2;i<=threshold;i++){
			if(value%i!=0){
				flag=true;
			}else{
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		prime= new Scanner(System.in).nextInt();
		primeNumber(prime);
		
	}

}
