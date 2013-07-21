package com.shivaraj.training.overriding;


/*
 * 
 * This program removes the comment lines and counts the actual lines of codes
 * 
 * 
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingLinesInAProgram {

	public static void main(String[] args) {
		File file = new File("FileName");
		java.lang.String content="";
		int count=0;
		boolean isFoundCommentStarting=false;
		boolean isFoundCommentEnding=false;
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				java.lang.String nextLine=scanner.nextLine().trim();
				for (int i = 0; i < nextLine.length(); i++) {
						if(i!=nextLine.length()-1&&nextLine.charAt(i)=='/'&&nextLine.charAt(i+1)=='*'&&isFoundCommentStarting!=true){
							isFoundCommentStarting=true;
							i=i+2;
						}
						if(i<nextLine.length()-1&&nextLine.charAt(i)=='*'&&nextLine.charAt(i+1)=='/'&&isFoundCommentStarting==true){
							isFoundCommentEnding=true;
							isFoundCommentStarting=false;
							i=i+2;
						}
						if(isFoundCommentStarting==false&&isFoundCommentEnding==true){
							content=content+nextLine.charAt(i);
						}
						
				}
				content=content+"\n";
			}
			content=content.replaceAll("//[\\w\\s]*[\\n]", "\n").trim();
			String[] contentString = content.split("\n");
			for (String string : contentString) {
				if(string.trim().length()>0){
					count++;
				}
			}
			System.out.println("Number of actual coding lines= "+count);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
