package com.threads;

public class Table {
	public static void main(String[] args) {
		Runnable r = () -> {  int num = Thread.currentThread().getName().charAt(0) - '0';

	    for (int i = 1; i <= 10; i++) {
	        System.out.println(num + " * " + i + " = " + (num * i));
	    }};
		Thread t1 = new Thread(r);
		t1.setName("2_THread1");
		Thread t2 = new Thread(r,"5_first thread");
		t1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
}
}
