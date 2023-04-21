package com.automobile;
import com.interfacev.WorkShop;

public abstract  class Automobile {

	protected WorkShop WorkShop1 ;
	protected WorkShop  WorkShop2;
	
	
	public Automobile(WorkShop workShop1, WorkShop workShop2) {
		WorkShop1 = workShop1;
		WorkShop2 = workShop2;
	}
	
	public abstract void manufacture();
	
}
