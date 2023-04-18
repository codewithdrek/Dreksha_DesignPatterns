package com.OrdersType;

import com.FixTemplet.FixTemplet;

public class OnlineOrder extends FixTemplet {

	@Override
	protected void selectOrder() {
		System.out.println("Select product online");
	}

	@Override
	protected void makePayment() {
		System.out.println("Make payment by PhonePay");
	}

	@Override
	protected void deliverProduct() {
		System.out.println("dispatch product ");
	}
	
	//processOrder () will be called auto kyu ki calles above extended
    //gift Wrap is also cal auto

}
