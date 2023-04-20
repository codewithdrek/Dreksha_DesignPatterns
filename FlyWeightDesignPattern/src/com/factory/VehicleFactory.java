package com.factory;

import java.util.HashMap;

import com.flyWeight.Cycle;
import com.flyWeight.Truck;
import com.interfaceD.Vehicle;

public class VehicleFactory {

	static HashMap<String, Vehicle> hashMap = new HashMap<String, Vehicle>();

	
	
	
	public static Vehicle getVehicle(String type) {
		Vehicle vehicle = null;
		if (hashMap.containsKey(type)) {
			vehicle = hashMap.get(type); // Already present hai
		}

		else {
			switch (type) {
			case "Cycle":
				vehicle = new Cycle();
                 break;
			case "Truck":
				vehicle = new Truck();
				break;
			default:
				throw new IllegalArgumentException("Vehicle type" + type+" doesn't exesit value.");
			}

			hashMap.put(type, vehicle);
		}
		return vehicle;
	}
}
