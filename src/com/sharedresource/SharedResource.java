package com.sharedresource;
//create a class called sharedresource having a field as data and flag
//create a method called producer which takes some value from the user and sets the data field
//beore settting the filed check your flag
//create one more method called consumer which cheks the flag and if data is available then display the data
//create another class having main method which creates producer and consumer as threads

import java.util.Scanner;

public class SharedResource {
	int data;
	boolean flag = false;
	
	Scanner sc = new Scanner(System.in);
	
	public synchronized void producer(int data){
		try {
			while(flag) {
				wait();
			}
			System.out.println("enter data to produce:");
			data = sc.nextInt();
			this.data = data;
			flag = true;
			
			System.out.println("produced data:"+data);
			notify();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void consumer() {
		while(!flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("consumed data:"+ data);
		flag = false;
		notify();
	}
}
