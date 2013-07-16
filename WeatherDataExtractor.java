package com.shivaraj.training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeatherDataExtractor {

	public static final String rootDiretory="D:\\";
	public static final String fileName="weather.dat";

	public static void main(String[] args) {
		BufferedReader br = null;
		String[] dayMaxMinArray=null;
		int day=0;
		int max=0;
		int maxTempDay=0;
		int min=100;
		int minTempDay=0;
		int diffInTemp=101;
		int maxDiff=0;
		int minDiff=100;
		try {

			String currentLine;
			FileReader filereader=new FileReader(rootDiretory+fileName);
			br = new BufferedReader(filereader);
			while (( currentLine = br.readLine()) != null) {
				currentLine = currentLine.trim();
				currentLine = currentLine.replaceAll("\\*", "");
				Pattern pattern = Pattern.compile("^[\\d]{1,2}[\\s]*[\\d]{2}[\\s]*[\\d]{2}");
				Matcher matcher = pattern.matcher(currentLine);
				if(matcher.find()){
					String singleRowData=matcher.group().trim();
					singleRowData=singleRowData.replaceAll("[\\s]{2,}", " ");
					dayMaxMinArray=singleRowData.split("[\\s]");
					day=Integer.valueOf(dayMaxMinArray[0].trim());
					max=Integer.valueOf(dayMaxMinArray[1].trim());
					min=Integer.valueOf(dayMaxMinArray[2].trim());
					diffInTemp=max-min;
					if(maxDiff<diffInTemp){
						maxDiff=diffInTemp;
						maxTempDay=day;
					}else if(minDiff>diffInTemp){
						minDiff=diffInTemp;
						minTempDay=day;
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 

		System.out.print("max temp diff = "+maxDiff);
		System.out.println(" is on day --->"+maxTempDay);

		System.out.print("min temp diff = "+minDiff);
		System.out.println(" is on day -->"+minTempDay);
	}
}
