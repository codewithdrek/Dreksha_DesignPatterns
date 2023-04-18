package com.varity.decorator;

import com.base.decorator.DecoratorPizza;
import com.interfacePizza.Pizza;

public class CheeseDecoratorPizza  extends DecoratorPizza{

	public CheeseDecoratorPizza(Pizza pizza) {
		super(pizza);
	}
	
	public void bake() {
		super.bake();
		System.out.println("Adding chesse topping");
	}

}
