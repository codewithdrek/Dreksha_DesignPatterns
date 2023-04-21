package com.test;
import com.VehicleType.Bus;
import com.VehicleType.Taxi;
import com.automobile.Automobile;
import com.workshop.Assemble;
import com.workshop.Produce;

public class Test {

	public static void main(String[] args) {
		Automobile automobile1 = new Bus(new Produce(), new Assemble());
		automobile1.manufacture();
		
		Automobile automobile2 = new Taxi(new Produce(), new Assemble());
		automobile2.manufacture();
		
		
	}
}
