package com.factories;

import com.Interface.Dao;
import com.Varity.XMLDept;
import com.Varity.XmlEmp;
import com.abstractFactory.AbstractFactoryCus;

public class XMLFactory extends AbstractFactoryCus{

	public Dao createDoc(String type) {

		Dao d=null;
		
		if(type.equals("emp")) {
			d = new XmlEmp();
		}
		else if (type.equals("Dept")) {
			d= new XMLDept();
		}
		return d;
	}

	
}
