package com.shivaraj.training.overriding.company;

public class Tester {

	
	public static void main(String[] args) {
		
		Company volvoCompany = new Volvo(true);
		Company tataCompany= new Tata(true);
		
		volvoCompany.defaultRule();
		volvoCompany.companySpecificRule();
		
		tataCompany.defaultRule();
		tataCompany.companySpecificRule();
	}

}
