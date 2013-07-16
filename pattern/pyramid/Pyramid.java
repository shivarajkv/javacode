package com.shivaraj.weeklyAssignment.pattern.pyramid;

public class Pyramid {

	public static void generatePyramid(int n){
		for(int i =1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		generatePyramid(5);
		
	}

}
