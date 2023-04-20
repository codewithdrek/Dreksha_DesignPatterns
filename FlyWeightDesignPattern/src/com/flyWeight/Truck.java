package com.flyWeight;

import com.interfaceD.Vehicle;

public class Truck  implements Vehicle{

	public static String MAXSPEED;//Intirnic  properties
	public static  String COLOR; //Extersic properties


	
	public Truck(){
		MAXSPEED= "120 KM/h";
	}
	@Override
	public void startVehicle() {
		System.out.println(COLOR +":"+ "start with max speed with max speed:"+MAXSPEED);
	}

	@Override
	public void setcolor(String color) {
		Truck.COLOR=color;
	}
}
