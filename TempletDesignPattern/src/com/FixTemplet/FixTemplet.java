package com.FixTemplet;

public abstract class FixTemplet {

	//All abstract method only one is not
	public boolean isGiftWrap;
	protected abstract void selectOrder();
	protected abstract void makePayment();
	protected void packing() {
		if (isGiftWrap) {
			System.out.println("Do gift wrap");
		}
		else {
			System.out.println("Not required");
		}
	}
	protected abstract void deliverProduct();
	
	public final void  processOrder(){
		selectOrder();
		makePayment();
		packing();
		deliverProduct();
	}
	
	
}
