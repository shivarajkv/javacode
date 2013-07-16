package com.shivaraj.weeklyAssignment.triangleClassification;

import java.util.Scanner;

public class TriangleClassifier {

	public static double hypotenuse=0;
	public static double adjacent=0;
	public static double opposite=0;
	
	public static void classifyTriangle(double hypotenuse,double adjacent,double opposite){
		double hypotenuseSquare = hypotenuse*hypotenuse;
		double adjacentSquare = adjacent *adjacent;
		double oppositeSquare = opposite*opposite;
		double sum= adjacentSquare+oppositeSquare;
		
		if(hypotenuseSquare==adjacentSquare+oppositeSquare){
			System.out.println("Right  triangle");
		}else if(hypotenuseSquare<adjacentSquare+oppositeSquare){
			System.out.println("Acute triangle");
		}else if (hypotenuseSquare<adjacentSquare+oppositeSquare) {
			
		}
		
		if (adjacentSquare==oppositeSquare) {
			if(oppositeSquare==hypotenuseSquare)
				System.out.println("equilateral triangle");
			else
				System.out.println("isosceles triangle");
		}else if(adjacentSquare==hypotenuseSquare){
			if(hypotenuseSquare==oppositeSquare)
				System.out.println("equilateral triangle");
			else
				System.out.println("isosceles triangle");
			
		}else if(hypotenuseSquare==oppositeSquare){
			if(oppositeSquare==adjacentSquare)
				System.out.println("equilateral triangle");
			else
				System.out.println("isosceles triangle");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the hypotenuse value");
		hypotenuse= scanner.nextDouble();
		System.out.println("Enter the adjacent value");
		adjacent=scanner.nextDouble();
		System.out.println("Enter the oppsite side value");
		opposite=scanner.nextDouble();
		classifyTriangle(hypotenuse, adjacent, opposite);
		
	}

}
