package com.factory.PizzaVarity;

import com.factory.Interface.Pizza;

public class CheesePizza implements Pizza  {

	@Override
	public void bake() {
		System.out.println("Baking Cheese pizza");
	}

	@Override
	public void prepare() {
		System.out.println("preparing  Cheese Pizza");
	}

	@Override
	public void cut() {
		System.err.println("Cutting Cheese pizza");
	}

}
