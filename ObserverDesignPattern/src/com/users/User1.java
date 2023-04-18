package com.users;

import com.interfaceO.Observer;

public class User1 implements Observer {
//user are observer ,user observe channels on youtube
	@Override
	public void update(String msg) {
       System.out.println("I am user 1"+msg);
	}

}
