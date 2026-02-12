package com.threads;

public class VolatileDemo {
	static volatile boolean flag = false;
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			while(!flag) {
			
			}
			System.out.println("flag value updated");
		},"Thread-1");
		Thread t2 = new Thread(()->{
			try {
				Thread.sleep(2);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			flag = true;
			System.out.println("flag value updated by:"+Thread.currentThread().getName());
		},"THread-2");
		t1.start();
		t2.start();
	}
}
