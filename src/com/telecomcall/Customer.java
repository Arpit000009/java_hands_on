package com.telecomcall;

//Build a Telecom Call Processing System.
//Multiple customers are:
//    Making calls simultaneously
//    Recharging their wallets simultaneously
//The system must:
//    Deduct balance safely
//    Log call records
//    Update total system revenue
//    Use wait() and notify() for call processing queue
//
//Customer Class
//==============
//Fields:
//    customerId
//    name
//    phoneNumber
//    walletBalance
//Methods:
//    synchronized void makeCall(int minutes)
//    synchronized void recharge(double amount)
//    double getBalance()
//
//Business rule:
//    Call rate = ₹2 per minute
//    If balance insufficient → throw InsufficientBalanceException
//
//CallRequest Class
//=================
//Fields:
//    requestId
//    phoneNumber
//    minutes
//This represents a call waiting to be processed.    
//
//CallQueue (Shared Resource)
//===========================
//addCall(CallRequest request)
//processCall()
//
//Store: Queue<CallRequest>
//
//Producer Threads
//================
//    Create multiple producer threads:
//They:
//    Randomly generate call requests
//    Add to CallQueue
//    Sleep randomly (simulate network delay)
//    
//Consumer Threads
//================
//Create multiple consumer threads:
//They:
//    Continuously process calls from queue
//    Deduct balance
//    Record call history
//    Update total revenue
public class Customer {
	int customerId;
	String name;
	String phoneNumber;
	int walletBalance;
	int minutes;
	int callRate = 2;
	public Customer(int customerId, String name, String phoneNumber, int walletBalance) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.walletBalance = walletBalance;
		
	}
	
	synchronized void makeCall(int minutes) throws InsufficientBalanceException {
		if(minutes*callRate>walletBalance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		else {
			walletBalance = walletBalance - minutes*callRate;
		}
	}
	
	synchronized void recharge(int amount) {
		walletBalance = walletBalance+amount;
	}
	
	double getBalance() {
		return walletBalance;
	}
}
