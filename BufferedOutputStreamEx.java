package com.shivaraj.training.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {



	public static void main(String[] args) throws IOException {
		int[] inputValue = {5,4,3,2,1};
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
