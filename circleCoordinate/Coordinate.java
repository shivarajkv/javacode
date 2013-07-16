package com.shivaraj.weeklyAssignment.circleCoordinate;

public class Coordinate {

	public static void generateCoordinatesInsideCircle(int r){
		
		
		for(int i =0;i<r;i++){
			for(int j=0;j<r;j++){
				if((i*i)+(j*j)<(r*r)){
					System.out.println("co-ordinate ("+i+","+j+ ") lies inside circle");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
			
		generateCoordinatesInsideCircle(5);
	}

}
