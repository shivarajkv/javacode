package com.shivaraj.training.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamEx {


	public static void main(String[] args) {
		InputStream inputStream = null;
		BufferedInputStream stream = null;
		try {
			inputStream = new FileInputStream("D:\\shivaraj.txt");
			stream = new BufferedInputStream(inputStream);
			while(stream.available()>0){
				char c =(char)stream.read();
				System.out.print(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
