package com.shivaraj.training.exceptionRevisted;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {

		String nullString = null;// installing a string with null

		try{
			nullString.charAt(8);// accessing the variable nullString. which will result in a null pointer exception
		}catch(NullPointerException e){
			System.out.println("caught an null pointer exception");
		}

	}

}
