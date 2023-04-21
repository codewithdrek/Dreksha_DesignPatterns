package com.workshop;
import com.interfacev.WorkShop;

public class Assemble implements WorkShop {

	@Override
	public void work() {
		System.out.print("  Assembled");
	}

}
