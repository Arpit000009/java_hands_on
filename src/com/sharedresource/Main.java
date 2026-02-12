package com.sharedresource;

public class Main {
	public static void main(String[] args) {
		SharedResource sr = new SharedResource();
		
		Thread t1 = new Thread(()->{
			sr.producer(40);
		},"producer");
		Thread t2 = new Thread(()->{
			sr.consumer();},"consumer"
				);
		t1.start();
		t2.start();
		}
	}

