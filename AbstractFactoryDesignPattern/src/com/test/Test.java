package com.test;

import com.Interface.Dao;
import com.abstractFactory.AbstractFactoryCus;
import com.factoryOfFactories.ProducerCus;

public class Test{

	public static void main(String[] args) {
		// AbstractFactoryCus af =ProducerCus.produce("xml");
		 //Dao dao = af.createDoc("emp");
		 //Dao dao = af.createDoc("Dept");
		 //dao.save();
		 
		 //DB 
		 AbstractFactoryCus af =ProducerCus.produce("DB");
		 Dao dao = af.createDoc("emp");
		// Dao dao = af.createDoc("Dept");
		 dao.save();
		 
		 
		
	}
}
