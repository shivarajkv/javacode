package com.shivaraj.training;

import java.util.Scanner;

public class StringFindAndReplace {

	/**
	 * Implementing find and replace in a string
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the main string");
		String str = scanner.nextLine();
		
		System.out.println("Enter the string or character to be find");
		String find = scanner.nextLine();
		
		System.out.println("Enter the string or character to be replaced");
		String replace = scanner.nextLine();
		int indexOfFindString=0;
		boolean isFullyParsed=true;
		
		for(int indexOfMainString=0;indexOfMainString<str.length();){
			 isFullyParsed=true;
			if(str.charAt(indexOfMainString)==find.charAt(0)){
				for(indexOfFindString=0;indexOfFindString<find.length();indexOfFindString++){
					if(str.charAt(indexOfMainString+indexOfFindString)!=find.charAt(indexOfFindString)){
						isFullyParsed=false;
						break;
					}
				}
			}
			
			 if(str.charAt(indexOfMainString)!=find.charAt(0)){
				System.out.print(str.charAt(indexOfMainString));
				isFullyParsed=false;
			}
			 if(isFullyParsed){
				for(int indexOfReplaceString=0;indexOfReplaceString<replace.length();indexOfReplaceString++){
					System.out.print(replace.charAt(indexOfReplaceString));
					
				}
				
			}
			 if(isFullyParsed)
			indexOfMainString=indexOfMainString+indexOfFindString;
			 else
				 indexOfMainString++;
		}
	}

}
