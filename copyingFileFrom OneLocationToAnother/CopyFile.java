package com.shivaraj.training.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

	public static void main(String[] args) {
		
		BufferedWriter bufferedWriter = null;
		BufferedReader bufferedReader = null;
		String line = null;
		StringBuffer buffer =null;
		
		try {
			FileReader fileReader = new FileReader("D:\\comment.txt");
			bufferedReader = new BufferedReader(fileReader);
			buffer = new StringBuffer();
			while((line = bufferedReader.readLine()) != null){
				buffer=buffer.append(line+"\n");
			}
			File file = new File("D:\\test.txt");
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			bufferedWriter = new BufferedWriter(fw);
			bufferedWriter.write(buffer.toString());
			bufferedReader.close();
			bufferedWriter.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
