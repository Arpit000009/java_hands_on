package com.lembda;

import java.util.Scanner;
import java.util.function.BiFunction;

public class LembdaDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		BiFunction<Integer, Integer, Integer> obj = (a,b)->a>b?a:b;
		System.out.println(obj.apply(m, n));
	}
	
	
}
