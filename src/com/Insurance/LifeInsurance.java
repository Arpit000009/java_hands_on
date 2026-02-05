package com.Insurance;

public class LifeInsurance implements InsurencePolicy{
	
	private String policyHolderName;
	private double sumAssured;
	private int policyTerms;
	
	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium =  ((sumAssured/policyTerms)*5)/100;
		return premium;
		
	}
//	Life Insurance Policy
//	Inputs
//	    Policy Holder Name
//	    Sum Assured
//	    Policy Term (in years)
//	Premium Calculation Rules
//	    Annual premium is calculated based on:
//	    Total coverage amount
//	    Duration of the policy
//	A fixed rate of 5% is applied on the per-year coverage amount
	
	

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public LifeInsurance(String policyHolderName, double sumAssured, int policyTerms) {
	super();
	this.policyHolderName = policyHolderName;
	this.sumAssured = sumAssured;
	this.policyTerms = policyTerms;
}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public double getSumAssured() {
		return sumAssured;
	}

	
	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}

	public int getPolicyTerms() {
		return policyTerms;
	}

	public void setPolicyTerms(int policyTerms) {
		this.policyTerms = policyTerms;
	}
	
	

}
