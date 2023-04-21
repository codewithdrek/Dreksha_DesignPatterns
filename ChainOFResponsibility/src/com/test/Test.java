package com.test;

import com.abstractClass.PaymentHandler;
import com.paymentMode.ByBankPayment;
import com.paymentMode.ByCCPayment;
import com.paymentMode.ByPayPall;

public class Test {

	public static void main(String[] args) {
		PaymentHandler bank = new ByBankPayment();
		PaymentHandler payPall = new ByPayPall();
		PaymentHandler cc = new ByCCPayment();

		bank.setNext(payPall);
		payPall.setNext(cc);

		bank.handlePayment(10000);//cc
		bank.handlePayment(100);//bank
		bank.handlePayment(1400);//paypall
		
	}

}
