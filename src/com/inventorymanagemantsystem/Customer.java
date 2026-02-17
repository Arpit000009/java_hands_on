package com.inventorymanagemantsystem;

public class Customer implements Runnable{
	int quantity;
	Inventory inventory;
	
	
	public Customer(int quantity,Inventory inventory) {
		this.inventory = inventory;
		this.quantity = quantity;
	}
	@Override
	public void run() {
		 
		inventory.purchase(quantity);
		
	}

}
