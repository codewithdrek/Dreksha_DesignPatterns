package com.Test;

import com.factory.VehicleFactory;
import com.interfaceD.Vehicle;

public class Test {

	public static void main(String[] args) {
		
		Vehicle vehicle  = VehicleFactory.getVehicle("Cycle");
		vehicle.setcolor("Blue");
		vehicle.startVehicle();
		
		//you can Create n num of 
		
		Vehicle truck = VehicleFactory.getVehicle("Truck");
		truck.setcolor("BLACK");
		truck.startVehicle();
		
		Vehicle truck2 = VehicleFactory.getVehicle("Truck");
		truck2.setcolor("BROWN");
		truck2.startVehicle();
		
		
		Vehicle truck3 = VehicleFactory.getVehicle("Truck");
		truck3.setcolor("XXXX");
		truck3.startVehicle();
		
		
		Vehicle truck4 = VehicleFactory.getVehicle("Truck");
		truck4.setcolor("IOIO");
		truck4.startVehicle();
		

		Vehicle vehicle2= VehicleFactory.getVehicle("JCB");
	}
}



