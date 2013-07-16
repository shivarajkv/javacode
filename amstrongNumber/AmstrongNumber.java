package com.shivaraj.weeklyAssignment.amstrongNumber;

public class AmstrongNumber {
	
	public static void generateAmstrongNumber(int n){
		int sum =0;
		int copyValue=n;
		int remainder=0;
		while(copyValue>0){
			remainder= copyValue%10;
			sum = sum +(remainder*remainder*remainder);
			copyValue=copyValue/10;
		}
		if(sum==n){
			System.out.println(n+" is an amstrong number");
		}
	}
	
	public static void main(String[] args) {
		
		for(int i=1;i<1000;i++){
			generateAmstrongNumber(i);
		}
	}

}
