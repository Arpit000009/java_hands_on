package com.inventorymanagemantsystem;

public class Customer implements Runnable{
	int quantity;
	static Inventory inventory = new Inventory(10);
	
	
	public Customer(int quantity) {
//		this.inventory = inventory;
		this.quantity = quantity;
	}
	@Override
	public void run() {
		
		inventory.purchase(quantity);
		
	}

}
