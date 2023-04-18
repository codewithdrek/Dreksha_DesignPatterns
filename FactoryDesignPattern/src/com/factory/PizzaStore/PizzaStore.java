package com.factory.PizzaStore;

import com.factory.Interface.Pizza;
import com.factory.PizzaFactory.PizzaFactory;

public class PizzaStore { // 2 Connect to Factory

	// is store class me call interface not class in my case interface is PIZZA whic
	// is further connected to classes
	public  Pizza  orderPizza(String orderType) {
		//	Pizza p = null;
		Pizza p = PizzaFactory.createPizza(orderType);
		/*
		 * //If condition will be handled by Factory class so that Pizza store take
		 * responsibility of logics
		 * 
		 * if (orderType.equals("cheese")) { p = new CheesePizza();// now call Class
		 * which implements Interface
		 * 
		 * p = new MeatPizza(); } else { p = new VeggiPizza(); }
		 */
		
		// all 3 method define in Interface
		p.prepare();
		p.bake();
		p.cut();
		
		return p;

	}

}
