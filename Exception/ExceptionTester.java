package com.shivaraj.training.exception;

public class ExceptionTester {

	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.shivaraj.training.exception.Example");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try{
			int a = 5/0;
		}catch(ArithmeticException e){
			System.out.println("cannot divide by zero");
			System.out.println("a=inifinity");
		}
		
	}

}
