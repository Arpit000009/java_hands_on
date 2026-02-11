package com.lembda;

import java.util.function.Function;
import java.util.function.Supplier;

public class OtpGenrator {
	public static void main(String[] args) {
		Supplier<Double> obj = ()-> Math.random()*900000+100000;
		
		for(int i=0;i<5;i++) {
			System.out.println(obj.get().intValue());
		}
		
	}
}
