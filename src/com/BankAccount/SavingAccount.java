package com.BankAccount;

import java.util.Scanner;

public class SavingAccount extends Account{
	Scanner sc = new Scanner(System.in);
	public SavingAccount(int accountNumber, Customer customer,int balance) {
		super(accountNumber, customer,balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void deposit(int depositAmmount) {
		System.out.println("your current balance is: " + balance);
		
		 balance = balance+depositAmmount;
		 System.out.println("your new current balance is: "+balance);
		
	}

	@Override
	
	void withdraw(int withdrawAmmount) throws MinimumAmmount {
		
			
			if (withdrawAmmount-2000 < balance) {
				throw new MinimumAmmount("minimum ammount should not be less then 2000");
		}
			else {
		        balance -= withdrawAmmount;
		        System.out.println("Withdrawal successful.");
		        System.out.println("Current balance: " + balance);
		    }
	    } 
	}



