package com.flyWeight;

import com.interfaceD.Vehicle;

public class Cycle implements Vehicle{


	public static String MAXSPEED ;//Intirnic 
	public static  String COLOR; //Extr



	public Cycle() {
		MAXSPEED= "20km/h";
	}
	@Override
	public void setcolor(String color) {
		Cycle.COLOR=color;
	}

	@Override
	public void startVehicle() {
		System.out.println(COLOR +":"+ "start with max speed :"+ MAXSPEED);

	}
	

}
