package com.shivaraj.training.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputAndOutputStream {
	public static void main(String[] args) throws IOException {
        
     InputStream inputStream = null;
     DataInputStream dataInputStream = null;
     FileOutputStream fileOutputStream = null;
     DataOutputStream dataOutputStream = null;
     
     try{
        fileOutputStream = new FileOutputStream("c:\\test.txt");
          
        dataOutputStream = new DataOutputStream(fileOutputStream);
          
           dataOutputStream.writeUTF("file input stream");
          
        dataOutputStream.flush();
        
        inputStream = new FileInputStream("c:\\test.txt");
        
        dataInputStream = new DataInputStream(inputStream);
        
        while(dataInputStream.available()>0)
        {
           String k = dataInputStream.readUTF();
           
           System.out.print(k+" ");
        }
     }catch(Exception e){
        e.printStackTrace();
     }finally{
        
        if(inputStream!=null)
           inputStream.close();
        if(dataInputStream!=null)
           dataInputStream.close();
        if(fileOutputStream!=null)
           fileOutputStream.close();
        if(dataOutputStream!=null)
           dataOutputStream.close();
     }
  }

}
