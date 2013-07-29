package com.shivaraj.training.exceptionRevisted;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionDemo {

	
	public static void main(String[] args) {
		
		 File sourceFolder =new File("sourceFolder.txt");
		 try {
			FileInputStream fileInputStream = new FileInputStream(sourceFolder);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 
	}
}
