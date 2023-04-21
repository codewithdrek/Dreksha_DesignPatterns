package com.paymentMode;

import com.abstractClass.PaymentHandler;

public class ByCCPayment extends PaymentHandler{


	@Override
	public void handlePayment(double amount) {
		
		if(amount <=10000) {
			System.out.println("Paid using CC Account"+amount);
		}
		else {
			next.handlePayment(amount);
		}
	}
}
