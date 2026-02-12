package com.telecomcall;

import java.util.LinkedList;
import java.util.Queue;

public class CallQueue {
	Queue<CallRequest> queue = new LinkedList<CallRequest>();
	
	void addCall(CallRequest callRequest) {
		
		
		queue.add(callRequest);
	}
	
	CallRequest processCall() {
		return null;
		
	}
}
