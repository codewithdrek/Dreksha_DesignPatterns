package com.varity.decorator;

import com.base.decorator.DecoratorPizza;
import com.interfacePizza.Pizza;

public class VeggiDecoratorPizza extends DecoratorPizza{

	public VeggiDecoratorPizza(Pizza pizza) {
		super(pizza);
	}
	
	public void bake() {
		super.bake();
		System.out.println("Adding Veggi Topping");
	}

}
