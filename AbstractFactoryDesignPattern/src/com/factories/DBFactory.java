package com.factories;

import com.Interface.Dao;
import com.Varity.DBDept;
import com.Varity.DBEmp;
import com.abstractFactory.AbstractFactoryCus;

public class DBFactory extends AbstractFactoryCus {

	public Dao createDoc(String type) {

		Dao d=null;
		
		if(type.equals("emp")) {
			d = new DBEmp();
		}
		else if (type.equals("Dept")) {
			d= new DBDept();
		}
		return d;
	}

}
