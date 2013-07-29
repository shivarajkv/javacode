package com.shivaraj.training.exceptionRevisted;


public class StackOverFlowErrorDemo {
	
	
	public void recursiveCalling(){
		recursiveCalling();// recrsive calling of this method will make the stack to be filled
		//which will result in a stack over flow error
	}

	public static void main(String[] args) {
		new StackOverFlowErrorDemo().recursiveCalling();
	}
}
