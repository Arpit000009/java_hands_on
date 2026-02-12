package com.threads;

public class NumberThread implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Current Thread is :"+Thread.currentThread().getName()+"-"+i);
		}
	}
}
