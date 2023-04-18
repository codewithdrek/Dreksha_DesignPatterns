package com.prototype;

public class TestClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		//from Shallow copy
		DeepCopyingGame game1 = new DeepCopyingGame();
		game1.setId(1);
		game1.setName("Dreksha");
		game1.setMembership(new Membership()); //Shallow copy obj refrence
		
		DeepCopyingGame game2 =game1.clone(); //save lot of time ,inpite of creting object from stract we can quickly create object
	
		
		System.out.println(""+game1);
		System.out.println(""+game2);
		
		//from deep copy (every time new object is created)
		DeepCopyingGame game3 =new DeepCopyingGame(game1);
		game3.setId(34);
		game3.setName("Deep");
		game3.setMembership(new Membership());
		System.out.println(game3);
		
		DeepCopyingGame game4 =new DeepCopyingGame(game3);
		game4.setId(3);
		game4.setName("FEE");
		game4.setMembership(new Membership());
		System.out.println(game4);
		
		//output
		  //membership=com.prototype.Membership@1cd072a9]
	      //Game [id=1, name=Dreksha, membership=com.prototype.Membership@1cd072a9]
		
		//see above output same obj came from shallow copy
		
		//Without toString() in Game class
		//com.prototype.Game@e580929
	    //	com.prototype.Game@1d251891

		//With toString
		//Game [id=1, name=Dreksha]
		//Game [id=1, name=Dreksha]
		
	}

	
}
