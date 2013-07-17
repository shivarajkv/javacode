package com.shivaraj.training;

import java.util.Scanner;

public class TrianglePattern {

	/**     5
	 *     505
	 *    50005  
	 *   5000005  
	 *  555555555   
	 */  
	public static void main(String[] args) {
		
		
		System.out.println("Enter the number to be printed");
		int numberInUsingWihchPatternToBePrinted = new Scanner(System.in).nextInt();
		int numberOfSpace= numberInUsingWihchPatternToBePrinted-1;
		int index=1;
		for(int row=1;row<=numberInUsingWihchPatternToBePrinted-1;row++){
			for(int space=0;space<numberOfSpace;space++){
				System.out.print(" ");
			}
			numberOfSpace--;
			for(int column=0;column<index;column++ ){
				if(column==0||column==index-1){
					System.out.print(numberInUsingWihchPatternToBePrinted);
				}else{
					System.out.print(0);
				}
					
			}
			index=index+2;
			System.out.println();
		}
		for(int lastRow=0;lastRow<index;lastRow++){
			System.out.print(numberInUsingWihchPatternToBePrinted);
		}
	}

}
