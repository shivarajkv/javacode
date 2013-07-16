package com.shivaraj.weeklyAssignment.overTime;

import java.util.Scanner;


public class Payer {
	
	public static void main(String[] args) {
		for(int i =0;i<10;i++){
			System.out.println("Enter the details of employee");
			Employee employee = new Employee();
			System.out.println("Enter hour's worked");
			employee.setHoursWorked(new Scanner(System.in).nextInt());
			employee.calculateOvertime();
			System.out.println("overtime pay = "+employee.getOverTimePay());
		}
	}

}
