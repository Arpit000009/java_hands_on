package com.inventorymanagemantsystem;

public class InventoryDriver {
	public static void main(String[] args) {
		int quantiry1 = (int)(Math.random() * 4) + 1;
		int quantity2 = (int) (Math.random()*4)+1;
		int quantity3 = (int) (Math.random()*4)+1;
		int quantity4 = (int) (Math.random()*4)+1;
		Thread c1 = new Thread(new Customer(quantiry1));
		Thread c2 = new Thread(new Customer(quantity2));
		Thread c3 = new Thread(new Customer(quantity2));
		Thread c4 = new Thread(new Customer(quantity2));
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}
}
