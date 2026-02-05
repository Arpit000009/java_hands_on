package com.restaurant;

public class GroceryOrder implements Orders{
//	Grocery Order
//	======
//	Inputs
//	    Customer Name
//	    Order Amount
//	    Is Membership Holder (true / false)
//
//	Pricing Rules
//	    If customer is a member:
//	    Apply 10% discount
//	    Otherwise:
//	        No discount
//	        Final Amount = Order Amount – Discount
	String customerName;
	double orderAmount;
	boolean membershipHolder;
	
	

	public GroceryOrder(String customerName, double orderAmount, boolean membershipHolder) {
		super();
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.membershipHolder = membershipHolder;
	}

	@Override
	public double calculateFinalAmount() {
		// TODO Auto-generated method stub
		double totalAmount = 0;
		if (membershipHolder) {
		    totalAmount = orderAmount - (orderAmount * 0.1);
		} else {
		    totalAmount = orderAmount;
		}

		return totalAmount;
	}

	@Override
	public String getOrderDetails() {
	    return "Customer: " + customerName +
	           ", Order Amount: " + orderAmount;
	}


}
