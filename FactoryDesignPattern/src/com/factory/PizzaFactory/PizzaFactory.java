package com.factory.PizzaFactory;

import com.factory.Interface.Pizza;
import com.factory.PizzaVarity.CheesePizza;
import com.factory.PizzaVarity.MeatPizza;
import com.factory.PizzaVarity.VeggiPizza;

public class PizzaFactory { // 3 connect to variety

	public static Pizza createPizza(String orderType) {
		// If condition will be handled by Factory class so that Pizza store take
		// responsibility of logics
		Pizza p = null;

		if (orderType.equals("cheese")) {
			p = new CheesePizza();// now call Class which implements Interface
		} else if (orderType.equals("meat")) {
			p = new MeatPizza();
		} else {
			p = new VeggiPizza();
		}
		return p;

	}

	// We have moved Object creation to Factory Class Basic Logic
}
