package com.insurencePolicy;

public class InsurenceDetails {
	int policyNumber;
	PolicyDetails details;

	public InsurenceDetails(int policyNumber, PolicyDetails details) {
		super();
		this.policyNumber = policyNumber;
		this.details = details;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public PolicyDetails getDetails() {
		return details;
	}

	public void setDetails(PolicyDetails details) {
		this.details = details;
	}

}
