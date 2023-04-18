package com.OrdersType;

import com.FixTemplet.FixTemplet;

public class StoreOrder extends FixTemplet{

	@Override
	protected void selectOrder() {
		System.out.println("Select product from store");
	}

	@Override
	protected void makePayment() {
		System.out.println("Make payment by cash");
	}

	@Override
	protected void deliverProduct() {
		System.out.println("deliver product");
	}

	//processOrder () will be called auto kyu ki calles above extended
    //gift Wrap is also cal auto	
}
