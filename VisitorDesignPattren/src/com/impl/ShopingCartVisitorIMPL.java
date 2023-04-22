package com.impl;

import com.VisitorClasses.Computer;
import com.VisitorClasses.Printer;
import com.interfaceD.ShopingCartVisitor;

public class ShopingCartVisitorIMPL implements ShopingCartVisitor {

	public int visit(Computer c) {
		int cost= 0;
		if(c.getPrice()>15000) {
			cost = c.getPrice()-50;
		}
		else {
			cost=c.getPrice();
		}
		System.out.println(c.getSerialNumber()+"::"+cost);
		return cost;

	}

	public int visit(Printer p) {
		int cost = p.getNoOfCartridge() + p.getPriceOfCartridge();
		System.out.print("Cost for model number" + p.getModelNumber() + " :" + cost);
		return cost;
	}
}
