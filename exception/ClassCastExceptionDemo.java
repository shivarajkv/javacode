package com.shivaraj.training.exceptionRevisted;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClassCastExceptionDemo {

	public static void main(String[] args) {

		Object x = new Integer(0);
		System.out.println((String)x);//Thrown to indicate that the code 
		//has attempted to cast an object to a subclass of which it is not an instance
	}

}
