package com.shivaraj.training.exceptionRevisted;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		try{
			int a = 5/0;
		}catch(ArithmeticException e){
			System.out.println("cannot divide by zero");
			System.out.println("a=inifinity");
		}
	}

}
