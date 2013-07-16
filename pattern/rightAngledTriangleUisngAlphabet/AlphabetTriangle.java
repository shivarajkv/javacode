package com.shivaraj.weeklyAssignment.pattern.rightAngledTriangleUisngAlphabet;

public class AlphabetTriangle {
	
	public static void triangle(int n){
		
		int initialValue =97;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)initialValue);
				initialValue = initialValue+1;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		triangle(6);
	}

}
