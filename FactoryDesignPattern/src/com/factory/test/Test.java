package com.factory.test;

import com.factory.PizzaStore.PizzaStore;

public class Test { // 1 connect to  Store 
	
	//for testing main method is required
	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore();
		pizzaStore.orderPizza("veggi");
	
		// From Store connected to Factory
		// From Factory Connect TO 
	}
	
}
