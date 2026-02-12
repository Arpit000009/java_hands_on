package com.telecomcall;

public class CallRequest {
	 int requestId;
	 String phoneNumber;
   	int minutes;
	public CallRequest(int requestId, String phoneNumber, int minutes) {
		super();
		this.requestId = requestId;
		this.phoneNumber = phoneNumber;
		this.minutes = minutes;
	}
   	
   	
}
