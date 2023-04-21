package com.VehicleType;
import com.automobile.Automobile;
import com.interfacev.WorkShop;

public class Taxi extends Automobile {

	public Taxi(WorkShop workShop1, WorkShop workShop2) {
		super(workShop1, workShop2);
	}

	public void manufacture() {
		System.out.print("Taxi is");
		WorkShop2.work();
		WorkShop1.work();
	}

}
