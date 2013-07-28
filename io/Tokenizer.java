package com.shivaraj.training.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {

	public static void main(String[] args) throws Exception {
		
		String[] symbolTableKeywordArray = {"for","abstract","new","switch","assert","package","synchronized","boolean","break","byte","case","catch","char","class","native","continue","default","do","if","double","else","enum","extends","final","finally","float","private","implements","import","instanceof","int","short","interface","long","super","this","protected","public","return","try","static","strictfp","while","throw","throws","transient","void","volatile"};
		String[] symbolTableOperatorArray = {"=","+","-","/","%","*","++","--","!","==","!=",">",">=","<","<=","&&","||","?:","~","<<",">>",">>>","&","^","|"};
		int keywordCount=0;
		int operatorCount=0;
		List<String> symbolTableKeywordList = Arrays.asList(symbolTableKeywordArray);
		List<String> symbolTableOperatorList = Arrays.asList(symbolTableOperatorArray);
		Pattern pattern = Pattern.compile("[\\w]+[\\s]*([\\w]+)[\\s]*[=]*[\\s]*[\\w]*[;]");
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\comment.txt"));
	    String nextLine= br.readLine();
	    while(nextLine!=null){
	    	String[] lineArray = nextLine.split("[\\s]+");
	    	for (String string : lineArray) {
				if(symbolTableKeywordList.contains(string)){
					keywordCount++;
					System.out.println(string);
				}else if(symbolTableOperatorList.contains(string)){
					operatorCount++;
					System.out.println(string);
				}
			}
	    	Matcher matcher = pattern.matcher(nextLine);
	    	if(matcher.find()){
	    		System.out.println(matcher.group(1));
	    	}
	    	nextLine=br.readLine();
	    }
		
		
	}

}
