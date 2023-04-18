package com.users;

import com.interfaceO.Observer;

public class User2 implements Observer {
//user are observer ,user observe channels on youtube
	@Override
	public void update(String msg) {
       System.out.println("I am user 2"+msg);
	}

}
