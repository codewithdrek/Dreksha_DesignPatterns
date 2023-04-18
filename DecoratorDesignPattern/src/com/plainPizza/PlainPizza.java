package com.plainPizza;

import com.interfacePizza.Pizza;

public class PlainPizza implements Pizza {

	@Override
	public void bake() {
    System.out.println("Backing plain pizza");
	}

}
