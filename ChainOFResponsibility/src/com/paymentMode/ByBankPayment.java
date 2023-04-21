package com.paymentMode;

import com.abstractClass.PaymentHandler;

public class ByBankPayment extends PaymentHandler {
	@Override
	public void handlePayment(double amount) {
		
		if(amount<=500) {
			System.out.println("Paid using bank Account"+amount);
		}
		else {
			next.handlePayment(amount);
		}
	}

}
