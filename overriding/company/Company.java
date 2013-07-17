package com.shivaraj.training.overriding.company;

public class Company {

	
	public boolean isRuleFollowed = false;
	public final void defaultRule(){
		System.out.println("All company by default should follow this rule");
		if(this.isRuleFollowed){
			System.out.println(this.getClass().getName()+" follows the rule");
		}
	}
	
	public void companySpecificRule(){
		System.out.println("No company Specific rule");
	}
}
