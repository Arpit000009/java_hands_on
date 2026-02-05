package com.restaurant;

public class ResturantOrders implements Orders{
//	Restaurant Order
//	===============
//	Inputs
//	    Customer Name
//	    Order Amount
//	    GST Percentage
//	    
//	Pricing Rules
//	    GST is applied on the order amount
//	    Final Amount = Order Amount + GST
	String customerName;
	double orderAmount;
	double GSTPercentage = 18;
	
	
	
	public ResturantOrders(String customerName, double orderAmount) {
		super();
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		
	}

	@Override
	public double calculateFinalAmount() {
		// TODO Auto-generated method stub
		double totalAmount = orderAmount + (orderAmount * (GSTPercentage/100));
		
		return totalAmount;
	}

	
	@Override
	public String getOrderDetails() {
	    return "Customer: " + customerName +
	           ", Order Amount: " + orderAmount +
	           ", GST: " + GSTPercentage + "%";
	}


}
