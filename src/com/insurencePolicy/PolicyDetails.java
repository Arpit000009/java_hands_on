package com.insurencePolicy;

public class PolicyDetails {
//	Insurance Policy Details
//	Each insurance policy record must contain:
//	    Policy Number (Integer)
//	    Customer Name (String)
//	    Policy Type (String: HEALTH, LIFE, VEHICLE, TRAVEL)
//	    Customer Age (Integer)
//	    Base Premium (Double)
//	    Policy Status (String: ACTIVE, EXPIRED)
	
	
	String cutomerName;
	String policyType;
	int customerAge;
	double basePremium;
	String policyStatus;
	public PolicyDetails( String cutomerName, String policyType, int customerAge,
			double basePremium, String policyStatus) {
		super();
	
		this.cutomerName = cutomerName;
		this.policyType = policyType;
		this.customerAge = customerAge;
		this.basePremium = basePremium;
		this.policyStatus = policyStatus;
	}
	
	public String getCutomerName() {
		return cutomerName;
	}
	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public double getBasePremium() {
		return basePremium;
	}
	public void setBasePremium(double basePremium) {
		this.basePremium = basePremium;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	@Override
	public String toString() {
		return "PolicyDetails [cutomerName=" + cutomerName + ", policyType=" + policyType + ", customerAge="
				+ customerAge + ", basePremium=" + basePremium + ", policyStatus=" + policyStatus + "]";
	}
	
	
}
