package com.factoryOfFactories;

import com.abstractFactory.AbstractFactoryCus;
import com.factories.DBFactory;
import com.factories.XMLFactory;

public class ProducerCus {
  public static  AbstractFactoryCus produce(String factoryType) {
		AbstractFactoryCus af=null;
		if(factoryType.equals("xml")) {
			try {
				af= new XMLFactory();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (factoryType.equals("DB")) {
			af=new DBFactory();
		}
		return af;
	}
}
