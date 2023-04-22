package com.interfaceD;

import com.VisitorClasses.Computer;
import com.VisitorClasses.Printer;

public interface ShopingCartVisitor {

	int visit(Computer c);
	int visit(Printer c);
}
