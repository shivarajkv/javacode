package com.shivaraj.training.overriding.company;

public class Volvo extends Company {

	public Boolean isRuleFollowed;
	
	public Volvo(Boolean isRuleFollowed) {
		this.isRuleFollowed=isRuleFollowed;
	}
	
	@Override
	public void companySpecificRule() {
		System.out.println("Volvo have their specific rules");
	}
	
}
