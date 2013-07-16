package com.shivaraj.weeklyAssignment.seriesCalculation;

public class Series {

	public  static void getTheSumOftheSeries(){
		
		double sum=0;
		for(double i=1;i<=15;){
			sum=sum+(1/i);
			i=i+2;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {

		getTheSumOftheSeries();
	}

}
