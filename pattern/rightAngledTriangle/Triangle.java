package com.shivaraj.weeklyAssignment.pattern.rightAngledTriangle;

public class Triangle {

	public static void generateTriangle(int n){
		int j=1;
		
		for (int i = 1; i <= n; i++) {
			int k=j;
			while(k>=1){
				System.out.print(i);
				k--;
			}
			System.out.println();
			j=j+2;
		}
	}
	public static void main(String[] args) {
		generateTriangle(7);
	}

}
