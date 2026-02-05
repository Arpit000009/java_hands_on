package com.Insurance;

public class VehicleInsurence implements InsurencePolicy{
//	Vehicle Insurance Policy
//	Inputs
//	    Policy Holder Name
//	    Vehicle Type (TwoWheeler or FourWheeler)
//	    Vehicle Value
//	Premium Calculation Rules
//	    TwoWheeler
//	    Premium = 2% of vehicle value
//	    FourWheeler
//	Premium = 4% of vehicle value
	
	String policyHolderName;
	int wheelsOnVechicle;
	double vechicleValue;
	
	public VehicleInsurence(String policyHolderName, int wheelsOnVechicle, double vechicleValue) {
		super();
		this.policyHolderName = policyHolderName;
		this.wheelsOnVechicle = wheelsOnVechicle;
		this.vechicleValue = vechicleValue;
	}

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium = 0;
		if(wheelsOnVechicle==2) {
			premium =  (vechicleValue*2)/100;
		}
		if(wheelsOnVechicle==4) {
			premium = (vechicleValue*4)/100;
		}
		return Math.round(premium*100.00)/100.00;
	}
	
	

}
