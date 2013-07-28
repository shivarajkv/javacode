package com.shivaraj.xstreamExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializingExample {

	public static void main(String[] args) throws Exception {
		Computer computer = new Computer();
		computer.a = 10;
		
		FileOutputStream stream = new FileOutputStream("D:\\computer.bin");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);
		objectOutputStream.writeObject(computer);//serialized
		computer.a=20;
		FileInputStream fileInputStream = new FileInputStream("D:\\computer.bin");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		Computer deserialzed = (Computer)inputStream.readObject();
		System.out.println(deserialzed.a);
		
	}

}
