
package com.Test;

import com.OrdersType.OnlineOrder;
import com.OrdersType.StoreOrder;

public class Test {
	
	public static void main(String[] args) {
	
		//No need for showling Templet that is main concept of this pattern 
		//FixTemplet fixTemplet : hide fixTemplet
		StoreOrder storeOrder =new StoreOrder();
		storeOrder.processOrder();
		System.out.println("/n");
		
		OnlineOrder onlineOrder= new OnlineOrder();
		onlineOrder.isGiftWrap=true;
		onlineOrder.processOrder();
		
	}

}
