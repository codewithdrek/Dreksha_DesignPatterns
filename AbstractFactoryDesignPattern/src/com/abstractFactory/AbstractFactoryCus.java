package com.abstractFactory;

import com.Interface.Dao;

public abstract class AbstractFactoryCus {
	
 public	abstract Dao createDoc(String data);
	
	// this class is extended by both factories
	//having one abstract  method return type is Dao

}
