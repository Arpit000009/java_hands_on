package com.threads;

public class BankAccountDriver {
	public static void main(String[] args) {
		BankAccount bankaccount = new BankAccount(20000);
		Runnable task1 = ()->bankaccount.widthdraw(1800);
		Runnable task2 = ()->bankaccount.widthdraw(2400);
		Thread t1 = new Thread(task1,"Thread-1");
		Thread t2 = new Thread(task2,"Thread-2");
	}
}
