package com.VisitorClasses;

import com.interfaceD.Iteam;
import com.interfaceD.ShopingCartVisitor;

public class Printer  implements Iteam{

	
	int priceOfCartridge;
	int noOfCartridge;
	int modelNumber;
	
	

	public Printer(int priceOfCartridge, int noOfCartridge, int modelNumber) {
		this.priceOfCartridge = priceOfCartridge;
		this.noOfCartridge = noOfCartridge;
		this.modelNumber = modelNumber;
	}



	public int getPriceOfCartridge() {
		return priceOfCartridge;
	}



	public int getNoOfCartridge() {
		return noOfCartridge;
	}



	public int getModelNumber() {
		return modelNumber;
	}




	@Override
	public int accept(ShopingCartVisitor shopingCartVisitor) {
		return shopingCartVisitor.visit(this);
	}

}
