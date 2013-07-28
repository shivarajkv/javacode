package com.shivaraj.training.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {



	public static void main(String[] args) throws IOException {
		int[] inputValue = {66,67,68,69,70};
		FileOutputStream fileOutputStream =null;
		BufferedOutputStream bufferedOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("D:\\shivaraj.txt");
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			for (int i : inputValue) {
				bufferedOutputStream.write(i);
			}
			bufferedOutputStream.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			fileOutputStream.close();
			bufferedOutputStream.close();
		}
	}

}
