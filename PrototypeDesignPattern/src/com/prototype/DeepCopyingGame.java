package com.prototype;

public class DeepCopyingGame implements Cloneable{

	int id;
	String name ;
	Membership membership;
	
	
	//clone method
	@Override 
	protected DeepCopyingGame clone() throws CloneNotSupportedException { //changed return type 
		// TODO Auto-generated method stub
		return (DeepCopyingGame)super.clone();
		//if we want to stop other to make a clone of my class then throw exception from return statment
		
	}
	
	//copy constructor
public DeepCopyingGame(DeepCopyingGame deepCopyingGame) {
	
	this.id=id;
	this.name=name;
	this.membership=new Membership();
} 
	
	public DeepCopyingGame() {
	// TODO Auto-generated constructor stub
}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Membership getMembership() {
		return membership;
	}
	public void setMembership(Membership membership) {
		this.membership = membership;
	}
	

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", membership=" + membership + "]";
	}
	
}
