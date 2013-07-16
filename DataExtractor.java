package com.shivaraj.training;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DataExtractor {




	public static void main(String[] args) {

		int forGoal=0;
		int againstGoal=0;
		int maxDiff=0;
		int minDiff=100;
		String maxDiffName=null;
		String minDiffName=null;
		String name=null;
		int diff=0;
		String dirLocation = "D:\\";

		try{
			FileInputStream fstream = new FileInputStream(dirLocation+"football.dat");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null)   {
				Pattern pattern = Pattern.compile("[\\d]{1,2}[\\s]*[-][\\s]*[\\d]{1,2}");
				Matcher matcher = pattern.matcher(strLine);
				Pattern pat = Pattern.compile("[\\d]{1,2}[.]{1}[\\s]*[A-Za-z_]+");
				Matcher matcher2 = pat.matcher(strLine);
				if(matcher.find()){
					if(matcher2.find())
						name=matcher2.group();
					String temp = matcher.group();
					String[] arrayOfMinAndMax = temp.split("-");
					forGoal = Integer.valueOf(arrayOfMinAndMax[0].trim());
					againstGoal = Integer.valueOf(arrayOfMinAndMax[1].trim());
					if(forGoal>againstGoal){
						diff=forGoal-againstGoal;
					}else{
						diff=againstGoal-forGoal;
					}
					if(diff>maxDiff){
						maxDiff=diff;
						maxDiffName=name;
					}else if(diff<minDiff){
						minDiff=diff;
						minDiffName=name;
					}
				}
			}

		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.print("maximum Diff name and Diff "+maxDiffName);
		System.out.println("---> "+maxDiff);
		System.out.print("minimum Diff name and Diff "+minDiffName);
		System.out.println("---> "+minDiff);

	}
}