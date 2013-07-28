package com.shivaraj.training.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

	public static void main(String[] args) {
		InputStream inStream = null;
		OutputStream outStream = null;
	 
	    	try{
	 
	    	    File sourceFolder =new File("sourceFolder.txt");
	    	    File destinationFolder =new File("destination");
	    	    destinationFolder.mkdir();
	    	    File file = new File("destinationFile.txt");
	 
	    	    inStream = new FileInputStream(sourceFolder);
	    	    outStream = new FileOutputStream(file);
	 
	    	    byte[] buffer = new byte[1024];
	 
	    	    int length;
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	 
	    	    inStream.close();
	    	    outStream.close();
	 
	 
	    	}catch(IOException e){
	    	    e.printStackTrace();
	    	}
	}

}
