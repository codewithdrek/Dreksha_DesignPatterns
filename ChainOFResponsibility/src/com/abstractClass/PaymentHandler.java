package com.abstractClass;

public abstract class PaymentHandler {
	
	protected PaymentHandler next;
	
	public void setNext(PaymentHandler handler){
	
		this.next=handler;
	}

	//abstract Method
	public abstract void handlePayment(double amount);
}
