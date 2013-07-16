package com.shivaraj.weeklyAssignment.overTime;

public class Employee {

	private int hoursWorked=0;
	private int overTime=0;
	private int overTimePay=0;

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public int getOverTime() {
		return overTime;
	}
	public int getOverTimePay() {
		return overTimePay;
	}
	public void setOverTimePay(int overTimePay) {
		this.overTimePay = overTimePay;
	}

	public void calculateOvertime(){

		if(hoursWorked<=40){
			overTimePay=0;
		}else{
			overTime=hoursWorked-40;
			overTimePay=overTime*12;
		}
	}



}
