package com.shivaraj.training.overriding;

public class BubbleSortForFindingRabbitAndTurtle {

	
	public static void main(String[] args) {
		int[] arr = {1,6,8,7,6};
		boolean isAlreadySorted = true;
	      int numberAlreadySorted = 0;
	      int tmp;
	      int rabbit=arr.length;
	      int turtle=0;
	      int numberOfSwap=0;
	      while (isAlreadySorted) {
	            isAlreadySorted = false;
	            numberAlreadySorted++;
	            numberOfSwap=0;
	            for (int indexToarray = 0; indexToarray < arr.length - numberAlreadySorted; indexToarray++) {                                       
	                  if (arr[indexToarray] > arr[indexToarray + 1]) {                          
	                        tmp = arr[indexToarray];
	                        arr[indexToarray] = arr[indexToarray + 1];
	                        arr[indexToarray + 1] = tmp;
	                        isAlreadySorted = true;
	                        numberOfSwap++;
	                  }
	            }
	            if(numberOfSwap>turtle){
	            	turtle=numberOfSwap;
	            }else if(numberOfSwap<rabbit){
	            	rabbit=numberOfSwap;
	            }
	      }
	      
	      System.out.println("rabbit-->"+rabbit);
	      System.out.println("turtle-->"+turtle);
	      for(int sortedArray=0;sortedArray<arr.length;sortedArray++)
	    	  System.out.println(arr[sortedArray]);
	}

}
