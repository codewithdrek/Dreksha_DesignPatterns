package com.VisitorClasses;

import com.interfaceD.Iteam;
import com.interfaceD.ShopingCartVisitor;

public class Computer implements Iteam{

	int cost;
	int serialNumber;
	
	public Computer(int cost, int serialNumber) {
		this.cost = cost;
		this.serialNumber = serialNumber;
	}
	
	public int getPrice(){
		return cost;
	}

	
	public int getSerialNumber() {
		return serialNumber;
	}


	@Override
	public int accept(ShopingCartVisitor shopingCartVisitor) {
		return shopingCartVisitor.visit(this);
	}

}
