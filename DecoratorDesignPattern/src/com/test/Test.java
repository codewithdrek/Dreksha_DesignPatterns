package com.test;

import com.interfacePizza.Pizza;
import com.plainPizza.PlainPizza;
import com.varity.decorator.CheeseDecoratorPizza;
import com.varity.decorator.VeggiDecoratorPizza;

public class Test {
	public static void main(String[] args) {
		
	    PlainPizza plainPizza = new PlainPizza(); plainPizza.bake();
		  
		Pizza pizza = new PlainPizza(); pizza.bake();
		 

		Pizza veggipizza = new VeggiDecoratorPizza(new PlainPizza());
		veggipizza.bake();
		
		Pizza cheesePizza= new CheeseDecoratorPizza(new PlainPizza());
		cheesePizza.bake();
	}
}
