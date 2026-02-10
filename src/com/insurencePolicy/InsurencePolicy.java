package com.insurencePolicy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


//Add a new policy
//Prevent duplicate policy numbers
//Update policy premium
//Locate policy 
//Recalculate premium
//Display all active policies


public class InsurencePolicy {
	Map<Integer, PolicyDetails> insurencePolicies = new HashMap<Integer, PolicyDetails>();
	
	void addPolicy(int policyNumber,PolicyDetails details) {
		insurencePolicies.put(policyNumber, details);
	}
	
	void findPolicyByNumber(int policyNumber) {
		for(Entry<Integer, PolicyDetails>entry: insurencePolicies.entrySet()) {
			if(entry.getKey()==policyNumber) {
				System.out.println("insurence number:"+entry.getKey());
				System.out.println(entry.getValue());
			}
			else {
				System.out.println("!policy not present");
			}
		}
	}
	
	double calculetePremium(int policyNumber) {
//		Premium Calculation Rules
//		Policy Type Premium Increase
//		Policy Type    Increase
//		HEALTH    +20%
//		LIFE    +35%
//		VEHICLE    +15%
//		TRAVEL    +10%

		double totalPremium = 0;
		for(Entry<Integer, PolicyDetails>entry: insurencePolicies.entrySet()) {
			if(entry.getKey()==policyNumber) {
				if(entry.getValue().policyType.endsWith("HEALTH")) {
					totalPremium = entry.getValue().getBasePremium();
					totalPremium = totalPremium + totalPremium*0.2;
				}
				
				if(entry.getValue().policyType.endsWith("LIFE")) {
					totalPremium = entry.getValue().getBasePremium();
					totalPremium = totalPremium + totalPremium*0.35;
				}
				if(entry.getValue().policyType.endsWith("VEHICLE")) {
					totalPremium = entry.getValue().getBasePremium();
					totalPremium = totalPremium + totalPremium*0.15;
				}
				if(entry.getValue().policyType.endsWith("TRAVEL")) {
					totalPremium = entry.getValue().getBasePremium();
					totalPremium = totalPremium + totalPremium*0.1;
				}
			}
			else {
				System.out.println("policy not present");
			}
		}
		return totalPremium;
	}
	
	void viewAllActivePolicies() {
		for(Entry<Integer, PolicyDetails>entry: insurencePolicies.entrySet()) {
			if(entry.getValue().policyStatus=="ACTIVE") {
				System.out.println("insurence number:"+entry.getKey());
				System.out.println(entry.getValue());
			}
		}
	}
	
}
