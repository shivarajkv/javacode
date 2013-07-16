package com.shivaraj.weeklyAssignment.PrintStackTrace;

public class StackTracer {

	public static void meth1(){
		meth2();
	}
	
	public static void meth2(){
		
		StackTraceElement[] ele =Thread.currentThread().getStackTrace();
		for (StackTraceElement stackTraceElement : ele) {
			System.out.println(stackTraceElement);
		}
	}
	public static void main(String[] args) {
			meth1();
	}

}
