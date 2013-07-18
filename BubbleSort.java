package com.shivaraj.training;



public class BubbleSort{

	public static void main(String[] args) {
		int[] arr = {6,1,8,7,6};
		boolean isAlreadySorted = true;
	      int numberAlreadySorted = 0;
	      int tmp;
	      while (isAlreadySorted) {
	            isAlreadySorted = false;
	            numberAlreadySorted++;
	            for (int indexToarray = 0; indexToarray < arr.length - numberAlreadySorted; indexToarray++) {                                       
	                  if (arr[indexToarray] > arr[indexToarray + 1]) {                          
	                        tmp = arr[indexToarray];
	                        arr[indexToarray] = arr[indexToarray + 1];
	                        arr[indexToarray + 1] = tmp;
	                        isAlreadySorted = true;
	                  }
	            }                
	      }
	      for(int sortedArray=0;sortedArray<arr.length;sortedArray++)
	    	  System.out.println(arr[sortedArray]);
	}
	
	
}