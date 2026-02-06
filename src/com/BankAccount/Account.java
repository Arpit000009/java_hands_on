package com.BankAccount;

public abstract class Account {
	int accountNumber;
	Customer customer;
	int balance;
	
	public Account(int accountNumber, Customer customer,int balance) {
		super();
		this.accountNumber = accountNumber;
		this.customer = customer;
		this.balance = balance;
	}
	abstract void deposit(int depositAmmount);
	abstract void withdraw(int withdrawAmmount) throws MinimumAmmount;
	
}
