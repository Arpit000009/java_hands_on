package com.restaurant;

public class CloudKitchenOrder implements Orders{
//	Cloud Kitchen Order
//	=================
//	Inputs
//	    Customer Name
//	    Order Amount
//	    Delivery Distance (in km)
//
//	Pricing Rules
//	========
//	Delivery charge:
//	    Up to 5 km → ₹30
//	    Above 5 km → ₹60
//	    Final Amount = Order Amount + Delivery Charge
	String customerName;
	double orderAmount;
	int deliveryDistance;
	double GSTPercentage = 18;
	
	public CloudKitchenOrder(String cstomerName, int orderAmount, int deliveryDistance) {
		super();
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.deliveryDistance = deliveryDistance;
	}

	@Override
	public double calculateFinalAmount() {
		// TODO Auto-generated method stub
		int deliveryCharge = 0;
		if(deliveryDistance<5) {
			deliveryCharge = 30;
		}
		else {
			deliveryCharge = 60;
		}
		double totalAmount = orderAmount + deliveryCharge;
		totalAmount = totalAmount + (totalAmount*GSTPercentage)/100;
		return totalAmount;
	}

	
	@Override
	public String getOrderDetails() {
	    return "Customer: " + customerName +
	           ", Order Amount: " + orderAmount +
	           ", GST: " + GSTPercentage + "%";
	}


}
