package com.shivaraj.training.exceptionRevisted;

public class ClassNotFoundExceptionDemo {


	public static void main(String[] args) {
		try {
			Class.forName("com.shivaraj.training.exception.Example");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
