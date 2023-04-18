package com.factory.PizzaVarity;

import com.factory.Interface.Pizza;

public class VeggiPizza implements Pizza {

	@Override
	public void bake() {
		System.out.println("Baking Veggi pizza");
	}

	@Override
	public void prepare() {
		System.out.println("preparing Veggi Pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting Veggi pizza");
	}

}
