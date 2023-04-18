package com.interfaceO;

public interface ChannelMovement {

	
	void register(Observer observer);
	void unregister(Observer observer);
	void notifyObserver(String msg);
	
}
