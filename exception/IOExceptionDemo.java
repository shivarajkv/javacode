package com.shivaraj.training.exceptionRevisted;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.shivaraj.xstreamExample.Citizen;

public class IOExceptionDemo {
	
	Citizen citizen = new Citizen();
	citizen.age=24;
	citizen.mobile.number=859;
	citizen.computer.computerName = "IntelPc";

	FileOutputStream fileOut;
	try {
		fileOut = new FileOutputStream("D:\\serializaedObject.bin");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(citizen);
		out.close();
		fileOut.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

}
