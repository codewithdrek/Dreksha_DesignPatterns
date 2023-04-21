package com.VehicleType;
import com.automobile.Automobile;
import com.interfacev.WorkShop;

public class Bus extends Automobile{

	public Bus(WorkShop workShop1, WorkShop workShop2) {
		super(workShop1, workShop2);
	}

	public void manufacture() {
    System.out.print("Bus is ");		
    WorkShop1.work();
    WorkShop2.work();
	}

}
