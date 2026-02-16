package com.inventorymanagemantsystem;

public class Inventory {
	private int stock;
	
	public Inventory(int stock) {
		this.stock = stock;
		}
	
	
	synchronized void purchase(int quantity) {
		
		System.out.println("quaantity required: "+ quantity);
		if(stock<quantity) {
			System.out.println("not enough stocks");
		}
		else {
			stock = stock - quantity;
		}
		System.out.println("Current Stock: "+stock);
	}
}
