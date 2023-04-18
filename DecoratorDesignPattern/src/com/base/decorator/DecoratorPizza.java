package com.base.decorator;

import com.interfacePizza.Pizza;

public class DecoratorPizza implements Pizza {

	
	//Decorator class
	//step 1 one pizza var
	//const set by this.
	//impl PIZZA
	//call plane pizza back then decorate
	Pizza pizza;
	
	public DecoratorPizza(Pizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public void bake() {
		pizza.bake();
 
	}

}

//one interface
//Pizza  ---I
//PlainPizza implements Pizza ---C
//Base DEcorator=decoratoePizza implemets Pizza ----c
// 2 Veggi and Cheese class extends BAse Decorator---C
//Test class  ----C

