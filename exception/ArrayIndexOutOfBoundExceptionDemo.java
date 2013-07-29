package com.shivaraj.training.exceptionRevisted;

public class ArrayIndexOutOfBoundExceptionDemo {
	
	public static void main(String[] args) {
		int[] arrayWithSizeFive = new int[5];
		
		try{
			System.out.println(arrayWithSizeFive[8]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}

}
