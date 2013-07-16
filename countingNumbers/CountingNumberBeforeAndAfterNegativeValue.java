package com.shivaraj.weeklyAssignment.countingNumbers;

public class CountingNumberBeforeAndAfterNegativeValue {
	
	public static int[] a ={13,2,15,-8,9,87,1,2,1,1,21,0};
	
	public static void count(int[] a) {
		int count=0;
		int i=0;		
		while(a[i]>0){
			count++;
			i++;
		}
		System.out.println("count before zero's "+count);
		System.out.println("count after zero's"+(a.length-(count+1)));
	}
	
	public static void main(String[] args) {
		count(a);
	}

}
