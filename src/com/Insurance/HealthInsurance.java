package com.Insurance;

public class HealthInsurance implements InsurencePolicy{
	
//	Health Insurance Policy
//	Inputs
//	    Policy Holder Name
//	    Age (in years) 
//	    Base Premium
//	    Sum Assured
//	    
//	Premium Calculation Rules
//	    Base Premium + (sum assured/55)
//	    If the policy holder’s age is greater than 45 years:
//	    Add 20% surcharge to the base premium
//	Otherwise:
//	    Premium remains the base premium
	String policyHolderName;
	int age;
	double sumAssured;
	double basePremium = 1000;
	
	
	public HealthInsurance(String policyHolderName, int age, double sumAssured) {
		super();
		this.policyHolderName = policyHolderName;
		this.age = age;
		this.sumAssured = sumAssured;
		
	}


	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium;
		if(age<45) {
			premium =  basePremium + (sumAssured/(80-age));
		}
		else {
			premium =  basePremium + (sumAssured/(80-age));
			premium = premium + (premium*20)/100;
		}
		return Math.round(premium*100.0)/100.0;
				
				
	}

}
