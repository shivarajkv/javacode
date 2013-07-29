package com.shivaraj.xstreamExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;

public class XstreamTester {
	
	public static void main(String[] args) throws IOException {
		Citizen citizen = new Citizen();
		citizen.age=24;
		citizen.mobile.number=859;
		
		XStream stream = new XStream();
		stream.alias("shivaraj", Citizen.class);
		File file = new File("D:\\serialized.xml");
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bufferedWriter = new BufferedWriter(fw);
		stream.toXML(citizen, bufferedWriter);
		
		FileReader fileReader = new FileReader("D:\\serialized.xml");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Citizen newCitizen = (Citizen)stream.fromXML(bufferedReader);
		System.out.println(newCitizen.age);
		System.out.println(newCitizen.mobile.number);
	}

}
