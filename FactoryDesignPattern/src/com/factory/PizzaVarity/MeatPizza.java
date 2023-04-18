package com.factory.PizzaVarity;

import com.factory.Interface.Pizza;

public class MeatPizza implements Pizza{

	@Override
	public void bake() {
		System.out.println("Baking Meat pizza");
	}

	@Override
	public void prepare() {
		System.out.println("preparing Meat Pizza");
	}

	@Override
	public void cut() {
		System.err.println("Cutting  Meatpizza");
	}

}
