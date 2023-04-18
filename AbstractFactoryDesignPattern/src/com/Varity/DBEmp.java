package com.Varity;

import com.Interface.Dao;

public class DBEmp  implements Dao{

	@Override
	public void save() {
		  System.out.println("Save Emp in DB");
	}

}
