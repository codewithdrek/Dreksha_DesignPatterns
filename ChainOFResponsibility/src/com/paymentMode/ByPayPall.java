package com.paymentMode;

import com.abstractClass.PaymentHandler;

public class ByPayPall extends PaymentHandler{


	public void handlePayment(double amount) {
		
		if(amount<=1500) {
			System.out.println("Paid using PayPall Account"+amount);
		}
		else {
			next.handlePayment(amount);
		}
	}
}
