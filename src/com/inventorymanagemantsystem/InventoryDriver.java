package com.inventorymanagemantsystem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class InventoryDriver {
	public static void main(String[] args) {
		Inventory inventory = new Inventory(10);
		int quantity1 = (int)(Math.random() * 4) + 1;
		int quantity2 = (int) (Math.random()*4)+1;
		int quantity3 = (int) (Math.random()*4)+1;
		int quantity4 = (int) (Math.random()*4)+1;
//		Thread c1 = new Thread(new Customer(quantiry1,inventory));
//		Thread c2 = new Thread(new Customer(quantity2,inventory));
//		Thread c3 = new Thread(new Customer(quantity3,inventory));
//		Thread c4 = new Thread(new Customer(quantity4,inventory));
		
//		c1.start();
//		c2.start();
//		c3.start();
//		c4.start();
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		for(int i=1;i<5;i++) {
			executor.submit(new Customer((int)(Math.random() * 4) + 1,inventory));
			System.out.println(Thread.currentThread());
		}
		try {
			executor.awaitTermination(5, TimeUnit.SECONDS);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		executor.shutdown();
		
	}
}
