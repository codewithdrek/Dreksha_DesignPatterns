package com.Varity;

import com.Interface.Dao;

public class DBDept  implements Dao{

	@Override
	public void save() {
     System.out.println("Save Dept in DB ");		
	}

}
